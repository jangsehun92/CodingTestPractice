package codingTest.자료구조.stack.nodeStack.day17;

public class NodeStack17<T> {
	
	private Node17<T> top;
	
	public boolean isEmpty() {
		boolean result = false;
		if(top == null) {
			result = true;
			System.out.println("스택이 비어있습니다.");
		}
		return result;
	}
	
	public void push(T data) {
		Node17<T> newNode = new Node17<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("push [ " + data + " ]");
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		System.out.println("pop [ " + data + " ]");
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		System.out.println("peek [ " + top.getData() + " ]");
		return top.getData();
	}
	
	public void clear() {
		if(isEmpty()) {
			return;
		}
		Node17<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
		System.out.println("스택을 초기화했습니다.");
	}
	
	public void printStack() {
		if(isEmpty()) {
			return;
		}
		System.out.println("NodeStack17 List");
		Node17<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
