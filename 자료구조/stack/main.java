package codingTest.자료구조.stack;

public class main {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		System.out.println(stack.empty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println(stack.peek());
		stack.pop();
		stack.push(1);
		stack.pop();
		stack.printStack();
		
		
	}

}
