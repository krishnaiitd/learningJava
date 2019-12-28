package sample.data.mongo.models;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "calendriers")
public class CalendrierEntity {

  @Id
  private Long id;

  @NotNull
  private String label;

  @DBRef(lazy = true)
  @Getter(AccessLevel.NONE)
  private List<AbsenceEntity> absenceEntities;
}
