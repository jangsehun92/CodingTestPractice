package codingTest.자료구조.stack.nodeStack.day14;

public class Node14<T> {
	
	private T data;
	private Node14<T> link;
	
	public Node14(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node14<T> node) {
		this.link = node;
	}
	
	public Node14<T> getLink(){
		return link;
	}

}
