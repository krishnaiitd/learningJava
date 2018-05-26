package ds.linkedList.example;

public class TestCustomLinkedList {

	public static void main(String args[]) {

		// Creating object of class linked list
		customLinkedList linkList = new customLinkedList();
		linkList.add("Hello");
		linkList.add("last");
		linkList.addAtLast("last 2");
		linkList.addAtLast("last 3");
		linkList.addAtFirst("Hello at first");
		linkList.add("final last");
		linkList.addAtFirst("final first");

		linkList.printLinkedList();
		System.out.println("======");
		linkList.removedFromFirst();
		linkList.printLinkedList();

		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();
		

		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();

		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();

		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();

		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();
		
		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();
		
		System.out.println("======");
		linkList.removedFromLast();
		linkList.printLinkedList();
		
//		System.out.println("Linked list: " + linkList);
//		linkList.removeFirst();
//		System.out.println("Linked list: " + linkList);
//		linkList.removeLast();
//		System.out.println("Linked list: " + linkList);

	}
}
