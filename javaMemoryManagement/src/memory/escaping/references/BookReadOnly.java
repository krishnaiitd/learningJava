package memory.escaping.references;

public interface BookReadOnly {

    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    // Check the Price is immutable Object or not ??
    Price getPrice();
}
