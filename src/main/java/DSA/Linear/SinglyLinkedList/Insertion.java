package DSA.Linear.SinglyLinkedList;

public class Insertion<T> {

	Node<T> head = null;
	
	public void addInBeginning(T data) {
				
		Node<T> node = new Node<>(data);
	
		node.next = head;
		head = node;
	}
	
	public void addInEnd(T data) {
		
		Node<T> ptr = head;
		
		Node<T> node = new Node<>(data);
		
		while(ptr.next!=null) {
			ptr = ptr.next;
		}
		
		ptr.next = node;
		
		ptr = ptr.next;
		
	}
	
	
	public void addAtPosition(int index, T data) {
				
		int count = 1;
		Node<T> ptr = head;
		
		Node<T> node = new Node<>(data);
		
		if(index != 1) {
			while(ptr!=null) {
				
				if((index - count)==1) {
					node.next = ptr.next;
					ptr.next = node;
					break;
				}
				
				ptr = ptr.next;
				count++;
				
			};			
		}else {
			addInBeginning(data);
		}
		
		
	}
	
	public void display() {
		
		Node<T> ptr = head;
		
		while(ptr!=null) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		
	}
	
	public static void main(String[] args) {
		
		Insertion<Integer> obj = new Insertion<>();

		System.out.print("Insertion in Beginning : ");
		
		obj.addInBeginning(30);
		obj.addInBeginning(20);
		obj.addInBeginning(10);

		obj.display();
		
		System.out.println();

		System.out.print("Insertion in End : ");
		
		obj.addInEnd(40);
		
		obj.display();
		
		System.out.println();
		
		System.out.print("Insertion at position : ");
		
		obj.addAtPosition(5, 15);
		
		obj.display();
		
		System.out.println();

	}

}
