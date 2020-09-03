package codingTest.자료구조.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println(stack.peek());
		stack.pop();
		stack.push(1);
		stack.clear();
		stack.printStack();
		
		
		Stack_node<Integer> stackNode = new Stack_node<>();
		stackNode.push(1);
		stackNode.push(2);
		stackNode.push(3);
		stackNode.push(4);
		stackNode.push(5);
		System.out.println(stackNode.peek());
		
		
	}

}
