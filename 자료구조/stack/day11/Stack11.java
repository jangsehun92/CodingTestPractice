package codingTest.자료구조.stack.day11;

public class Stack11 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack11(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException("스택이 가득 찼습니다.");
		}
		System.out.println("push [ " + data + " ]");
		stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("pop [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("peek [ " + stack[top] + " ]");
		return stack[top];
	}
	
	public boolean isFull() {
		return (top+1 == stackSize);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void clear() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 이미 비어있습니다.");
		}
		stack = new int[stackSize];
		this.top = -1;
	}
	
	public void printStack() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Stack11 List");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	

}
