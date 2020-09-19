package codingTest.자료구조.stack.day16;

public class Stack16 {
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack16(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public boolean isFull() {
		return (top+1 == stackSize);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("스택이 가득 습니다.");
			return;
		}
		System.out.println("push [ " + data + " ]");
		stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
		System.out.println("pop [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
		System.out.println("peek [ " + stack[top] + " ]");
		return stack[top];
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어있습니다.");
			return;
		}
		stack = new int[stackSize];
		top = -1;
		System.out.println("스택을 초기화했습니다.");
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		System.out.println("Stack16 List");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
