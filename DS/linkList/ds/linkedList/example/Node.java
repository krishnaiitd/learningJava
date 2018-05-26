package ds.linkedList.example;

public class Node {
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}

//	@Override
//	public String toString() {
//		return " =>Node [data=" + data + ", node=" + next + "] =>";
//	}
	
}
