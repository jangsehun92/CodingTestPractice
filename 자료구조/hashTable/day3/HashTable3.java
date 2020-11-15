package codingTest.자료구조.hashTable.day3;

import java.util.LinkedList;

public class HashTable3 {
	
	private LinkedList[] table;
	
	public HashTable3(int size) {
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
	
	public Node3 searchKey(LinkedList<Node3> list, String key) {
		if(list == null) return null;
		for(Node3 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node3> list = table[index];
		
		if(list == null) {
			list = new LinkedList<Node3>();
			table[index] = list;
		}
		
		Node3 node = searchKey(list, key);
		if(node == null) {
			node = new Node3(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node3> list = table[index];
		Node3 node = searchKey(list, key);
		return node==null? "Not Found" : node.getValue();
	}

}
