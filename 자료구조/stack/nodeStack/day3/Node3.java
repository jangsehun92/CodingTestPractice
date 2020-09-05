package codingTest.자료구조.stack.nodeStack.day3;

public class Node3<T> {
	
	private T data;
	private Node3<T> link;
	
	public Node3(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public Node3<T> getLink(){
		return link;
	}
	
	public void setLink(Node3<T> node) {
		this.link = node;
	}

}
