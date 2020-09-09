package codingTest.자료구조.queue;

public class Queue {
	
	/*	Queue에 사용되는 필수적인 메소드
	 * 선입선출(FIFO)
	 * enqueue 	: 큐의 가장 마지막에 데이터를 삽입한다.
	 * dequeue 	: 큐의 첫 번째 위치에 있는 데이터를 반환하고 큐에서 삭제한다.
	 * isEmpty 	: 큐가 empty 상태 인지 확인한다.
	 * clear 	: 큐에 저장된 모든 데이터를 삭제하고 큐를 초기화한다.
	 * peek 	: 큐의 첫 번째 위치에 있는 데이터를 추출한다.(데이터 삭제 하지 않음)
	 */
	
	private int[] queue;
	private int queueSize;
	private int front;	//데이터 삭제 index
	private int rear;	//마지막 데이터 삽입 index값
	
	public Queue(int queueSize) {
		queue = new int[queueSize];
		this.queueSize = queueSize;
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int data) {
		System.out.println("Enqueue [ " + data + " ]");
		queue[++rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		//front = (front + 1) % queueSize;
		System.out.println("Dequeue [ " + queue[++front] + " ]");
		return queue[front];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("큐가 비어있습니다.");
		}
		System.out.println("Peek [ " + queue[front+1] +" ]");
		return queue[front+1];
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		return (front == rear);
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
		System.out.println("Queue List");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}
	

}
