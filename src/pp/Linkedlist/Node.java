package pp.Linkedlist;

public class Node {
	private int data;
	private Node next;
	
	//parameterized constructor
	public Node(int data) {
		this.data = data;
	}
	
	//getter and setter
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node node) {
		this.next = node;
	}

}
