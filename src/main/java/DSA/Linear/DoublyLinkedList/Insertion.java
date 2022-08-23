package DSA.Linear.DoublyLinkedList;

public class Insertion<T> {

	public ListNode<T> head;
	public ListNode<T> tail;
	
	
	public void addInBeginning(T data) {
		
		ListNode<T> node = new ListNode<>(data);
		
		if(head==null) {
			head = node;
			tail = node;
		}else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		
	}
	
	public void addInEnd(T data) {
		
		ListNode<T> node = new ListNode<>(data);
		
		ListNode<T> temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = node;
		node.prev = tail;
		tail = node;
	}
	
	public void addAtPosition(int index, T data) {
		
		ListNode<T> node = new ListNode<>(data);
		
		ListNode<T> temp = head;
		ListNode<T> ptr = temp.next;
		
		for(int i=0;i<index-2;i++) {
			temp = temp.next;
			ptr= ptr.next;
		}
		
		temp.next = node;
		ptr.prev = node;
		node.prev = temp;
		node.next = ptr;
		
	}
	
	public void display() {
		
		ListNode<T> ptr = head;
		
		while(ptr!=null) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args) {
		
		Insertion<Integer> obj = new Insertion<>();
		
		System.out.print("Insertion in Beginning : ");
		
		obj.addInBeginning(70);
		obj.addInBeginning(60);
		obj.addInBeginning(50);
		obj.addInBeginning(40);
		obj.addInBeginning(30);
		obj.addInBeginning(20);
		obj.addInBeginning(10);

		obj.display();
		
		System.out.println();

		System.out.print("Insertion in End : ");
		
		obj.addInEnd(80);
		
		obj.display();
		
		System.out.println();
		
		System.out.print("Insertion at position : ");
		
		obj.addAtPosition(5, 45);
		
		obj.display();
		
		System.out.println();
	}

}
