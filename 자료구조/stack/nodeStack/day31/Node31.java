package codingTest.자료구조.stack.nodeStack.day31;

public class Node31<T> {
	
	private T data;
	private Node31<T> link;
	
	public Node31(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node31<T> node) {
		this.link = node;
	}
	
	public Node31<T> getLink(){
		return link;
	}
}
