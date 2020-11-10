package codingTest.자료구조.stack.nodeStack.day31;

public class NodeStack31<T> {
	
	private Node31<T> top;
	
	public void push(T data) {
		Node31<T> newNode = new Node31<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("push [ " + data + " ]");
	}
	
	public T pop() {
		isEmpty();
		T data = top.getData();
		top = top.getLink();
		System.out.println("pop [ " + data + " ]");
		return data;
	}
	
	public void isEmpty() {
		if(top == null) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
	}
	
	public T peek() {
		isEmpty();
		System.out.println("peek [ " + top.getData() + " ]");
		return top.getData();
	}
	
	public void clear() {
		isEmpty();
		Node31<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		isEmpty();
		Node31<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
