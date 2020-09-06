package codingTest.자료구조.stack.nodeStack.day4;

public class Node4<T> {
	
	private T data;
	private Node4<T> link;
	
	public Node4(T data){
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node4<T> node) {
		this.link = node;
	}
	
	public Node4<T> getLink(){
		return link;
	}

}
