package codingTest.자료구조.stack.nodeStack.day24;

public class Node24<T> {
	
	private T data;
	private Node24<T> link;
	
	public Node24(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node24<T> node) {
		this.link = node;
	}
	
	public Node24<T> getLink(){
		return link;
	}

}
