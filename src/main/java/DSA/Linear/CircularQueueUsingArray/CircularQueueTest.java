package DSA.Linear.CircularQueueUsingArray;

public class CircularQueueTest {

	public static void main(String[] args) {
		
		CircularQueue queue = new CircularQueue();
		
		System.out.println("After Enqueue");
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(0);
		
		queue.display();
	
		queue.dequeue();
		System.out.println("\nAfter Dequeue");
		queue.display();
		
	}

}
