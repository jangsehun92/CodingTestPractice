package codingTest.자료구조.stack.nodeStack.day19;

public class NodeStack19<T> {
	
	private Node19<T> top;
	
	public void isEmpty() {
		if(top == null) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어있습니다.");
		}
	}
	
	public void push(T data) {
		Node19<T> newNode = new Node19<T>(data);
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
	
	public T peek() {
		isEmpty();
		System.out.println("peek [ " + top.getData() + " ]");
		return top.getData();
	}
	
	public void clear() {
		isEmpty();
		Node19<T> tempNode;
		while(top != null) {
			tempNode = top;
			top = null;
			top = tempNode.getLink();
		}
		System.out.println("스택을 초기화했습니다.");
	}
	
	public void printStack() {
		isEmpty();
		Node19<T> tempNode = top;
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
