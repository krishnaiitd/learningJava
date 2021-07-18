package com.collections;

import java.util.PriorityQueue;

public class PrioritiesQueueExample {

  public static int getMinCost(int arr[]) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i =0; i < arr.length; i++) {
      pq.add(arr[i]);
    }

    int sum =0 ;

    while(pq.size() > 1) {
      int firstMin = pq.poll();
      int secondMin = pq.poll();
      int tempSum = firstMin + secondMin;
      pq.add(tempSum);
      sum += tempSum;
    }

    return sum;
  }

  public static void main(String[] args) {

    int len[] = { 4, 3, 2, 6 };

    System.out.println(getMinCost(len));

  }
}
