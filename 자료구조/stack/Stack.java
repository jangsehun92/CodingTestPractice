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
		if(isPull()) {
			System.out.println("스택이 꽉찾습니다.");
		}else {
			System.out.println("Push [ " + data + " ] ");
			stackArr[++top] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Pop [ " + stackArr[top] + " ]");
		return stackArr[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Peek [ " + stackArr[top] + " ]");
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isPull() {
		return (top == this.stackSize-1);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("이미 비어있습니다.");
		}else {
			top = -1;
			stackArr = new int[stackSize];
			System.out.println("스택이 초기화 되었습니다.");
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}else {
			System.out.println("stackList");
			for(int i = top; i >= 0; i--) {
				System.out.println(stackArr[i]);
			}
		}
	}

}
