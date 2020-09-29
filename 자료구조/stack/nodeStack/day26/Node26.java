package codingTest.자료구조.stack.nodeStack.day26;

public class Node26<T> {
	
	private T data;
	private Node26<T> link;
	
	public Node26(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node26<T> node) {
		this.link = node;
	}
	
	public Node26<T> getLink(){
		return link;
	}

}
