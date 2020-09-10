package codingTest.자료구조.queue;

import codingTest.자료구조.queue.day1.Queue;
import codingTest.자료구조.queue.day2.Queue2;

public class QueueMain {

	public static void main(String[] args) {
		
		System.out.println("Queue");
		Queue queue = new Queue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.peek();
		queue.printQueue();
		
		System.out.println("Queue2");
		Queue2 queue2 = new Queue2(5);
		
		queue2.enqueue(1);
		queue2.enqueue(2);
		queue2.enqueue(3);
		queue2.dequeue();
		queue2.peek();
		
		queue2.enqueue(4);
		queue2.enqueue(5);
		queue2.printQueue();
		queue2.dequeue();
		queue2.dequeue();
		queue2.dequeue();
		//queue2.dequeue();
		//queue2.dequeue();
		queue2.peek();
		queue2.printQueue();
	}

}
