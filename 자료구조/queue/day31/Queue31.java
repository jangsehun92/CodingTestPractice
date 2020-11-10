package codingTest.자료구조.queue.day31;

public class Queue31 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue31(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public void isEmpty() {
		if(front==rear) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
	}
	
	public void isFull() {
		if(rear+1 == queueSize) {
			throw new ArrayIndexOutOfBoundsException("큐가 가득 찼습니다.");
		}
	}
	
	public void enqueue(int data) {
		isFull();
		System.out.println("enqueue [ " + data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		isEmpty();
		front = (front + 1) % queueSize;
		System.out.println("dequeue [ " + queue[front] + " ]");
		return queue[front];
	}
	
	public int peek() {
		isEmpty();
		System.out.println("peek [ " + queue[front+1] + " ]");
		return queue[front+1];
	}
	
	public void clear() {
		isEmpty();
		queue = new int[queueSize];
		this.front = -1;
		this.rear = -1;
	}
	
	public void printQueue() {
		isEmpty();
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
