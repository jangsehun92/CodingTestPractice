package codingTest.자료구조.hashTable.day10;

import java.util.LinkedList;

public class HashTable10 {
	
	private LinkedList[] table;
	
	public HashTable10(int size) {
		this.table = new LinkedList[size];
	}
	
	public int getHashCode(String key) {
		int hashCode = 0;
		for(char c : key.toCharArray()) {
			hashCode += c;
		}
		return hashCode;
	}
	
	public int converToIndex(int hashCode) {
		return hashCode % table.length;
	}
	
	public Node10 searchNode(LinkedList<Node10> list,String key) {
		if(list == null) return null;
		for(Node10 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}

	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = converToIndex(hashCode);
		
		LinkedList<Node10> list = table[index];
		if(list == null) {
			list = new LinkedList<Node10>();
			table[index] = list;
		}
		
		Node10 node = searchNode(list, key);
		if(node == null) {
			node = new Node10(key,value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = converToIndex(hashCode);
		
		LinkedList<Node10> list = table[index];
		Node10 node = searchNode(list, key);
		
		return node == null ? "not found" : node.getValue();
	}
	
}
