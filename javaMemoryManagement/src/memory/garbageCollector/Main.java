package memory.garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    long availableBytes = runtime.freeMemory();
    System.out.println("Available memory " + availableBytes / 1024 + " k");
    // Let's create tons of garbage....
    List<Customer> customerList = new ArrayList<>();
    int i = 0;
    while (true) {
      //for (int i = 0; i < 10000; i++) {
      Customer c;
      c = new Customer("John", 90);
      if (i > 0 && i % 100 == 0) {
        for (int j = 0; i < 10; j++) {
          customerList.remove(i / 2 - j);
        }
      }
      customerList.add(c);
      i++;
    }

//    availableBytes = runtime.freeMemory();
//    System.out.println("Available memory " + availableBytes / 1024 + " k");
//    System.gc();
//    availableBytes = runtime.freeMemory();
//    System.out.println("Available memory " + availableBytes / 1024 + " k");

  }
}
