package DSA.Linear.StackUsingArray;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		
		stack.push(60);
		stack.push(50);
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(10);

		stack.display();
	
		stack.pop();
		stack.pop();
		
		stack.display();
		
		stack.push(100);
		stack.push(90);
		stack.push(80);
		
		stack.display();
		
	}

}
