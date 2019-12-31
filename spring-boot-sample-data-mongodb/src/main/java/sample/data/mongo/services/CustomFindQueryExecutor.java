package sample.data.mongo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import sample.data.mongo.models.Course;

@Service
public class CustomFindQueryExecutor {
  @Autowired
  private MongoTemplate mongoTemplate;

  public void RunCustomQuery() {
    String query2 = "{\"name\" : \"mathematics\"}";

    List<Course> courseList = (List<Course>) mongoTemplate.find(new CustomFindPreparator(query2), Course.class, "course");

    System.out.println(courseList);
  }
}
