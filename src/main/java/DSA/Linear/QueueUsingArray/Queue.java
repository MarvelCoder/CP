package DSA.Linear.QueueUsingArray;

public class Queue {

	private int front = -1;
	private int rear = -1;
	
	int [] arr = new int[10];
			
	public void enqueue(int data) {
		
		if(rear == arr.length-1) {
			System.out.println("Queue Overflow");
		}else {
			if(front == -1 && rear == -1) {
				arr[0] = data;
				front++;
				rear++;
			}else {
				arr[++rear] = data;
			}
		}
	}
	
	public void dequeue() {
		
		if(front == -1) {
			System.out.println("Queue Underflow");
		}else {
			front++;
		}
	}
		
	public void display() {
		
		for(int i = front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
