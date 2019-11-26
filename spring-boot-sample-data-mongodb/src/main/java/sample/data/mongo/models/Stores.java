package sample.data.mongo.models;

import java.util.List;
import org.springframework.data.annotation.Id;

public class Stores {

  @Id
  private String id;
  private List<String> fruits;
  private List<String> vegetables;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<String> getFruits() {
    return fruits;
  }

  public void setFruits(List<String> fruits) {
    this.fruits = fruits;
  }

  public List<String> getVegetables() {
    return vegetables;
  }

  public void setVegetables(List<String> vegetables) {
    this.vegetables = vegetables;
  }

  @Override
  public String toString() {
    return "Stores{" +
        "id='" + id + '\'' +
        ", fruits=" + fruits +
        ", vegetables=" + vegetables +
        '}';
  }
}
