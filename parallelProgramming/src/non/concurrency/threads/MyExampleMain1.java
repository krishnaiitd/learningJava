package non.concurrency.threads;

import java.util.Date;

public class MyExampleMain1 {

  public static void main(String[] args) {

    long start = new Date().getTime();

    for (int i = 0; i < 500; i++) {
      MyExample1 myExample1 = new MyExample1(10000000L + i);
      myExample1.reciprocalSum();
    }

    long end = new Date().getTime();
//Total time consumed is ms 6945 --> with the MyRunnableExampleMain1
    System.out.println("Total time consumed is ms " + (end - start));
//    With this calss: Total time consumed is ms 49333

  }

}
