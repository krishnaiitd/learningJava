package sample.data.mongo.models;

import java.util.List;

public class Springdata {

  private String organization;
  private boolean active;
  private List<Fields> fields;

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public List<Fields> getFields() {
    return fields;
  }

  public void setFields(List<Fields> fields) {
    this.fields = fields;
  }
}
