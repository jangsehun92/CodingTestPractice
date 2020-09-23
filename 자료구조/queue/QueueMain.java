package codingTest.자료구조.queue;

import codingTest.자료구조.queue.day1.Queue;
import codingTest.자료구조.queue.day10.Queue10;
import codingTest.자료구조.queue.day11.Queue11;
import codingTest.자료구조.queue.day12.Queue12;
import codingTest.자료구조.queue.day13.Queue13;
import codingTest.자료구조.queue.day14.Queue14;
import codingTest.자료구조.queue.day15.Queue15;
import codingTest.자료구조.queue.day2.Queue2;
import codingTest.자료구조.queue.day3.Queue3;
import codingTest.자료구조.queue.day4.Queue4;
import codingTest.자료구조.queue.day5.Queue5;
import codingTest.자료구조.queue.day6.Queue6;
import codingTest.자료구조.queue.day7.Queue7;
import codingTest.자료구조.queue.day8.Queue8;
import codingTest.자료구조.queue.day9.Queue9;

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
		
		System.out.println("Queue3");
		Queue3 queue3 = new Queue3(5);
		
		queue3.enqueue(1);
		queue3.enqueue(2);
		queue3.enqueue(3);
		queue3.printQueue();
		queue3.dequeue();
		queue3.peek();
		
		queue3.enqueue(4);
		queue3.enqueue(5);
		queue3.printQueue();
		queue3.dequeue();
		queue3.dequeue();
		queue3.dequeue();
		//queue2.dequeue();
		//queue2.dequeue();
		queue3.peek();
		queue3.printQueue();
		
		System.out.println("----------------Queue4");
		Queue4 queue4 = new Queue4(5);
		
		queue4.enqueue(1);
		queue4.enqueue(2);
		queue4.enqueue(3);
		queue4.enqueue(4);
		queue4.enqueue(5);
		queue4.printQueue();
		queue4.dequeue();
		queue4.dequeue();
		queue4.dequeue();
		queue4.dequeue();
		queue4.printQueue();
		queue4.peek();
		
		
		System.out.println("---------------------");
		System.out.println("Queue5");
		Queue5 queue5 = new Queue5(5);
		
		queue5.enqueue(1);
		queue5.enqueue(2);
		queue5.enqueue(3);
		queue5.enqueue(4);
		queue5.enqueue(5);
		queue5.printQueue();
		queue5.dequeue();
		queue5.dequeue();
		queue5.dequeue();
		queue5.dequeue();
		//queue5.peek();
		queue5.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue6");
		Queue6 queue6 = new Queue6(5);
		
		queue6.enqueue(1);
		queue6.enqueue(2);
		queue6.enqueue(3);
		queue6.enqueue(4);
		queue6.enqueue(5);
		queue6.printQueue();
		queue6.dequeue();
		queue6.dequeue();
		//queue6.dequeue();
		queue6.dequeue();
		queue6.dequeue();
		queue6.peek();
		queue6.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue7");
		Queue7 queue7 = new Queue7(5);
		
		queue7.enqueue(1);
		queue7.enqueue(2);
		queue7.enqueue(3);
		queue7.peek();
		queue7.enqueue(4);
		queue7.enqueue(5);
		queue7.printQueue();
		queue7.dequeue();
		queue7.dequeue();
		queue7.dequeue();
		queue7.dequeue();
		queue7.peek();
		queue7.printQueue();
		queue7.dequeue();
		queue7.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue8");
		Queue8 queue8 = new Queue8(5);
		
		queue8.enqueue(1);
		queue8.enqueue(2);
		queue8.enqueue(3);
		queue8.peek();
		queue8.enqueue(4);
		queue8.enqueue(5);
		queue8.printQueue();
		queue8.dequeue();
		queue8.dequeue();
		queue8.dequeue();
		queue8.dequeue();
		queue8.peek();
		queue8.printQueue();
		queue8.dequeue();
		queue8.printQueue();

		System.out.println("---------------------");
		System.out.println("Queue9");
		Queue9 queue9 = new Queue9(5);
		
		queue9.enqueue(1);
		queue9.enqueue(2);
		queue9.enqueue(3);
		queue9.peek();
		queue9.enqueue(4);
		queue9.enqueue(5);
		queue9.printQueue();
		queue9.dequeue();
		queue9.dequeue();
		queue9.dequeue();
		queue9.dequeue();
		queue9.peek();
		queue9.printQueue();
		queue9.dequeue();
		queue9.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue10");
		Queue10 queue10 = new Queue10(5);
		
		queue10.enqueue(1);
		queue10.enqueue(2);
		queue10.enqueue(3);
		queue10.peek();
		queue10.enqueue(4);
		queue10.enqueue(5);
		queue10.printQueue();
		queue10.dequeue();
		queue10.dequeue();
		queue10.dequeue();
		queue10.dequeue();
		queue10.peek();
		queue10.printQueue();
		queue10.dequeue();
		queue10.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue11");
		Queue11 queue11 = new Queue11(5);
		
		queue11.enqueue(1);
		queue11.enqueue(2);
		queue11.enqueue(3);
		queue11.peek();
		queue11.enqueue(4);
		queue11.enqueue(5);
		queue11.printQueue();
		queue11.dequeue();
		queue11.dequeue();
		queue11.dequeue();
		queue11.dequeue();
		queue11.peek();
		queue11.printQueue();
		queue11.dequeue();
		queue11.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue12");
		Queue12 queue12 = new Queue12(5);
		
		queue12.enqueue(1);
		queue12.enqueue(2);
		queue12.enqueue(3);
		queue12.peek();
		queue12.enqueue(4);
		queue12.enqueue(5);
		queue12.printQueue();
		queue12.dequeue();
		queue12.dequeue();
		queue12.dequeue();
		queue12.dequeue();
		queue12.peek();
		queue12.printQueue();
		queue12.dequeue();
		queue12.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue13");
		Queue13 queue13 = new Queue13(5);
		
		queue13.enqueue(1);
		queue13.enqueue(2);
		queue13.enqueue(3);
		queue13.peek();
		queue13.enqueue(4);
		queue13.enqueue(5);
		queue13.printQueue();
		queue13.dequeue();
		queue13.dequeue();
		queue13.printQueue();
		queue13.dequeue();
		queue13.dequeue();
		queue13.peek();
		queue13.printQueue();
		queue13.dequeue();
		//queue13.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue14");
		Queue14 queue14 = new Queue14(5);
		
		queue14.enqueue(1);
		queue14.enqueue(2);
		queue14.enqueue(3);
		queue14.peek();
		queue14.enqueue(4);
		queue14.enqueue(5);
		queue14.printQueue();
		queue14.dequeue();
		queue14.dequeue();
		queue14.printQueue();
		queue14.dequeue();
		queue14.dequeue();
		queue14.peek();
		queue14.printQueue();
		queue14.dequeue();
		
		System.out.println("---------------------");
		System.out.println("Queue15");
		Queue15 queue15 = new Queue15(5);
		
		queue15.enqueue(1);
		queue15.enqueue(2);
		queue15.enqueue(3);
		queue15.peek();
		queue15.enqueue(4);
		queue15.enqueue(5);
		queue15.printQueue();
		queue15.dequeue();
		queue15.dequeue();
		queue15.printQueue();
		queue15.dequeue();
		queue15.dequeue();
		queue15.peek();
		queue15.printQueue();
		queue15.dequeue();
		
	}

}
