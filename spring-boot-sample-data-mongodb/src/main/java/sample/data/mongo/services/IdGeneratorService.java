package sample.data.mongo.services;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.mongodb.core.FindAndModifyOptions;
    import org.springframework.data.mongodb.core.MongoTemplate;
    import org.springframework.data.mongodb.core.query.Criteria;
    import org.springframework.data.mongodb.core.query.Query;
    import org.springframework.data.mongodb.core.query.Update;
    import org.springframework.stereotype.Service;
    import sample.data.mongo.models.IdGenerator;
    import sample.data.mongo.repository.IdGeneratorRepository;

    @Service
    public class IdGeneratorService {

      @Autowired
      private IdGeneratorRepository idGeneratorRepository;

      @Autowired
      private MongoTemplate mongoTemplate;

      public long generateId(String key) {

        Query query = new Query();
        // key = identified_by_Id;
        Criteria criteria = new Criteria("identifier").is(key);
        query.addCriteria(criteria);

        Update update = new Update();
        update.inc("counter", 1);

        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);

        IdGenerator idGenerator = mongoTemplate
            .findAndModify(query, update, options, IdGenerator.class);

        return idGenerator.getCounter();
      }
    }
