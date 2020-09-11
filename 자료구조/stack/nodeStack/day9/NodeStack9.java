package codingTest.자료구조.stack.nodeStack.day9;

public class NodeStack9<T> {
	
	private Node9<T> top;
	
	public void push(T data) {
		Node9<T> newNode = new Node9<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("Push [ " + data + " ]");
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
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("스택이 이미 비어있습니다.");
			return;
		}
		
		Node9<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		System.out.println("NodeStack9 List");
		Node9<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}
	
}
