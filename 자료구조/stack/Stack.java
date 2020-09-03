package codingTest.자료구조.stack;

public class Stack {
	
	private int top;
	private int stackSize;
	private int stackArr[];
	
	public Stack(int stackSize) {
		top = -1;
		stackArr = new int[stackSize];
		this.stackSize = stackSize;
	}
	
	public void push(int data) {
		System.out.println("Push [ " + data + " ] ");
		stackArr[++top] = data;
	}
	
	public int pop() {
		if(top == -1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("Pop [ " + stackArr[top] + " ]");
		return stackArr[top--];
	}
	
	public int peek() {
		if(top == -1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("Peek [ " + stackArr[top] + " ]");
		return stackArr[top];
	}
	
	public boolean empty() {
		return top == -1;
	}
	
	public void printStack() {
		System.out.println("stackList (Size : " + stackSize+")");
		for(int i = top; i >= 0; i--) {
			System.out.println(stackArr[i]);
		}
	}

}
