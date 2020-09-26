package codingTest.자료구조.stack.nodeStack.day23;

public class Node23<T> {
	
	private T data;
	private Node23<T> link;
	
	public Node23(T data){
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node23<T> node) {
		this.link = node;
	}
	
	public Node23<T> getLink(){
		return link;
	}

}
