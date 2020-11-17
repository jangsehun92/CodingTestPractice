package codingTest.자료구조.hashTable.day5;

import java.util.LinkedList;

public class HashTable5 {
	
	private LinkedList[] table;
	
	public HashTable5(int size) {
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
	
	public Node5 searchNode(LinkedList<Node5> list, String key) {
		if(list == null) return null;
		for(Node5 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int index = convertToIndex(getHashCode(key));
		LinkedList<Node5> list = table[index];
		
		if(list == null) {
			list = new LinkedList<Node5>();
			table[index] = list;
		}
		
		Node5 node = searchNode(list, key);
		if(node == null) {
			node = new Node5(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		LinkedList<Node5> list = table[convertToIndex(getHashCode(key))];
		Node5 node = searchNode(list, key);
		return node == null? "Not Found" : node.getValue();
	}
}
