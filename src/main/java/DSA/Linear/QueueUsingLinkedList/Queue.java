package DSA.Linear.QueueUsingLinkedList;

public class Queue<T> {

	public Node<T> front = null;
	public Node<T> rear = null;
	
	
	public void enqueue(T data) {
		
		Node<T> node = new Node<>(data);
		
		if(front == null && rear == null) {
			front = node;
			rear = node;			
		}else {
			rear.next = node;
			rear = node;
		}
		
	}
	
	public void dequeque() {

		if(front != null && rear != null) {
			front = front.next;
		}

	}
	
	public void display() {
		Node<T> temp = front;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		System.out.println("Queue items are:");
		
		queue.display();
		
		queue.dequeque();
		queue.dequeque();
		queue.dequeque();

		System.out.println("Queue items are:");
		
		queue.display();
		
	}

}
