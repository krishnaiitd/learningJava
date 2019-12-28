package sample.data.mongo.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {

  @Id
  private String id;

  private String name;

  private List<String> studentIds;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<String> studentIds) {
    this.studentIds = studentIds;
  }

  @Override
  public String toString() {
    return "Course{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", studentIds=" + studentIds +
        '}';
  }
}
