package codingTest.자료구조.stack;

public class Node<T> {
	
	private T data;
	private Node<T> link;

	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node<T> node) {
		this.link = node;
	}
	
	public Node<T> getLink() {
		return this.link;
	}
	
}
