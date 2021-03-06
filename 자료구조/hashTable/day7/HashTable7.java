package codingTest.자료구조.hashTable.day7;

import java.util.LinkedList;

public class HashTable7 {
	
	private LinkedList[] table;
	
	public HashTable7(int size) {
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
	
	public Node7 searchNode(LinkedList<Node7> list, String key) {
		if(list == null) return null;
		for(Node7 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node7> list = table[index];
		if(list == null) {
			list = new LinkedList<Node7>();
			table[index] = list;
		}
		
		Node7 node = searchNode(list, key);
		if(node == null) {
			node = new Node7(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node7> list = table[index];
		Node7 node = searchNode(list, key);
		return node == null? "Not Found" : node.getValue();
	}

}
