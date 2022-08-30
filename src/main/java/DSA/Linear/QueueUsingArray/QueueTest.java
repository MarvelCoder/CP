package DSA.Linear.QueueUsingArray;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println("After Enqueue:");
		
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("After Dequeue:");
		
		queue.display();
		
	}

}
