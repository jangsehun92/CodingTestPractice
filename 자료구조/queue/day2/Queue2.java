package codingTest.자료구조.queue.day2;

public class Queue2 {
	
	private int[] queue;
	private int queueSize;
	private int front; //삭제할(한) 위치
	private int rear; //데이터가 삽입된 index
	
	public Queue2(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("큐가 가득 찾습니다.");
			return;
		}
		System.out.println("enqueue [ " +data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		System.out.println("dequeue [ " + queue[++front] +" ]");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		System.out.println("peek [ " + queue[front+1] +" ]");
		return queue[front+1];
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear > queueSize);
	}
	
	public void clear() {
		queue = new int[queueSize];
		front = -1;
		rear = -1;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		System.out.println("Queue2 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
