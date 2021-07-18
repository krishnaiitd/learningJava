package com.ds.chanllenges;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import javafx.scene.effect.SepiaTone;

public class JavaDequeue {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.add(num);
    }
    Object[] array = new Object[deque.size()];
    array = deque.toArray(array);
    System.out.println(deque);
    int maxUnique = 0;
    for(int i = 1; i <= n; i++) {
      System.out.println("i " + i);
      if (m+i > n) {
        break;
      }
      Deque fDeque = subArray(array, i, m+i);

//      Deque lDeque = subArray(array, n-m-i, n-i);
      HashSet<Integer> mp = new HashSet<>();
      mp.addAll(fDeque);
      if (maxUnique > mp.size()) {
        maxUnique = mp.size();
      }
//      mp.clear();
//      mp.addAll(lDeque);
//      if (maxUnique > mp.size()) {
//        maxUnique = mp.size();
//      }
    }

    System.out.println("Unique " + maxUnique);
  }

  // Generic function to get sub-array of a non-primitive array
  // between specified indices
  public static<T> Deque subArray(T[] array, int start, int end) {
    return new ArrayDeque(Arrays.asList(Arrays.copyOfRange(array, start, end + 1)));
  }


}
