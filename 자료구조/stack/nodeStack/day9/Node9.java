package codingTest.자료구조.stack.nodeStack.day9;

public class Node9<T> {
	
	private T data;
	private Node9<T> link;
	
	public Node9(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node9<T> node) {
		this.link = node;
	}
	
	public Node9<T> getLink() {
		return link;
	}

}
