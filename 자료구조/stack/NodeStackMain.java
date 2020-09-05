package codingTest.자료구조.stack;

import codingTest.자료구조.stack.nodeStack.day1.NodeStack;
import codingTest.자료구조.stack.nodeStack.day2.NodeStack2;
import codingTest.자료구조.stack.nodeStack.day3.NodeStack3;

public class NodeStackMain {

	public static void main(String[] args) {
		NodeStack<Integer> nodeStack = new NodeStack<>();
		nodeStack.push(1);
		nodeStack.push(2);
		nodeStack.push(3);
		nodeStack.push(4);
		nodeStack.push(5);
		nodeStack.printStack();
		
		System.out.println("-----");
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
		
		NodeStack3<Integer> nodeStack3 = new NodeStack3<Integer>();
		nodeStack3.push(1);
		nodeStack3.push(2);
		nodeStack3.push(4);
		nodeStack3.push(5);
		nodeStack3.push(3);
		System.out.println(nodeStack3.pop());
		System.out.println(nodeStack3.pop());
		System.out.println(nodeStack3.isEmpty());
		
	}

}
