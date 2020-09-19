package codingTest.자료구조.queue.day11;

public class Queue11 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue11(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
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
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("큐가 가득 찼습니다.");
			return;
		}
		System.out.println("enqueue [ " + data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return 0;
		}
		front = (front+1) % queueSize;
		System.out.println("dequeue [ " + queue[front] + " ]");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return 0;
		}
		System.out.println("peek [ " + queue[front+1] + " ]");
		return queue[front+1];
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("큐가 이미 비어있습니다.");
			return;
		}
		queue = new int[queueSize];
		front = -1;
		rear = -1;
		System.out.println("큐를 초기화했습니다.");
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return;
		}
		System.out.println("Queue11 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
