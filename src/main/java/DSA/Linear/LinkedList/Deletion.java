package DSA.Linear.LinkedList;

public class Deletion<T> {

	Node<T> head = null;
	
	public void removeFromBeginning(Insertion<T> obj) {
		
		Node<T> head = obj.head;
		
		Node<T> ptr = head;

		head = head.next;
		ptr.next = null;
		
		obj.head = head;
	}
	
	
	public void removeFromEnd(Insertion<T> obj) {
		
		Node<T> head = obj.head;
		
		Node<T> ptr = head;
		
		while(ptr.next.next!=null) {
			ptr = ptr.next;
		}
		
		ptr.next = null;
		
	}
	
	public void removeFromPosition(int index,Insertion<T> obj) {
		
		Node<T> head = obj.head;
		
		Node<T> ptr = head;
		
		Node<T> temp = null;
		
		int count = 1;
		
		if((index-count)==0) {
			removeFromBeginning(obj);			
		}else {
			while((index-count)!=1) {
				ptr = ptr.next;
				count++;
			}			
		}
		
		temp = ptr.next;
		ptr.next = temp.next;
		temp.next = null;
	}

	
	public static void main(String[] a) {
		
		Insertion<Integer> obj1 = new Insertion<>();
		
		obj1.addInBeginning(70);
		obj1.addInBeginning(60);
		obj1.addInBeginning(50);
		obj1.addInBeginning(40);
		obj1.addInBeginning(30);
		obj1.addInBeginning(20);
		obj1.addInBeginning(10);
		
		System.out.print("Insertion in Beginning : ");
		
		obj1.display();
		
		System.out.println();
		
		Deletion<Integer> obj2 = new Deletion<>();
		
		obj2.removeFromBeginning(obj1);
		
		System.out.print("Deletion from Beginning : ");
		
		obj1.display();
		
		System.out.println();
		
		obj2.removeFromEnd(obj1);
		
		System.out.print("Deletion from End : ");
		
		obj1.display();
		
		System.out.println();
		
		obj2.removeFromPosition(3,obj1);
		
		System.out.print("Deletion from position 3: ");
		
		obj1.display();
		
		System.out.println();

	}
}
