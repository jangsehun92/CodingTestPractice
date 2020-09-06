package codingTest.자료구조.stack.nodeStack.day4;

public class NodeStack4<T> {
	
	private Node4<T> top;
	
	public void push(T data) {
		Node4<T> newNode = new Node4<T>(data);
		newNode.setLink(top);
		top = newNode;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return top.getData();
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("이미 스택이 비어져있습니다.");
			return;
		}
		while(top != null) {
			Node4<T> tempNode = this.top.getLink();
			top = null;
			top = tempNode;
		}
	}
	
	public void printStack() {
		Node4<T> tempNode = this.top;
		System.out.println("nodeStack4 List");
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}
	
	

}
