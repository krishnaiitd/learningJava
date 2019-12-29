package sample.data.mongo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import sample.data.mongo.models.Campaign;

public interface CampaignRepository extends MongoRepository<Campaign, String> {

   @Query("{$and:[ {'ownerId': ?0} , {'$text' : { '$search' : ?1}} ]}")
   Page<Campaign> searchByByOwnerIdAndText(String ownerId, String keywords,
   Pageable page);

}
