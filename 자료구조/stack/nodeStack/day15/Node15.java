package codingTest.자료구조.stack.nodeStack.day15;

public class Node15<T> {
	
	private T data;
	private Node15<T> link;
	
	public Node15(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node15<T> node) {
		this.link = node;
	}
	
	public Node15<T> getLink(){
		return link;
	}

}
