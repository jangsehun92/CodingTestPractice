package codingTest.자료구조.stack.day2;

public class Stack2 {
	
	private int[] stack;
	private int stackSize;
	private int top;
	
	public Stack2(int stackSize) {
		this.stackSize = stackSize;
		stack = new int[this.stackSize];
		this.top = -1;
	}
	
	public void push(int number) {
		stack[++top] = number;
		System.out.println("Push : [ " + stack[top] + " ]");
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Pop : [ " + stack[top] + " ]");
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Peek : [ "+stack[top]+" ]");
		return stack[top]; 
	}
	
	public void clear() {
		this.stack = new int[stackSize];
		this.top = -1;
		System.out.println("스택이 초기화 되었습니다.");
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void printStack() {
		System.out.println("stackList");
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
