package codingTest.자료구조.stack.nodeStack.day8;

public class Node8<T> {
	
	private T data;
	private Node8<T> link;
	
	public Node8(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node8<T> node) {
		this.link = node;
	}
	
	public Node8<T> getLink(){
		return link;
	}

}
