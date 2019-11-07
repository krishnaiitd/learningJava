package memory.examples;

import java.util.ArrayList;
import java.util.List;

public class SharingData {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        String one = myList.get(0);
        System.out.println(one);
        one = one + " changed";
        System.out.println(one);
        printList(myList);
        printListLocalAccess(myList);
    }

    public static void printList(List<String> data) {
        System.out.println(data.getClass());
        System.out.println(data);
    }

    public static void printListLocalAccess(List<String> data) {
        String value = data.get(1);
        System.out.println(value);
        value = "Changed from Two to this values";
        System.out.println(value);
        data.add("Four");
        printList(data);
    }
}
