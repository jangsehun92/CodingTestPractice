package codingTest.자료구조.hashTable;

import codingTest.자료구조.hashTable.day13.HashTable13;

public class HashTableMain {
	
	public static void main(String[] args) {
		//HashTable h = new HashTable(5);
		HashTable13 h = new HashTable13(5);
		h.put("sung", "예쁘다 ");
		h.put("jin", "모델이다");
		h.put("hee", "천사다");
		h.put("min", "아름답다");
		
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
	}

}
