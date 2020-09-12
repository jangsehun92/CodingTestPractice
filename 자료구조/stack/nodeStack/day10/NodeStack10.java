package codingTest.자료구조.stack.nodeStack.day10;

public class NodeStack10<T> {
	
	private Node10<T> top;
	
	public void push(T data) {
		Node10<T> newNode = new Node10<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("Push [ " + data +" ]");
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		T data = top.getData();
		System.out.println("Pop [ " + data + " ]");
		top = top.getLink();
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
		System.out.println("Peek [ " + top.getData() + " ]");
		return top.getData();
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void clear() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 이미 비어있습니다.");
		}
		Node10<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 이미 비어있습니다.");
		}
		Node10<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
