package pp.Linkedlist;

public class SinglyLinkedList {
	private Node head;
	private int length = 0;
	
	public SinglyLinkedList() {
		length = 0;
	}
	
	public Node getHead() {
		return head;
	}
	public int getLength() {
		return length;
	}
	
	/*
	 * INSERT OPERATIONS
	 */
	
	//INSERT AT BEGINING
	public void insertAtBegin(Node node) {
		node.setNext(head);
		head = node;
		length++;
	}
	
	//INSERT AT END
	public void insertAtEnd(Node node) {
		if(head == null) {
			head = node;
		}
		else {
			 Node p,q;
			 for(p=head;(q=p.getNext())!=null; p=q){
				 p.setNext(node);
			 }
		}
		length++;
	}
	
	//INSERT AT A POSITION
	public void insertAt(int data, int position) {
		if(head==null) {
			head = new Node(data);
		}
		else if(position==0){
			Node temp = new Node(data);
			temp.setNext(head);
			head = temp;
		}
		else {
			Node temp = head;
			for(int i=1; i<position; i+=1) {
				temp = temp.getNext();
			}
			Node newNode = new Node(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;
	}
	
	/*
	 * DELETE OPERATIONS
	 */
	public Node removeFromBegin() {
		Node node = head;
		if(node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		return node;
	}

}
