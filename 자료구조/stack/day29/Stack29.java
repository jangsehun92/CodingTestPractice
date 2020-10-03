package codingTest.자료구조.stack.day29;

public class Stack29 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack29(int stackSize) {
		stack = new int[stackSize];
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	public void isEmpty() {
		if(top == -1) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
	}
	
	public void isFull() {
		if(top+1 == stackSize) {
			throw new ArrayIndexOutOfBoundsException("스택이 가득 찼습니다.");
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
	
	public void clear() {
		isEmpty();
		stack = new int[stackSize];
		top = -1;
	}
	
	public void printStack() {
		isEmpty();
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
