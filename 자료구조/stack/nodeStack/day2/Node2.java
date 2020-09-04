package codingTest.자료구조.stack.nodeStack.day2;

public class Node2<T> {
	
	private T data;
	private Node2<T> link;
	
	public Node2(T data){
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setLink(Node2<T> link) {
		this.link = link;
	}
	
	public Node2<T> getLink() {
		return this.link;
	}
}
