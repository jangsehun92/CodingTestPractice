package codingTest.자료구조.stack.day17;

public class Stack17 {
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack17(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public boolean isFull() {
		if(top+1 == stackSize) {
			System.out.println("스택이 가득 찼습니다.");
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("스택이 비어있습니다.");
			return true;
		}
		return false;
	}
	
	public void push(int data) {
		if(isFull()) {
			return;
		}
		System.out.println("push [ " + data + " ]");
		stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			return 0;
		}
		System.out.println("pop [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			return 0;
		}
		System.out.println("peek [ " + stack[top] + " ]");
		return stack[top];
	}
	
	public void clear() {
		if(isEmpty()) {
			return;
		}
		stack = new int[stackSize];
		top = -1;
		System.out.println("스택을 초기화했습니다.");
	}
	
	public void printStack() {
		if(isEmpty()) {
			return;
		}
		System.out.println("Stack17 List");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
