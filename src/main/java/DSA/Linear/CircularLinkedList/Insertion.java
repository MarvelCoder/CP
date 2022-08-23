package DSA.Linear.CircularLinkedList;

public class Insertion<T> {

		LNode<T> head = null;
		LNode<T> tail = null;
	
	public void addInBeginning(T data) {
				
		LNode<T> node = new LNode<>(data);
	
		if(head == null) {
			head = node;
			tail = node;
			head.next = node;
		}else {
			node.next = head;
			head = node;
			tail.next = node;
		}
	}
	
	public void addInEnd(T data) {
		
		LNode<T> node = new LNode<>(data);
		
		tail.next = node;
		tail = node;
		tail.next = head;
	}
	
	
	public void addAtPosition(int index, T data) {
		
		LNode<T> node = new LNode<>(data);
		
		LNode<T> ptr = head;
		
		for(int i = 0;i<index-2;i++) {
			ptr = ptr.next;
		}
		
		node.next = ptr.next;
		ptr.next = node;
	}
	
	public void display() {
		
		LNode<T> ptr = head;
		
		do {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;			
		}
		while(ptr!=head);
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
