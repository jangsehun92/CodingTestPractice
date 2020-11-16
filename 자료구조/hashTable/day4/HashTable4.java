package codingTest.자료구조.hashTable.day4;

import java.util.LinkedList;

public class HashTable4 {
	
	private LinkedList[] table;
	
	public HashTable4(int size) {
		this.table = new LinkedList[size];
	}
	
	public int getHashCode(String key) {
		int hashCode = 0;
		for(char c : key.toCharArray()) {
			hashCode += c;
		}
		return hashCode;
	}
	
	public int convertToIndex(int hashCode) {
		return hashCode % table.length;
	}
	
	public Node4 searchNode(LinkedList<Node4> list, String key) {
		if(list == null) return null;
		for(Node4 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int index = convertToIndex(getHashCode(key));
		LinkedList<Node4> list = table[index];
		
		if(list == null) {
			list = new LinkedList<Node4>();
			table[index] = list;
		}
		
		Node4 node = searchNode(list, key);
		if(node == null) {
			node = new Node4(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		LinkedList<Node4> list = table[convertToIndex(getHashCode(key))];
		
		Node4 node = searchNode(list, key);
		return node == null? "Not found" : node.getValue();
		
	}
	
	
}
