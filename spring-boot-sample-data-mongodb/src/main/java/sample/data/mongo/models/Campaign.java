package sample.data.mongo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "campaign")
public class Campaign {

  @Id
  private String id;

  @Indexed
  @TextIndexed(weight = 1f)
  private String name;

  private String mediaLink;

  private String imageLink;

  @TextIndexed(weight = 2f)
  private String text;
  @TextIndexed(weight = 2f)
  private String target;
  private String ownerId;     // Who can modify this except "MANAGER"
  private String useScope;   // Who can Use this Campaign [me, dl, all] i.e. Visibility
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date startOn;      // @ this date the campaign becomes available and usable
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date expireOn;      // @ this date the campaign becomes expired and not usable
  private Date timestamp;

  // Inserted the below records for verification purposes
  //db.campaign.insert({name:"Krishna", mediaLink:"www.abc.com", imageLink:"www.image.abc.com/a.jpg",
  // text: "Hello this is text field", target: "this is target one",ownerId:"12", startOn: new ISODate() }])


  @Override
  public String toString() {
    return "Campaign{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", mediaLink='" + mediaLink + '\'' +
        ", imageLink='" + imageLink + '\'' +
        ", text='" + text + '\'' +
        ", target='" + target + '\'' +
        ", ownerId='" + ownerId + '\'' +
        ", useScope='" + useScope + '\'' +
        ", startOn=" + startOn +
        ", expireOn=" + expireOn +
        ", timestamp=" + timestamp +
        '}';
  }

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

  public String getMediaLink() {
    return mediaLink;
  }

  public void setMediaLink(String mediaLink) {
    this.mediaLink = mediaLink;
  }

  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getUseScope() {
    return useScope;
  }

  public void setUseScope(String useScope) {
    this.useScope = useScope;
  }

  public Date getStartOn() {
    return startOn;
  }

  public void setStartOn(Date startOn) {
    this.startOn = startOn;
  }

  public Date getExpireOn() {
    return expireOn;
  }

  public void setExpireOn(Date expireOn) {
    this.expireOn = expireOn;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
}
