package codingTest.자료구조.stack.nodeStack.day7;

public class Node7<T> {
	
	private T data;
	private Node7<T> link;
	
	public Node7(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node7<T> node) {
		this.link = node;
	}
	
	public Node7<T> getLink(){
		return link;
	}

}
