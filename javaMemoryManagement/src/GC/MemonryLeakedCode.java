package GC;

public class MemonryLeakedCode {

  public static void main(String[] args) {

    int index = 0;
    while (true) {
      String uuid = UUIDGenerator.nextUUID();
      if (index % 1000000 == 0) {
        System.out.println(uuid);
      }
      index++;
    }
  }

}
