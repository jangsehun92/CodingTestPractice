package codingTest.자료구조.stack.nodeStack.day16;

public class Node16<T> {
	
	private T data;
	private Node16<T> link;
	
	public Node16(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node16<T> node) {
		this.link = node;
	}
	
	public Node16<T> getLink(){
		return link;
	}
 
}
