package codingTest.자료구조.hashTable.day9;

import java.util.LinkedList;

public class HashTable9 {
	
	private LinkedList[] table;
	
	public HashTable9(int size) {
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
	
	public Node9 searchNode(LinkedList<Node9> list, String key) {
		if(list == null) return null;
		for(Node9 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node9> list = table[index];
		if(list == null) {
			list = new LinkedList<Node9>();
			table[index] = list;
		}
		
		Node9 node = searchNode(list, key);
		if(node == null) {
			node = new Node9(key, value);
			list.addLast(node);
		} else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node9> list = table[index];
		Node9 node = searchNode(list, key);
		return node == null ? "Not Found":node.getValue();
	}
	
}
