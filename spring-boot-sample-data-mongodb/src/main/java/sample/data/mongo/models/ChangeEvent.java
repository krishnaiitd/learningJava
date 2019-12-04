package sample.data.mongo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ChangeEvents")
public class ChangeEvent {

  @Id
  private String _id;
  private Date changedOn;
  private String bappid;

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public Date getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(Date changedOn) {
    this.changedOn = changedOn;
  }

  public String getBappid() {
    return bappid;
  }

  public void setBappid(String bappid) {
    this.bappid = bappid;
  }

  @Override
  public String toString() {
    return "ChangeEvent{" +
        "_id='" + _id + '\'' +
        ", changedOn=" + changedOn +
        ", bappid='" + bappid + '\'' +
        '}';
  }
}
