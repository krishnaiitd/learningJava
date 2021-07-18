package com.ds.chanllenges;

import java.util.LinkedList;
import java.util.Scanner;

public class ListExample1 {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      int value = sc.nextInt();
      list.add(value);
    }
    int Q = sc.nextInt();

    for (int i = 0; i < Q; i++) {
      String action = sc.next();
      if (action.equals("Insert")) {
        int index = sc.nextInt();
        int value = sc.nextInt();
        list.add(index, value);
      } else {
        int index = sc.nextInt();
        list.remove(index);
      }
    }
    sc.close();

    /* Print our updated Linked List */
    for (Integer num : list) {
      System.out.print(num + " ");
    }


  }
}
