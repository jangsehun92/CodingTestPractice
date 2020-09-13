package codingTest.자료구조.stack.nodeStack.day11;

public class Node11<T> {
	
	private T data;
	private Node11<T> link;
	
	public Node11(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node11<T> node) {
		this.link = node;
	}
	
	public Node11<T> getLink(){
		return link;
	}

}
