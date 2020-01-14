package javaStrings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Arithmetic {
  abstract int add(int a, int b);
}

class Adder extends Arithmetic {
  public int add(int b, int a) {
    return a + b;
  }
}

public class TagContentExtractor {


  public static void main(String[] args) {

    Adder a = new Adder();
    System.out.println(a.getClass().getSuperclass().getName());
    System.out.println(a.add(10, 19));


  System.exit(0);
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while (testCases > 0) {
      String line = in.nextLine();

      //Write your code here

      Pattern pattern = Pattern.compile("(<[a-zA-Z0-9]+>)\\1");

      Matcher matcher = pattern.matcher(line);
      System.out.println(matcher);
      while (matcher.find()) {
        System.out.println(matcher.group());
      }

      testCases--;
    }
  }
}
