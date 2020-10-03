package codingTest.자료구조.stack.nodeStack.day29;

public class Node29<T> {
	
	private T data;
	private Node29<T> link;
	
	public Node29(T data){
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node29<T> node) {
		this.link = node;
	}
	
	public Node29<T> getLink(){
		return link;
	}

}
