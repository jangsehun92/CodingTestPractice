package codingTest.자료구조.stack.day7;

public class Stack7 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack7(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public void push(int data) {
		System.out.println("Push [ " + data + " ]");
		stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Pop [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Peek [ " + stack[top] + " ]");
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void clear() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 이미 비어있습니다.");
		}
		this.stack = new int[stackSize];
		top = -1;
	}
	
	public void printStack() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Stack7 List");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
