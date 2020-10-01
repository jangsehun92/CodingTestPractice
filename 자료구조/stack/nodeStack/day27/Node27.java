package codingTest.자료구조.stack.nodeStack.day27;

public class Node27<T> {
	
	private T data;
	private Node27<T> link;
	
	public Node27(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node27<T> node) {
		this.link = node;
	}
	
	public Node27<T> getLink(){
		return link;
	}

}
