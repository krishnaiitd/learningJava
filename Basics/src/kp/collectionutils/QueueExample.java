package kp.collectionutils;


import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class QueueExample {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>(); // creating priority queue
        queue.add("Amit");                                       // adding elements
        queue.add("Rachit");
        queue.add("Rahul");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        TreeMap<String, String> ob = new TreeMap<>();
        ob.put("a", "krishna");
        ob.put("b", "krishna");
        ob.put("c", "krishna");

        for (Map.Entry<String, String> e : ob.entrySet()) {
            System.out.println(e);
            System.out.println(e.getValue());
            System.out.println(e.getKey());
            System.out.println(e.toString());
        }
    }

}

