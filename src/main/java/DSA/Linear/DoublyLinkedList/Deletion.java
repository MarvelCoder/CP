package DSA.Linear.DoublyLinkedList;

public class Deletion<T> {

	public ListNode<T> head = null;
	public ListNode<T> tail = null;
	
	public void removeFromBeginning(Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;

		ListNode<T> temp = head;
		
		if(head!=null) {
			
			head = head.next;
			temp.next = null;
		}
		
		obj.head = head;
		obj.tail = tail;
	}
	
	public void removeFromEnd(Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;
		
		ListNode<T> temp = tail;
		
		if(head!=null) {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		
		obj.head = head;
		obj.tail = tail;
	}
	
	public void removeFromPosition(int index,Insertion<T> obj) {
		
		head = obj.head;
		tail = obj.tail;

		ListNode<T> temp = head;
		ListNode<T> ptr = head.next;
		
		for(int i=0;i<index-2;i++) {
			temp = temp.next;
			ptr = ptr.next;
		}
		
		temp.next = ptr.next;
		ptr.prev = null;
		ptr.next = null;
		
	}
	
	public static void main(String[] args) {
		
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
