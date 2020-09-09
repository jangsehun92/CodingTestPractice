package codingTest.자료구조.stack.nodeStack.day7;

public class NodeStack7<T> {
	
	private Node7<T> top;
	
	public void push(T data) {
		Node7<T> newNode = new Node7<T>(data);
		newNode.setLink(top);
		top = newNode;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return top.getData();
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어있습니다.");
			return;
		}
		
		while(top != null) {
			Node7<T> tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		System.out.println("NodeStack7 List");
		Node7<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
