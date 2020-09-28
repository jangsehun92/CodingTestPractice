package codingTest.자료구조.stack.nodeStack.day25;

public class Node25<T> {
	
	private T data;
	private Node25<T> link;
	
	public Node25(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node25<T> node) {
		this.link = node;
	}
	
	public Node25<T> getLink(){
		return link;
	}

}
