package DSA.Linear.CircularLinkedList;

public class Deletion<T> {
	
	public LNode<T> head;
	public LNode<T> tail;
	
	public void removeFromBeginning(Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;
		LNode<T> temp = head;
		
		head = head.next;
		temp.next = null;
		
		tail.next = head;
		
		obj.head = head;
		obj.tail = tail;
	}
	
	public void removeFromEnd(Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;
		
		LNode<T> temp = head;
		LNode<T> ptr = head.next;
		
		while(ptr!=tail) {
			temp=temp.next;
			ptr=ptr.next;
		}
		
		tail = temp;
		temp.next = head;
		ptr.next=null;
		
		obj.head = head;
		obj.tail = tail;
	}
	
	public void removeFromPosition(int index,Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;
		
		LNode<T> temp = head;
		LNode<T> ptr = head.next;
		
		for(int i=0;i<index-2;i++) {
			ptr = ptr.next;
			temp = temp.next;
		}
		
		temp.next = ptr.next;
		ptr.next = null;
		
		obj.head = head;
		obj.tail = tail;
	}
	
	public static void main(String []a) {
		
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
