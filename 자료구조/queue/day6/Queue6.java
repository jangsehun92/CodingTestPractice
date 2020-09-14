package codingTest.자료구조.queue.day6;

public class Queue6 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue6(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("큐가 가득 찼습니다.");
		}
		System.out.println("enqueue [ " + data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("큐가 비어 있습니다.");
		}
		front = (front+1)%queueSize;
		System.out.println("dequeue [ " + queue[front] + " ]");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("큐가 비어 있습니다.");
		}
		System.out.println("Peek [ " + queue[front+1] + " ]");
		return queue[front+1];
	}
	
	public boolean isFull() {
		return (rear+1 == queueSize);
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			front = -1; 
			rear = -1;
		}
		return (front == rear);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("큐가 이미 비어 있습니다.");
		}
		queue = new int[queueSize];
		this.front = -1;
		this.rear = -1;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비어 있습니다.");
		}
		System.out.println("Queue6 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
