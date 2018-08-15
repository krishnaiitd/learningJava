package kp.collectionutils;

public class CustomLinkedListExampleTest {


    public static void main(String[] args) {
        CustomLinkedListExample<String> ll = new CustomLinkedListExample<String>();


        ll.addAtFirst("Prasad");
        ll.addAtFirst("Krishna");
        ll.addAtFirst("Prasad");
        ll.addAtFirst("KP0");
        ll.addAtFirst("KP1");
        ll.addAtFirst("KP2");
        ll.addAtFirst("KP3");
        ll.addAtFirst("KP4");
        ll.addAtLast("Hello");
        ll.addAtFirst("Hello1");
        ll.addAfterIndex(7, "After Krishna");
        ll.addBeforeIndex(2, "before KP3");

        ll.DisplayElements();


        CustomLinkedListExample<Integer> linkedInteger = new CustomLinkedListExample<Integer>();

        linkedInteger.addAtFirst(10);
        linkedInteger.addAtLast(20);
        linkedInteger.addAtLast(30);
        linkedInteger.addAtLast(40);
        linkedInteger.addAtFirst(1);
        linkedInteger.DisplayElements();


    }
}
