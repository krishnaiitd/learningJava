package javaStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class RegexExamples {

  public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
    String a = "                        ";//sc.next();
//        String b = sc.next();
//        sc.close();
//        System.out.println(isAnagram("anagramm", "marganaa"));
//        System.exit(0);


    a = a.trim();
    java.util.List<String> alist = Arrays.asList(a.split("[!,?._'@\\s]+"));
    System.out.println(alist);
    System.out.println(alist.size());
    System.out.println(alist.isEmpty());
    List<String> aaa = new ArrayList<>();
    System.out.println(aaa.isEmpty());
    if (a.isEmpty()) {
      System.out.println("aaaaaaaaaa");
    }
    System.out.println(aaa.size());

    a.charAt(0);
    a = a.toLowerCase();
    System.out.println(a);
    java.util.Map<Character, Integer> aMap = new HashMap<>();
    java.util.Map<Character, Integer> bMap = new HashMap<>();
    System.out.println(aMap.getOrDefault('a', 0));
    for(int i =0; i < a.length() -1; i++) {
      aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
      bMap.put(a.charAt(i), bMap.getOrDefault(a.charAt(i), 0) + 1);
    }

    System.out.println(aMap);
    System.out.println(bMap);
    if (aMap.equals(bMap)) {
      System.out.println("Two maps are equals");
    } else {
      System.out.println("Not equals");
    }
    System.exit(0);
    int[] sample = new int[]{1,20,3,4,5};
    System.out.println("list: " + sample);
    int size = sample.length;
    int[] reverseSample = IntStream.range(0,size).map(i -> sample[size-i-1])
        .toArray();

//        Arrays.stream(reverseSample).map(i -> System.out.println(i));
    System.out.println("updated list " + reverseSample.toString());

  }
}
