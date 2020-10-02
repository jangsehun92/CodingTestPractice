package codingTest.자료구조.stack.nodeStack.day28;

public class Node28<T> {
	
	private T data;
	private Node28<T> link;
	
	public Node28(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node28<T> node) {
		this.link = node;
	}
	
	public Node28<T> getLink(){
		return link;
		
	}

}
