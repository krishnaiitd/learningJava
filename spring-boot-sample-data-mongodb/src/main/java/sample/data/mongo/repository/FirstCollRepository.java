package sample.data.mongo.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import sample.data.mongo.models.FirstColl;

public interface FirstCollRepository extends MongoRepository<FirstColl, String> {

  Optional<FirstColl> findById(String id);

}
