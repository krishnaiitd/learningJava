public class LinkedListMain {


    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

//        public String toString() {
//            return item + " -> " + next;
//        }
    }

    private static class LinkedList<E> {
        private Node<E> head;

        private void addAtFirst(Node node) {
            if (this.head == null) {
                this.head = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
        }

        private void addAtLast(Node node) {
            if (this.head == null) {
                this.head = node;
            } else {
                Node temp = this.head;
                while (temp.next != null) {
                    System.out.println("Processing the node item " + temp.item);
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        public void printLinkedList() {
//            System.out.println(this.head);
            Node temp  = this.head;
            while (temp != null) {
                System.out.print(temp.item + "->");
                temp = temp.next;
            }
            System.out.println("Null");

        }

    }

    private Node head = null;


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        Node node = new Node<String>("4", null);
        Node node1 = new Node<String>("33", null);
        Node node2 = new Node<String>("89", null);
        Node node3 = new Node<String>("93", null);

        linkedList.addAtLast(node);
        linkedList.printLinkedList();
        linkedList.printLinkedList();

        linkedList.addAtLast(node1);
        linkedList.printLinkedList();
        System.out.println(isCircularLinkedList(linkedList));



        linkedList.addAtLast(node2);
        linkedList.printLinkedList();

        linkedList.addAtLast(node3);
        linkedList.printLinkedList();

        // Below addition of node 3 at first make the linkedList in circular linkedList.
        linkedList.addAtFirst(node3);
//        linkedList.printLinkedList();
        System.out.println(isCircularLinkedList(linkedList));


    }

    public static Boolean isCircularLinkedList(LinkedList linkedList) {
        Node temp1 = linkedList.head;
        Node temp2 = linkedList.head;

        while (temp1 != null & temp2 != null) {
            temp1 = temp1.next;
            if (temp2.next == null) {
                return false;
            } else {
                temp2 = temp2.next.next;
            }

            if (temp1 == temp2) {
                return true;
            }
        }

        return  false;

    }


}
