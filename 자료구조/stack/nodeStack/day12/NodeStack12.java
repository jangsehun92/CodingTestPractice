package codingTest.자료구조.stack.nodeStack.day12;

public class NodeStack12<T> {
	
	private Node12<T> top;
	
	public void push(T data) {
		Node12<T> newNode = new Node12<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("Push [ " + data + " ]");
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		System.out.println("Pop [ " + data + " ]");
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return null;
		}
		System.out.println("Peek [ " + top.getData() + " ]");
		return top.getData();
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어 있습니다.");
			return;
		}
		Node12<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return;
		}
		System.out.println("NodeStack12 List");
		Node12<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
