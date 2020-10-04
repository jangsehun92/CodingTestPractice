package codingTest.자료구조.stack.nodeStack.day30;

public class Node30<T> {
	
	private T data;
	private Node30<T> link;
	
	public Node30(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node30<T> node) {
		this.link = node;
	}
	
	public Node30<T> getLink(){
		return link;
	}

}
