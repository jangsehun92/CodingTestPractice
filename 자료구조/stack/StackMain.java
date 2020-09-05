package codingTest.자료구조.stack;

import codingTest.자료구조.stack.day1.Stack;
import codingTest.자료구조.stack.day2.Stack2;
import codingTest.자료구조.stack.day3.Stack3;

public class StackMain {

	public static void main(String[] args) {
		System.out.println("stack");
		Stack stack = new Stack(10);
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println(stack.peek());
		stack.pop();
		stack.push(1);
		stack.clear();
		stack.printStack();
		//--------
		System.out.println("stack2");
		Stack2 stack2 = new Stack2(5);
		System.out.println(stack2.isEmpty());
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		stack2.push(5);
		stack2.pop();
		System.out.println("peek : " + stack2.peek());
		stack2.printStack();
		
		System.out.println("stack3");
		Stack3 stack3 = new Stack3(5);
		System.out.println(stack3.isEmpty());
		stack3.push(1);
		stack3.push(2);
		stack3.push(3);
		stack3.push(4);
		stack3.push(5);
		stack3.printStack();
		stack3.pop();
		System.out.println("peek : " + stack3.peek());
		stack3.printStack();
		
	}

}
