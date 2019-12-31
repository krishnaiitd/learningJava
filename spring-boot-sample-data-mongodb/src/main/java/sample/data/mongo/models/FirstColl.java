package sample.data.mongo.models;

import org.springframework.data.annotation.Id;

public class FirstColl {

  @Id
  private String _id;

  private Data data;

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public Data getData() {
    return data;
  }

  @Override
  public String toString() {
    return "firstColl{" +
        "_id='" + _id + '\'' +
        ", data=" + data +
        '}';
  }

  public void setData(Data data) {
    this.data = data;
  }
}
