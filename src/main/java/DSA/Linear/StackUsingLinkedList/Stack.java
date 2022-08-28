package DSA.Linear.StackUsingLinkedList;

public class Stack<T> {

	ListNode<T> top;

	public void push(T data) {
		ListNode<T> node = new ListNode<>(data);		

		node.next = top;
		top = node;
	}
	
	public void pop() {
		ListNode<T> temp = top;
		
		if(top != null) {
			top = top.next;
			temp.next = null;
			System.out.println("Popped item :"+temp.data);
		}

	}

	public void display() {
		
		ListNode<T> temp = top;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] a) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(10);
		
		System.out.println("Stack items :");
		stack.display();
		
		stack.pop();
		System.out.println("Stack items :");
		stack.display();
		
		stack.pop();
		System.out.println("Stack items :");
		stack.display();
	}
	
}
