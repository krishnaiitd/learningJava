package com.ds.linkList;

import java.util.*;

public class javaLinkedList {

	public static void main(String args[]) {
		
		// Creating object of class linked list
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Hello");
		linkList.addFirst("first");
		linkList.addLast("last");
		linkList.add(1, "Added at index 1");
		

		System.out.println("Linked list: " + linkList);

		
		linkList.remove("first");
		System.out.println("Linked list: " + linkList);
		linkList.removeFirst();
		System.out.println("Linked list: " + linkList);
		linkList.removeLast();
		System.out.println("Linked list: " + linkList);
	
	}
}
