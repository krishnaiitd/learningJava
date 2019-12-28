package GC;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UUIDGenerator {

  private static List<UUID> usedUUIDs = new ArrayList<>();

  public static String nextUUID() {
    UUID candidate = UUID.randomUUID();
    if (!usedUUIDs.contains(candidate)) {
      usedUUIDs.add(candidate);
    }
    return candidate.toString();
  }
}
