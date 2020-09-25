package codingTest.자료구조.stack.day22;

public class Stack22 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack22(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public void isFull() {
		if(top+1 == stackSize) {
			throw new ArrayIndexOutOfBoundsException("스택이 가득 찼습니다.");
		}
	}
	
	public void isEmpty() {
		if(top == -1) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
	}
	
	public void clear() {
		stack = new int[stackSize];
		this.top = -1;
	}
	
	public void printStack() {
		isEmpty();
		System.out.println("Stack22 List");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public void push(int data) {
		isFull();
		System.out.println("push [ " + data + " ]");
		stack[++top] = data;
	}
	
	public int pop() {
		isEmpty();
		System.out.println("pop [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		isEmpty();
		System.out.println("peek [ " + stack[top] + " ]");
		return stack[top];
	}
	
	

}
