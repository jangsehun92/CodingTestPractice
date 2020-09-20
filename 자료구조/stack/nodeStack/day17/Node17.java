package codingTest.자료구조.stack.nodeStack.day17;

public class Node17<T> {
	
	private T data;
	private Node17<T> link;
	
	public Node17(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node17<T> node){
		this.link = node;
	}
	
	public Node17<T> getLink(){
		return link;
	}

}
