package codingTest.자료구조.stack.nodeStack.day3;

public class NodeStack3<T> {
	
	private Node3<T> top;
	
	public void push(T data) {
		Node3<T> newNode = new Node3<T>(data);
		newNode.setLink(top);
		top = newNode;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack이 비어있습니다.");
			return null;
		}
		T data = top.getData();
		top = top.getLink();
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack이 비어있습니다.");
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
		}
		while(top != null) {
			Node3<T> temp = top.getLink();
			top = null;
			top = temp;
		}
	}
	
	public void printStack() {
		Node3<T> tempNode = this.top;
		System.out.println("stackList");
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}

}
