package codingTest.자료구조.hashTable.day12;

import java.util.LinkedList;

public class HashTable12 {
	
	private LinkedList[] table;
	
	public HashTable12(int size) {
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
	
	public Node12 searchNode(LinkedList<Node12> list, String key) {
		if(list == null) return null;
		for(Node12 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node12> list = table[index];
		if(list == null) {
			list = new LinkedList<Node12>();
			table[index] = list;
		}
		
		Node12 node = searchNode(list, key);
		if(node == null) {
			node = new Node12(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node12> list = table[index];
		Node12 node = searchNode(list, key);
		
		return node == null?"notFound" : node.getValue();
	}
	
	

}
