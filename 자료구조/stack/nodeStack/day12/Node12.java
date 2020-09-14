package codingTest.자료구조.stack.nodeStack.day12;

public class Node12<T> {
	
	private T data;
	private Node12<T> link;
	
	public Node12(T data){
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node12<T> node) {
		this.link = node;
	}
	
	public Node12<T> getLink(){
		return link;
	}

}
