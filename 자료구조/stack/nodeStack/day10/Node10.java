package codingTest.자료구조.stack.nodeStack.day10;

public class Node10<T> {
	
	private T data;
	private Node10<T> link;
	
	public Node10(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node10<T> node) {
		this.link = node;
	}
	
	public Node10<T> getLink(){
		return link;
	}

}
