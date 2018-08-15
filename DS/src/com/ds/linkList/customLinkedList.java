package com.ds.linkList;

public class customLinkedList {

	protected Node head;
	protected static int count;

	public customLinkedList() {
		this.head = null;
		count = 0;
	}

	public void add(String data) {
		// Add at last
		addAtLast(data);
	}

	public void addAtLast(String data) {

		if (head == null) {
//			System.out.println("head is null, inserting at head only");
			 head = new Node(data);
//			System.out.println(head);
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node(data));
		}
		count++;
	}

	public void addAtFirst(String data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = head;
			Node newNode = new Node(data);
			newNode.setNext(current);
			head = newNode;
		}
		count++;
	}

	public void printLinkedList() {
		System.out.println("total length of linked List: " + count);
		Node current = head;
		int index = 1;
		while (current != null) {
//			System.out.println(current);
			System.out.println("vale at: " + index + " is " + current.getData());
			current = current.getNext();
			index++;
		}
	}
	
	public void removedFromFirst() {
		if (head == null) {
			System.out.println("Nothing to remove");
		} else  {
			Node current = head;
			head = current.getNext();
			System.out.println("Removed the item: " + current.getData());
			count--;
		}
	}

	public void removedFromLast() {
		if (head == null) {
			System.out.println("Nothing to remove");
		} else {
			Node current = head;
			// if only one node
			if (current.getNext() == null) {
				head = null;
			} else {
				while (current.getNext().getNext() != null) {
					current = current.getNext();
				}
			}
			
			current.setNext(null);
			count--;
		}
	}
	
	public void removedByData(String data) {
		Node current = head;
		
		if (current == null) {
			System.out.println("Nothing to delete");
		} else {
			// matches at first place
			if (current.getData() == data) {
				head = current.getNext();
				count--;
			} else {
				Node previous = current;
				current = current.getNext();
				while (current != null || current.getData() != data) {
					previous = current;
					current = current.getNext();
				}
				Node dataNode = current;
			}
			
		}
	}
}
