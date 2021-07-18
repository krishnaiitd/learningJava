//package com.collections;
//
//import java.util.*;
//
//public class SortedMapExample {
//
//    public static void main(String args []) {
//        // SortedMap is an interface in collection framework.
//        // This interface extends Map inrerface and provides a
//        // total ordering of its elements (elements can be traversed
//        // in sorted order of keys). Exampled class that implements
//        // this interface is TreeMap.
//        System.out.println("SortedMap/SortedSet: Sort as per natural order or as per defined ");
//        SortedMap<String, String> sortedMap = new TreeMap<>();
//        sortedMap.put("1", "Krishna");
//        sortedMap.put("2", "Prasad");
//        sortedMap.put("0", "0th ele");
//        System.out.print("SortedMap: ");
//        System.out.println(sortedMap);
//        SortedSet<String> sortedSet = new TreeSet<>();
//        sortedSet.add("Krishna");
//        sortedSet.add("Prasad");
//        sortedSet.add("0th ele");
//        System.out.print("sortedSet: ");
//        System.out.println(sortedSet);
//
//
//
//        // LinkedHashSet - Maintained the insertion order
//        System.out.println("LinkedHashSet/LinkedHashMap: Maintained the insertion order");
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Krishna");
//        linkedHashSet.add("Prasad");
//        linkedHashSet.add("0th ele");
//        System.out.print("LinkedHashSet: ");
//        System.out.println(linkedHashSet);
//
//
//        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("1", "Krishna");
//        linkedHashMap.put("2", "Prasad");
//        linkedHashMap.put("0", "0th ele");
//        System.out.print("LinkedHashMap: ");
//        System.out.println(linkedHashMap);
//
//
//
//
//
//
//
//    }
//}
