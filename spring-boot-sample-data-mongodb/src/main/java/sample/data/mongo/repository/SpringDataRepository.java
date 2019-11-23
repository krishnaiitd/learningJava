package sample.data.mongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import sample.data.mongo.models.Springdata;

public interface SpringDataRepository extends MongoRepository<Springdata, String> {

//  @Query("{ 'organization' : { $regex: ?0 } }")
//  List getDataByQueryRegex(String regexp);

  @Query("{'organization' : ?0, 'active' : true, 'fields' : {$elemMatch : {'key' : ?1, 'value' : {$regex : ?2, $options: 'i'}}}}")
  List<Springdata> findFieldDataByRegexMatch(String org, String key, String pattern);

  @Query("{'organization' : ?0, 'active' : true, 'fields' : {$elemMatch : {'key' : ?1, 'value' : {$regex : ?2, $options:'si'}}}}")
  List<Springdata> getDataByQueryAnnotation(String org, String key, String pattern);
}
