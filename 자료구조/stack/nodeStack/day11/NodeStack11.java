package codingTest.자료구조.stack.nodeStack.day11;

public class NodeStack11<T> {
	
	private Node11<T> top;
	
	public void push(T data) {
		Node11<T> newNode = new Node11<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("push [ " + data + " ]");
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		System.out.println("pop [ " + data + " ]");
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		System.out.println("peek [ " + top.getData() + " ]");
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
		Node11<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어있습니다.");
			return;
		}
		System.out.println("Stack11 List");
		Node11<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
