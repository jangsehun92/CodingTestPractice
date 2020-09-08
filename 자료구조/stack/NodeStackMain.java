package codingTest.자료구조.stack;

import codingTest.자료구조.stack.nodeStack.day1.NodeStack;
import codingTest.자료구조.stack.nodeStack.day2.NodeStack2;
import codingTest.자료구조.stack.nodeStack.day3.NodeStack4;
import codingTest.자료구조.stack.nodeStack.day5.NodeStack5;
import codingTest.자료구조.stack.nodeStack.day6.NodeStack6;

public class NodeStackMain {

	public static void main(String[] args) {
		System.out.println("-----nodeStack1");
		NodeStack<Integer> nodeStack = new NodeStack<>();
		nodeStack.push(1);
		nodeStack.push(2);
		nodeStack.push(3);
		nodeStack.push(4);
		nodeStack.push(5);
		nodeStack.printStack();
		
		System.out.println("-----nodeStack2");
		NodeStack2<Integer> nodeStack2 = new NodeStack2<Integer>();
		nodeStack2.push(1);
		nodeStack2.push(2);
		nodeStack2.push(4);
		nodeStack2.push(5);
		nodeStack2.push(3);
		nodeStack2.printStack();
		nodeStack2.pop();
		nodeStack2.pop();
		nodeStack2.printStack();
		System.out.println(nodeStack2.isEmpty());
		nodeStack2.clear();
		System.out.println(nodeStack2.isEmpty());
		
		System.out.println("-----nodeStack3");
		NodeStack4<Integer> nodeStack3 = new NodeStack4<Integer>();
		nodeStack3.push(1);
		nodeStack3.push(2);
		nodeStack3.push(4);
		nodeStack3.push(5);
		nodeStack3.push(3);
		nodeStack3.printStack();
		System.out.println(nodeStack3.pop());
		System.out.println(nodeStack3.pop());
		System.out.println(nodeStack3.pop());
		System.out.println(nodeStack3.pop());
		//nodeStack3.clear();
		System.out.println(nodeStack3.isEmpty());
		nodeStack3.printStack();
		
		System.out.println("-----nodeStack4");
		NodeStack4<Integer> nodeStack4 = new NodeStack4<Integer>();
		nodeStack4.push(1);
		nodeStack4.push(2);
		nodeStack4.push(4);
		nodeStack4.push(5);
		nodeStack4.push(3);
		nodeStack4.printStack();
		nodeStack4.clear();
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
		System.out.println(nodeStack4.isEmpty());
		nodeStack4.printStack();
		
		System.out.println("-----nodeStack5");
		NodeStack5<Integer> nodeStack5 = new NodeStack5<Integer>();
		nodeStack5.push(1);
		nodeStack5.push(2);
		nodeStack5.push(4);
		nodeStack5.push(5);
		nodeStack5.push(3);
		nodeStack5.printStack();
		nodeStack5.pop();
		nodeStack5.pop();
		nodeStack5.printStack();
		nodeStack5.clear();
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
		System.out.println(nodeStack5.isEmpty());
		nodeStack5.printStack();
		
		System.out.println("-----nodeStack6");
		NodeStack6<Integer> nodeStack6 = new NodeStack6<Integer>();
		nodeStack6.push(1);
		nodeStack6.push(2);
		nodeStack6.push(4);
		nodeStack6.push(5);
		nodeStack6.push(3);
		nodeStack6.printStack();
		nodeStack6.pop();
		nodeStack6.pop();
		nodeStack6.printStack();
		nodeStack6.clear();
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
//		System.out.println(nodeStack4.pop());
		System.out.println(nodeStack6.isEmpty());
		nodeStack6.printStack();
		
	}

}
