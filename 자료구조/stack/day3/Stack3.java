package codingTest.자료구조.stack.day3;

public class Stack3 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack3(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public void push(int data) {
		stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void printStack() {
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
