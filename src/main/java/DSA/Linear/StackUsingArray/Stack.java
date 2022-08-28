package DSA.Linear.StackUsingArray;

public class Stack {

	int n = 10;
	int a[] = new int[n];
	
	int top = -1;
	
	void push(int data) {
		
		if(top==n-1) {
			System.out.println("Stack Overflow");
		}else {
			top++;
			a[top] = data;
		}
	}
	
	void pop() {
		
		if(top==-1) {
			System.out.println("Stack Underflow");
		}else {
			top--;
		}
		
	}
	
	void display() {
		System.out.println("Stack Items are:");
		for(int i = top;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
