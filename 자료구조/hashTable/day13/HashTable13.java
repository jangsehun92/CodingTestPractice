package codingTest.자료구조.hashTable.day13;

import java.util.LinkedList;

public class HashTable13 {
	
	private LinkedList[] table;
	
	public HashTable13(int size) {
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
	
	public Node13 searchNode(LinkedList<Node13> list, String key) {
		if(list == null) return null;
		for(Node13 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node13> list = table[index];
		if(list == null) {
			list = new LinkedList<>();
			table[index] = list;
		}
		
		Node13 node = searchNode(list, key);
		if(node == null) {
			node = new Node13(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node13> list = table[index];
		Node13 node = searchNode(list, key);
		return node == null ? "not found" : node.getValue();
	}
	
	

}
