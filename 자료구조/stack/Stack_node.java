package codingTest.자료구조.stack;

import java.util.EmptyStackException;

public class Stack_node<T> {

	private Node<T> top;

	public void push(T data) {
		// 새로운 node 생성
		Node<T> node = new Node<>(data);
		//Stack 내 top node를 link로 연결한다.
		node.setLink(top);
		//top node를 새로 생성한 Node로 변경한다.
		top = node;
		System.out.println(top);
	}

	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		T data = top.getData();
		top = top.getLink();
		return data;
	}

	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.getData();
	}

}
