package com.ds.chanllenges;

public class Java1DArray {

  public static void main(String[] args) {
    int[] myArray = new int[4];
//    This sets aside a block of memory that's capable of storing 4 integers. Each integer storage
//    cell is assigned a unique index ranging from  to one less than the size of the array, and each
//    cell initially contains a 0 . In the case of myArray, we can store integers at indices 0, 1, 2
//    and 3. Let's say we wanted the last cell to store the number 100; to do this, we write:
    myArray[3] = 100;
    System.out.println(myArray[3]);
    for(int i =0; i <myArray.length; i++) {
      System.out.println("value at " + i + " is " +myArray[i]);
    }
  }
}
