package sample.data.mongo.models;

import org.springframework.data.annotation.Id;

public class AbsenceEntity {
  @Id
  private String id;
  private String name;

}
