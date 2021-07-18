package com.ds.chanllenges;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapExample1 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    Map<String, Integer> phoneBook = new HashMap<>();
    for(int i=0;i<n;i++)
    {
      String name=in.nextLine();
      int phone=in.nextInt();
      phoneBook.put(name, phone);
    }

    in.nextLine();
    while(in.hasNext())
    {
      String s=in.nextLine();
      if (phoneBook.containsKey(s)) {
        System.out.println(s + "=" + phoneBook.get(s));
      } else {
        System.out.println("Not found");
      }
    }
  }
}
