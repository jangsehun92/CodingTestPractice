package codingTest.자료구조.hashTable.day2;

import java.util.LinkedList;

public class HashTable2 {
	
	private LinkedList<Node2>[] table;
	
	public HashTable2(int size) {
		this.table = new LinkedList[size];
	}
	
	//key값 > hashCode
	public int getHashCode(String key) {
		int hashCode = 0;
		for(char c : key.toCharArray()) {
			hashCode += c;
		}
		return hashCode;
	}
	//hashCode > index
	public int convertToIndex(int hashCode) {
		return hashCode % table.length;
	}
	
	//table 내에 해당 key값으로 값이 존재하는지 
	public Node2 searchKey(LinkedList<Node2> list ,String key) {
		if(list == null) return null;
		for(Node2 node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		System.out.println("key : " + key + "\tvalue : " + value + "\thashCode : " + hashCode + "\tindex : " + index);
		
		LinkedList<Node2> list = table[index];
		if(list == null) {
			list = new LinkedList<Node2>();
			table[index] = list;
		}
		
		Node2 node = searchKey(list, key);
		if(node == null) {
			node = new Node2(key, value);
			list.addLast(node);
		}else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		
		LinkedList<Node2> list = table[index];
		Node2 node = searchKey(list, key);
		return node==null? " Not Found " : node.getValue(); 
	}

}
