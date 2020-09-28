package codingTest.자료구조.stack;

import codingTest.자료구조.stack.day1.Stack;
import codingTest.자료구조.stack.day10.Stack10;
import codingTest.자료구조.stack.day11.Stack11;
import codingTest.자료구조.stack.day12.Stack12;
import codingTest.자료구조.stack.day13.Stack13;
import codingTest.자료구조.stack.day14.Stack14;
import codingTest.자료구조.stack.day15.Stack15;
import codingTest.자료구조.stack.day16.Stack16;
import codingTest.자료구조.stack.day17.Stack17;
import codingTest.자료구조.stack.day18.Stack18;
import codingTest.자료구조.stack.day19.Stack19;
import codingTest.자료구조.stack.day2.Stack2;
import codingTest.자료구조.stack.day20.Stack20;
import codingTest.자료구조.stack.day21.Stack21;
import codingTest.자료구조.stack.day22.Stack22;
import codingTest.자료구조.stack.day23.Stack23;
import codingTest.자료구조.stack.day24.Stack24;
import codingTest.자료구조.stack.day25.Stack25;
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
		
		System.out.println("stack12");
		Stack12 stack12 = new Stack12(5);
		System.out.println(stack12.isEmpty());
		stack12.push(1);
		stack12.push(2);
		stack12.push(3);
		stack12.push(4);
		stack12.push(5);
		stack12.printStack();
		stack12.pop();
		stack12.peek();
		stack12.printStack();
		stack12.clear();
		stack12.push(2);
		stack12.peek();
		stack12.printStack();
		
		System.out.println("stack13");
		Stack13 stack13 = new Stack13(5);
		System.out.println(stack13.isEmpty());
		stack13.push(1);
		stack13.push(2);
		stack13.push(3);
		stack13.push(4);
		stack13.push(5);
		stack13.printStack();
		stack13.pop();
		stack13.peek();
		stack13.printStack();
		stack13.clear();
		stack13.push(2);
		stack13.peek();
		stack13.printStack();
		
		System.out.println("stack14");
		Stack14 stack14 = new Stack14(5);
		System.out.println(stack14.isEmpty());
		stack14.push(1);
		stack14.push(2);
		stack14.push(3);
		stack14.push(4);
		stack14.push(5);
		stack14.printStack();
		stack14.pop();
		stack14.peek();
		stack14.printStack();
		stack14.clear();
		stack14.push(2);
		stack14.peek();
		stack14.printStack();
		
		System.out.println("stack15");
		Stack15 stack15 = new Stack15(5);
		System.out.println(stack15.isEmpty());
		stack15.push(1);
		stack15.push(2);
		stack15.push(3);
		stack15.push(4);
		stack15.push(5);
		stack15.printStack();
		stack15.pop();
		stack15.peek();
		stack15.printStack();
		stack15.clear();
		stack15.push(2);
		stack15.peek();
		stack15.printStack();
		
		System.out.println("stack16");
		Stack16 stack16 = new Stack16(5);
		System.out.println(stack16.isEmpty());
		stack16.push(1);
		stack16.push(2);
		stack16.push(3);
		stack16.push(4);
		stack16.push(5);
		stack16.printStack();
		stack16.pop();
		stack16.peek();
		stack16.printStack();
		stack16.clear();
		stack16.push(2);
		stack16.peek();
		stack16.printStack();
		
		System.out.println("stack17");
		Stack17 stack17 = new Stack17(5);
		System.out.println(stack17.isEmpty());
		stack17.push(1);
		stack17.push(2);
		stack17.push(3);
		stack17.push(4);
		stack17.push(5);
		stack17.printStack();
		stack17.pop();
		stack17.peek();
		stack17.printStack();
		stack17.clear();
		stack17.push(2);
		stack17.peek();
		stack17.printStack();
		
		System.out.println("stack18");
		Stack18 stack18 = new Stack18(5);
		System.out.println(stack18.isEmpty());
		stack18.push(1);
		stack18.push(2);
		stack18.push(3);
		stack18.push(4);
		stack18.push(5);
		stack18.printStack();
		stack18.pop();
		stack18.peek();
		stack18.printStack();
		stack18.clear();
		stack18.push(2);
		stack18.peek();
		stack18.printStack();
		
		System.out.println("stack19");
		Stack19 stack19 = new Stack19(5);
		stack19.push(1);
		stack19.push(2);
		stack19.push(3);
		stack19.push(4);
		stack19.push(5);
		stack19.printStack();
		stack19.pop();
		stack19.peek();
		stack19.printStack();
		stack19.clear();
		stack19.push(2);
		stack19.peek();
		stack19.printStack();
		stack19.clear();
		
		System.out.println("stack20");
		Stack20 stack20 = new Stack20(5);
		stack20.push(1);
		stack20.push(2);
		stack20.push(3);
		stack20.push(4);
		stack20.push(5);
		stack20.printStack();
		stack20.pop();
		stack20.peek();
		stack20.printStack();
		stack20.clear();
		stack20.push(2);
		stack20.peek();
		stack20.printStack();
		stack20.clear();
		
		System.out.println("stack21");
		Stack21 stack21 = new Stack21(5);
		stack21.push(1);
		stack21.push(2);
		stack21.push(3);
		stack21.push(4);
		stack21.push(5);
		stack21.printStack();
		stack21.pop();
		stack21.peek();
		stack21.printStack();
		stack21.clear();
		stack21.push(2);
		stack21.peek();
		stack21.printStack();
		stack21.clear();
		
		System.out.println("stack22");
		Stack22 stack22 = new Stack22(5);
		stack22.push(1);
		stack22.push(2);
		stack22.push(3);
		stack22.push(4);
		stack22.push(5);
		stack22.printStack();
		stack22.pop();
		stack22.peek();
		stack22.printStack();
		stack22.clear();
		stack22.push(2);
		stack22.peek();
		stack22.printStack();
		stack22.clear();
		
		System.out.println("stack23");
		Stack23 stack23 = new Stack23(5);
		stack23.push(1);
		stack23.push(2);
		stack23.push(3);
		stack23.push(4);
		stack23.push(5);
		stack23.printStack();
		stack23.pop();
		stack23.peek();
		stack23.printStack();
		stack23.clear();
		stack23.push(2);
		stack23.peek();
		stack23.printStack();
		stack23.clear();
		
		System.out.println("stack24");
		Stack24 stack24 = new Stack24(5);
		stack24.push(1);
		stack24.push(2);
		stack24.push(3);
		stack24.push(4);
		stack24.push(5);
		stack24.printStack();
		stack24.pop();
		stack24.peek();
		stack24.printStack();
		stack24.clear();
		stack24.push(2);
		stack24.peek();
		stack24.printStack();
		stack24.clear();
		
		System.out.println("stack25");
		Stack25 stack25 = new Stack25(5);
		stack25.push(1);
		stack25.push(2);
		stack25.push(3);
		stack25.push(4);
		stack25.push(5);
		stack25.printStack();
		stack25.pop();
		stack25.peek();
		stack25.printStack();
		stack25.clear();
		stack25.push(2);
		stack25.peek();
		stack25.printStack();
		stack25.clear();
	}

}
