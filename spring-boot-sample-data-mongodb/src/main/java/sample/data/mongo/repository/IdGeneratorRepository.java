package sample.data.mongo.repository;

    import org.springframework.data.mongodb.repository.MongoRepository;
    import sample.data.mongo.models.IdGenerator;


    public interface IdGeneratorRepository extends MongoRepository<IdGenerator, String> {

    }
