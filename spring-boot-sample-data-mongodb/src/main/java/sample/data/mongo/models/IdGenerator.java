package sample.data.mongo.models;

    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;

    @Document
    public class IdGenerator {

      @Id
      private String identifier;

      private long counter;

      public String getIdentifier() {
        return identifier;
      }

      public void setIdentifier(String identifier) {
        this.identifier = identifier;
      }

      public long getCounter() {
        return counter;
      }

      public void setCounter(long counter) {
        this.counter = counter;
      }
    }
