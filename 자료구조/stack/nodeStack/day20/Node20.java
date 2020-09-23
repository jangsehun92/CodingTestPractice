package codingTest.자료구조.stack.nodeStack.day20;

public class Node20<T> {
	
	private T data;
	private Node20<T> link;
	
	public Node20(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node20<T> node) {
		this.link = node;
	}
	
	public Node20<T> getLink(){
		return link;
	}

}
