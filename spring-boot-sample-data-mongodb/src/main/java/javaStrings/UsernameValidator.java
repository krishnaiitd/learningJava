package javaStrings;

import java.util.Scanner;

public class UsernameValidator {

  public static void main(String[] args) {

    final String regularExpression = "[a-zA-Z][A-Za-z_0-9]{7,30}";

    final Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());
    while (n-- != 0) {
      String userName = scan.nextLine();

      if (userName.matches(regularExpression)) {
        System.out.println("Valid");
      } else {
        System.out.println("Invalid");
      }
    }

  }
}
