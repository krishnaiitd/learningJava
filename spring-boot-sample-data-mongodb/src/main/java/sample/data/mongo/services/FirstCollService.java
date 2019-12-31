package sample.data.mongo.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import sample.data.mongo.models.FirstColl;
import sample.data.mongo.repository.FirstCollRepository;

public class FirstCollService {

  @Autowired
  FirstCollRepository firstCollRepository;

  public void getFirstCollById() {
    String id = "573fcafd-584d-447c-a762-53567283b2b0";
    Optional<FirstColl> firstColl = firstCollRepository.findById(id);
    if(firstColl.isPresent()) {
      System.out.println(firstColl.get());
    } else {
      System.out.println("No record found");
    }
  }

}
