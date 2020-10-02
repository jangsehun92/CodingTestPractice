package codingTest.자료구조.stack.nodeStack.day28;

public class NodeStack28<T> {
	
	Node28<T> top;
	
	public void isEmpty() {
		if(top == null) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
	}
	
	public void clear() {
		Node28<T> tempNode;
		
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
	}
	
	public void printStack() {
		Node28<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}
	
	public void push(T data) {
		Node28<T> newNode = new Node28<T>(data);
		newNode.setLink(top);
		top = newNode;
		System.out.println("push [ " + data+ " ]");
	}
	
	public T pop() {
		isEmpty();
		T data = top.getData();
		top = top.getLink();
		System.out.println("pop [ " + data + " ]");
		return data;
	}
	
	public T peek() {
		isEmpty();
		System.out.println("peek [ " + top.getData() + " ]");
		return top.getData();
	}

}
