package codingTest.자료구조.stack;

import codingTest.자료구조.stack.nodeStack.day1.NodeStack;
import codingTest.자료구조.stack.nodeStack.day10.NodeStack10;
import codingTest.자료구조.stack.nodeStack.day11.NodeStack11;
import codingTest.자료구조.stack.nodeStack.day12.NodeStack12;
import codingTest.자료구조.stack.nodeStack.day2.NodeStack2;
import codingTest.자료구조.stack.nodeStack.day3.NodeStack4;
import codingTest.자료구조.stack.nodeStack.day5.NodeStack5;
import codingTest.자료구조.stack.nodeStack.day6.NodeStack6;
import codingTest.자료구조.stack.nodeStack.day7.NodeStack7;
import codingTest.자료구조.stack.nodeStack.day8.NodeStack8;
import codingTest.자료구조.stack.nodeStack.day9.NodeStack9;

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
//		
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
		System.out.println(nodeStack5.isEmpty());
		nodeStack5.printStack();
//		
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
		System.out.println(nodeStack6.isEmpty());
		nodeStack6.printStack();
		
		System.out.println("-----nodeStack7");
		NodeStack7<Integer> nodeStack7 = new NodeStack7<Integer>();
		nodeStack7.push(1);
		nodeStack7.push(2);
		nodeStack7.push(4);
		nodeStack7.push(5);
		nodeStack7.push(3); 
		nodeStack7.printStack();
		nodeStack7.pop();
		nodeStack7.pop();
		nodeStack7.printStack();
		nodeStack7.clear();
		System.out.println(nodeStack7.isEmpty());
		nodeStack7.printStack();
		
		System.out.println("-----nodeStack8");
		NodeStack8<Integer> nodeStack8 = new NodeStack8<Integer>();
		nodeStack8.push(1);
		nodeStack8.push(2);
		nodeStack8.push(4);
		nodeStack8.push(5);
		nodeStack8.push(3); 
		nodeStack8.printStack();
		nodeStack8.pop();
		nodeStack8.pop();
		nodeStack8.printStack();
		nodeStack8.clear();
		System.out.println(nodeStack8.isEmpty());
		nodeStack8.printStack();
		
		
		System.out.println("-----nodeStack9");
		NodeStack9<Integer> nodeStack9 = new NodeStack9<Integer>();
		nodeStack9.push(1);
		nodeStack9.push(2);
		nodeStack9.push(4);
		nodeStack9.push(5);
		nodeStack9.push(3); 
		nodeStack9.printStack();
		nodeStack9.pop();
		nodeStack9.pop();
		nodeStack9.pop();
		nodeStack9.pop();
		nodeStack9.pop();
		//nodeStack9.printStack();
		nodeStack9.clear();
		System.out.println(nodeStack9.isEmpty());
		//nodeStack9.printStack();
		
		System.out.println("-----nodeStack10");
		NodeStack10<Integer> nodeStack10 = new NodeStack10<Integer>();
		nodeStack10.push(1);
		nodeStack10.peek();
		nodeStack10.push(2);
		nodeStack10.push(4);
		nodeStack10.push(5);
		nodeStack10.push(3); 
		nodeStack10.printStack();
		nodeStack10.pop();
		nodeStack10.pop();
		nodeStack10.printStack();
		nodeStack10.pop();
		nodeStack10.pop();
		nodeStack10.printStack();
		nodeStack10.pop();
		//nodeStack10.clear();
		System.out.println(nodeStack10.isEmpty());
		
		System.out.println("-----nodeStack11");
		NodeStack11<Integer> nodeStack11 = new NodeStack11<Integer>();
		nodeStack11.push(1);
		nodeStack11.peek();
		nodeStack11.push(2);
		nodeStack11.push(4);
		nodeStack11.push(5);
		nodeStack11.push(3); 
		nodeStack11.printStack();
		nodeStack11.pop();
		nodeStack11.pop();
		nodeStack11.printStack();
		nodeStack11.pop();
		nodeStack11.pop();
		nodeStack11.printStack();
		nodeStack11.pop();
		//nodeStack10.clear();
		System.out.println(nodeStack11.isEmpty());
		
		System.out.println("-----nodeStack12");
		NodeStack12<Integer> nodeStack12 = new NodeStack12<Integer>();
		nodeStack12.push(1);
		nodeStack12.peek();
		nodeStack12.push(2);
		nodeStack12.push(4);
		nodeStack12.push(5);
		nodeStack12.push(3); 
		nodeStack12.printStack();
		nodeStack12.pop();
		nodeStack12.pop();
		nodeStack12.printStack();
		nodeStack12.pop();
		nodeStack12.pop();
		nodeStack12.printStack();
		nodeStack12.pop();
		//nodeStack10.clear();
		System.out.println(nodeStack12.isEmpty());
		 
	}

}
