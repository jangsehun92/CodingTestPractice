package codingTest.자료구조.stack.nodeStack.day5;

public class NodeStack5<T> {
	
	private Node5<T> top;
	
	public void push(T data) {
		Node5<T> newNode = new Node5<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("Push [ "+ data + " ]");
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		System.out.println("Pop [ "+ data + " ]");
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		System.out.println("Peek [ "+ top.getData() + " ]");
		return top.getData();
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		while(top != null) {
			Node5<T> tempNode = top.getLink();
			top = null;
			top = tempNode;
		}
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		System.out.println("NodeStack5 List");
		Node5<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
