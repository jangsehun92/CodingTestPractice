package codingTest.자료구조.stack.nodeStack.day21;

public class Node21<T> {
	
	private T data;
	private Node21<T> link;
	
	public Node21(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node21<T> node) {
		this.link = node;
	}
	
	public Node21<T> getLink(){
		return link;
	}
}
