package codingTest.자료구조.stack.nodeStack.day19;

public class Node19<T> {
	
	private T data;
	private Node19<T> link;
	
	public Node19(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node19<T> node) {
		this.link = node;
	}
	
	public Node19<T> getLink(){
		return link;
	}

}
