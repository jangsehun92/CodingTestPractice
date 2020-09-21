package codingTest.자료구조.stack.nodeStack.day18;

public class Node18<T> {
	
	private T data;
	private Node18<T> link;
	
	public Node18(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node18<T> node) {
		this.link = node;
	}
	
	public Node18<T> getLink(){
		return link;
	}

}
