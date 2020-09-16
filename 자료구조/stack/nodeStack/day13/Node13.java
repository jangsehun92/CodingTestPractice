package codingTest.자료구조.stack.nodeStack.day13;

public class Node13<T> {
	
	private T data;
	private Node13<T> link;
	
	public Node13(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node13<T> node) {
		this.link = node;
	}
	
	public Node13<T> getLink(){
		return link;
	}

}
