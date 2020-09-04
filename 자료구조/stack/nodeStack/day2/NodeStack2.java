package codingTest.자료구조.stack.nodeStack.day2;

public class NodeStack2<T> {
	
	private Node2<T> top;
	
	public void push(T data) {
		Node2<T> node = new Node2<T>(data);
		node.setLink(top);
		top = node;
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어져있습니다.");
		}
		T data = top.getData();
		top = top.getLink();
		
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("스택이 비어져있습니다.");
		}
		return top.getData();
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("이미 스택이 비어져있습니다.");
		}
		while(top != null) {
			Node2<T> temp = top.getLink();
			top = null;
			top = temp;
		}
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
	
	public void printStack() {
		Node2<T> tempNode = this.top;
		System.out.println("stackList");
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}
}
