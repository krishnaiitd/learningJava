package com.ds.chanllenges;

import java.util.Scanner;

public class Java2DArray {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] twoDArray = new int[5][2];
    System.out.println(twoDArray.length);
    System.out.println(twoDArray[0].length);
    for(int i =0; i< twoDArray.length; i++) {
      for(int j =0; j <twoDArray[i].length; j++) {
        System.out.print("\t\t"  + twoDArray[i][j]);
      }
      System.out.println("");
    }


    int[][] arr = new int[6][6];

    for (int i = 0; i < 6; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 6; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }
    int maxSum = Integer.MIN_VALUE;
    for(int i =0; i< 6; i++) {
      for(int j =0; j<6; j++) {
        if(i > 1 && j > 1) {
          int sum = arr[i-2][j-2] + arr[i-2][j-1] + arr[i-2][j]
              + arr[i-1][j-1]
              + arr[i][j-2] + arr[i][j-1] + arr[i][j];
          if (sum > maxSum) {
            maxSum = sum;
          }
        }

      }

    }
    System.out.println(maxSum);


    scanner.close();
  }
}
