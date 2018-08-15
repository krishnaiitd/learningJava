package kp.collectionutils;

import java.util.LinkedList;

public class LinkedlistExample {

    public static void main(String[] args) {

        System.out.println(args);


        LinkedList<String> ll = new LinkedList<>();


        ll.add("KP");
        ll.addFirst("aa");
        ll.addLast("last");


        System.out.println(ll.get(0));

        System.out.println(ll.element());

        System.out.println(ll.peek());

        System.out.println(ll.pop());

        ll.push("ABBBBB");

        System.out.println(ll.element());
    }
}
