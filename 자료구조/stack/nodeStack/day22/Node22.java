package codingTest.자료구조.stack.nodeStack.day22;

public class Node22<T> {
	
	private T data;
	private Node22<T> link;
	
	public Node22(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node22<T> node) {
		this.link = node;
	}
	
	public Node22<T> getLink(){
		return link;
	}
}
