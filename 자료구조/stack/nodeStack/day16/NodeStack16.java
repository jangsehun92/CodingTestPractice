package codingTest.자료구조.stack.nodeStack.day16;

public class NodeStack16<T> {
	
	private Node16<T> top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(T data) {
		Node16<T> newNode = new Node16<T>(data);
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
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어있습니다.");
			return;
		}
		Node16<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
		System.out.println("스택을 초기화했습니다.");
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		Node16<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
