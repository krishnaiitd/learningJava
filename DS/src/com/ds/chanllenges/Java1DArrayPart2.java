package com.ds.chanllenges;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-1d-array/problem
public class Java1DArrayPart2 {


  public static boolean canWin(int leap, int[] game) {
    // Return true if you can win the game; otherwise, return false.
    //


//    6 5
//0 0 0 1 1 1

//    6 3
//0 0 1 1 1 0

    leap  = 5;
    game = new int[]{0, 0, 0, 1, 1, 1};

    System.out.println(leap);
    for(int i =0; i < game.length; i++) {
      System.out.print(game[i] + "\t");
    }
    System.out.println("\n====");
//    System.out.println(game.toString());
    boolean a = false;
    int index = 0;
    for (int i = 0; i < game.length; i++) {

//      System.out.println("a " +  a);
//      System.out.println("i " + i);
      if (index + leap < game.length && game[index + leap] == 0) {
        i= i + leap;
      }

      if (game[index] == 0) {
        i = i + 1;
      }
      if (index == game.length - 1) {
        a = true;
      }

      index++;

//      System.out.println("a " +  a);
//      System.out.println("i " + i);
    }
//    System.out.println("Out side for loop");
    return a;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //int q = scan.nextInt();
    //while (q-- > 0) {
//    5 3
//0 0 0 0 0
      int n = 5;//scan.nextInt();
      int leap = 3;//scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = 0;//scan.nextInt();
      }

      System.out.println((canWin(leap, game)) ? "YES" : "NO");
//    }
    scan.close();
  }
}

