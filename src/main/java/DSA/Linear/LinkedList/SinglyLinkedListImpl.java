package DSA.Linear.LinkedList;

public class SinglyLinkedListImpl {
	
	Node head = null;

	public class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void insertionInStart(int data) {
				
		Node node = new Node(data);
		
		node.next = head;
		head=node;		
	}
	
	public void display() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String a[]) {
		
		SinglyLinkedListImpl list = new SinglyLinkedListImpl();
		
		list.insertionInStart(6);
		list.insertionInStart(6);
		list.insertionInStart(6);
		list.insertionInStart(6);
		list.insertionInStart(5);
		list.insertionInStart(4);
		list.insertionInStart(4);
		list.insertionInStart(3);
		list.insertionInStart(2);
		list.insertionInStart(1);
		
	
		list.display();
	}
}