package codingTest.자료구조.queue.day15;

public class Queue15 {
	
	private int[] queue;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue15(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public void isFull() {
		if(rear+1 == queueSize) {
			throw new ArrayIndexOutOfBoundsException("큐가 가득 찼습니다.");
		}
	}
	
	public void isEmpty() {
		if(front == rear) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
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
		front = -1;
		rear = -1;
		System.out.println("큐를 초기화했습니다.");
	}
	
	public void printQueue() {
		isEmpty();
		System.out.println("Queue15 List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}

}
