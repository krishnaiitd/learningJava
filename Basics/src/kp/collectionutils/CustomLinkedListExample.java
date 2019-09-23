package kp.collectionutils;


public class CustomLinkedListExample<E> {

    public CustomLinkedListExample() {
    }

    private static class Link<E> {
        E item;
        Link<E> next;

        Link(E item, Link<E> node) {
            this.item = item;
            next = node;
        }
    }

    transient Link<E> head = null;

    transient static int size = 0;


    public void addAtFirst(E item) {
        head = new Link<E>(item, head);
        this.size++;
    }

    public void addAtLast(E item) {
        Link<E> node = new Link(item, null);
        if (head == null) {
            head = node;
        } else {
            Link<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

        this.size++;
    }

    public void addBeforeIndex(int index, E item) {
        if (index > this.size) {
            System.out.println("Current length of the linkedList is " + this.size);
            return;
        }

        if (index == 0 | head == null) {
            this.head = new Link<E>(item, null);
            return;
        }

        if (index == 1 | head.next == null) {
            head.next = new Link<E>(item, null);
            return;
        }

        int counter = 0;
        Link<E> current = this.head;
        Link<E> previous = this.head;
        while (counter < index) {
            previous = current;
            current = current.next;
            counter++;
        }

        Link<E> newNode = new Link<E>(item, null);
        newNode.next = current;
        previous.next = newNode;
    }

    public void addAfterIndex(int index, E item) {
        if (index > this.size) {
            System.out.println("Current length of the linkedList is " + this.size);
            return;
        }

        if (index == 0 | head == null) {
            this.head = new Link<E>(item, null);
            return;
        }

        if (index == this.size) {
            head.next = new Link<E>(item, null);
            return;
        }

        int counter = 0;
        Link<E> current = this.head;
        Link<E> previous = this.head;
        while (counter < index + 1) {
            previous = current;
            current = current.next;
            counter++;
        }

        Link<E> newNode = new Link<E>(item, null);
        newNode.next = current;
        previous.next = newNode;
    }

    public void DisplayElements() {
        Link<E> current = head;
        System.out.println("\n");
        while (current != null) {
            System.out.print(current.item + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("\n");
    }


}
