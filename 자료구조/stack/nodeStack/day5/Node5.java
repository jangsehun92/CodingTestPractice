package codingTest.자료구조.stack.nodeStack.day5;

public class Node5<T> {
	
	private T data;
	private Node5<T> link;
	
	public Node5(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setLink(Node5<T> node) {
		this.link = node;
	}
	
	public Node5<T> getLink() {
		return link;
	}

}
