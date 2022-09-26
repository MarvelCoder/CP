package DSA.Linear.CircularQueueUsingArray;

public class CircularQueue {
	
	int front = -1;
	int rear = -1;
	
	int[] queue = new int[10];
	
	int maxsize = queue.length;
	
	public void enqueue(int data) {
		
		if(front == (rear+1)%maxsize) {
			System.out.println("Queue Overflow");
		}else {
			if(front ==-1 && rear==-1) {
				front = (front+1)%maxsize;
				rear = (rear+1)%maxsize;
				queue[rear] = data;				
			}else {
				rear = (rear+1)%maxsize;
				queue[rear] = data;
			}
		}
		
	}
	
	public void dequeue() {
		
		if(front == -1 && rear ==-1 || front == rear) {
			System.out.println("Queue Underflow");
		}else {
			front = (front+1)%maxsize;
		}
	}
	
	public void display() {
		
		for(int i = front;i<rear;i++) {
			System.out.print(queue[i]+" ");
		}
	}

}
