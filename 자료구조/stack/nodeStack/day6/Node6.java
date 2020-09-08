package codingTest.자료구조.stack.nodeStack.day6;

public class Node6<T> {
	
	private T data;
	private Node6<T> link;
	
	public Node6(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node6<T> node){
		this.link = node;
	}
	
	public Node6<T> getLink(){
		return link;
	}

}
