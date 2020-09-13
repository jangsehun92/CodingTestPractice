package codingTest.자료구조.stack;

import codingTest.자료구조.stack.day1.Stack;
import codingTest.자료구조.stack.day10.Stack10;
import codingTest.자료구조.stack.day11.Stack11;
import codingTest.자료구조.stack.day2.Stack2;
import codingTest.자료구조.stack.day3.Stack3;
import codingTest.자료구조.stack.day4.Stack4;
import codingTest.자료구조.stack.day5.Stack5;
import codingTest.자료구조.stack.day6.Stack6;
import codingTest.자료구조.stack.day7.Stack7;
import codingTest.자료구조.stack.day8.Stack8;
import codingTest.자료구조.stack.day9.Stack9;

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
		
		System.out.println("stack4");
		Stack4 stack4 = new Stack4(5);
		System.out.println(stack4.isEmpty());
		stack4.push(1);
		stack4.push(2);
		stack4.push(3);
		stack4.push(4);
		stack4.push(5);
		stack4.printStack();
		stack4.pop();
		System.out.println("peek : " + stack4.peek());
		stack4.printStack();
		stack4.clear();
		//stack4.printStack();
		
		System.out.println("stack5");
		Stack5 stack5 = new Stack5(5);
		System.out.println(stack5.isEmpty());
		stack5.push(1);
		stack5.push(2);
		stack5.push(3);
		stack5.push(4);
		stack5.push(5);
		stack5.printStack();
		stack5.pop(); 
		System.out.println("peek : " + stack5.peek());
		stack5.printStack();
		stack5.clear();
		//stack5.printStack();
		
		System.out.println("stack6");
		Stack6 stack6 = new Stack6(5);
		System.out.println(stack6.isEmpty());
		stack6.push(1);
		stack6.push(2);
		stack6.push(3);
		stack6.push(4);
		stack6.push(5);
		stack6.printStack();
		stack6.pop();
		stack6.peek();
		stack6.printStack();
		stack6.clear();
		//stack5.printStack();
		
		System.out.println("stack7");
		Stack7 stack7 = new Stack7(5);
		System.out.println(stack7.isEmpty());
		stack7.push(1);
		stack7.push(2);
		stack7.push(3);
		stack7.push(4);
		stack7.push(5);
		stack7.printStack();
		stack7.pop();
		stack7.peek();
		stack7.printStack();
		stack7.clear();
		//stack5.printStack();
		
		System.out.println("stack8");
		Stack8 stack8 = new Stack8(5);
		System.out.println(stack8.isEmpty());
		stack8.push(1);
		stack8.push(2);
		stack8.push(3);
		stack8.push(4);
		stack8.push(5);
		stack8.printStack();
		stack8.pop();
		stack8.peek();
		stack8.printStack();
		stack8.clear();
		//stack5.printStack();
		
		System.out.println("stack9");
		Stack9 stack9 = new Stack9(5);
		System.out.println(stack9.isEmpty());
		stack9.push(1);
		stack9.push(2);
		stack9.push(3);
		stack9.push(4);
		stack9.push(5);
		stack9.printStack();
		stack9.pop();
		stack9.peek();
		stack9.printStack();
		stack9.clear();
		//stack5.printStack();
		
		System.out.println("stack10");
		Stack10 stack10 = new Stack10(5);
		System.out.println(stack10.isEmpty());
		stack10.push(1);
		stack10.push(2);
		stack10.push(3);
		stack10.push(4);
		stack10.push(5);
		stack10.printStack();
		stack10.pop();
		stack10.peek();
		stack10.printStack();
		stack10.clear();
		stack10.push(2);
		stack10.peek();
		stack10.printStack();
		
		System.out.println("stack11");
		Stack11 stack11 = new Stack11(5);
		System.out.println(stack11.isEmpty());
		stack11.push(1);
		stack11.push(2);
		stack11.push(3);
		stack11.push(4);
		stack11.push(5);
		stack11.printStack();
		stack11.pop();
		stack11.peek();
		stack11.printStack();
		stack11.clear();
		stack11.push(2);
		stack11.peek();
		stack11.printStack();
		
	}

}
