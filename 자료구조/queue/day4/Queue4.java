package codingTest.자료구조.queue.day4;

public class Queue4 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue4(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		front = -1;
		rear = -1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException("큐가 가득 차있습니다.");
		}
		System.out.println("enqueue [ " +data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		front = (front+1)%queueSize;
		System.out.println("dequeue [ " + queue[front] + " ]");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		
		System.out.println("peek [ " + queue[front+1] + " ]");
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
		return !(rear < queueSize);
	}
	
	public void clear() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 이미 비어있습니다.");
		}
		queue = new int[queueSize];
		front = -1;
		rear = -1;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		System.out.println("Queue4 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}
	

}
