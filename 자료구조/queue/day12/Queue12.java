package codingTest.자료구조.queue.day12;

public class Queue12 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue12(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull() {
		boolean result = (rear+1 == queueSize);
		if(result) {
			System.out.println("큐가 가득 찼습니다.");
		}
		return result;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(front == rear) {
			result = true;
			front = -1;
			rear = -1;
			System.out.println("큐가 비어있습니다.");
		}
		return result;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			return;
		}
		System.out.println("enqueue [ " + data + " ] ");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return 0;
		}
		front = (front+1) % queueSize;
		System.out.println("dequeue [ " + queue[front] + " ] ");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			return 0;
		}
		System.out.println("peek [ " + queue[front+1] + " ]");
		return queue[front+1];
	}
	
	public void clear() {
		if(isEmpty()) {
			return;
		}
		queue = new int[queueSize];
		front = -1;
		rear = -1;
		System.out.println("큐를 초기화했습니다.");
	}
	
	public void printQueue() {
		if(isEmpty()) {
			return;
		}
		System.out.println("Queue12 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
