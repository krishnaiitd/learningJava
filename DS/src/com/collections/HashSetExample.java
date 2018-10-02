package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String args[]) {
        System.out.println("Hello HashMap Example");

        // Properties
        // #1. HashSet cannot contain duplicate values.
        // #2. HashSet allows null value.
        // #3. HashSet is an unordered collection. It does not maintain the order in which the elements are inserted.
        // #4. HashSet internally uses a HashMap to store its elements.
        // #5. HashSet is not thread-safe. If multiple threads try to modify a HashSet at the same time, then the final outcome is not-deterministic. You must explicitly synchronize concurrent access to a HashSet in a multi-threaded environment.

        // Create Hash Set
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Krishna");
        hashSet.add("Prasad");
        System.out.println(hashSet);
        // Adding duplicate elements will be ignored
        hashSet.add("Prasad");


//        Constructors in HashSet:
//
//        HashSet h = new HashSet();
//        Default initial capacity is 16 and default load factor is 0.75.
//                HashSet h = new HashSet(int initialCapacity);
//        default loadFactor of 0.75
//        HashSet h = new HashSet(int initialCapacity, float loadFactor);
//        HashSet h = new HashSet(Collection C);
//        Example: If internal capacity is 16 and load factor is 0.75 then, number of buckets will automatically get increased when the table has 12 elements in it.



    }
}
