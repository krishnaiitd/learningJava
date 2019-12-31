package sample.data.mongo.services;

import org.springframework.data.mongodb.core.query.Query;

public class CustomFindPreparator extends Query {

  private String jsonOperation;

  public CustomFindPreparator(String jsonOperation) {
    this.jsonOperation = jsonOperation;
  }
}