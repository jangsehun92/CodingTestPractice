package codingTest.자료구조.hashTable;

import java.util.LinkedList;

//function() > hashCode > hashTable > value
//검색하고자하는 키값을 입력받아 해쉬함수를 돌려서 반환받은 해쉬코드를 인덱스로 환산해서 데이터에 접근하는 자료구조
public class HashTable {
	
	private LinkedList<Node>[] data;
	
	//size만큼 LinkedList배열을 선언한다.
	public HashTable(int size) {
		this.data = new LinkedList[size];
	}
	
	//해당 key값의 해쉬코드를 구한다.
	public int getHashCode(String key) {
		int hashCode = 0;
		for(char c : key.toCharArray()) {
			hashCode += c;
		}
		return hashCode;
	}
	
	//해당 key값의 해쉬코드를 인덱스로 환산한다.
	public int convertToIndex(int hashCode) {
		return hashCode % data.length;
	}
	
	//LinkedList안에 해당 key값으로 데이터가 있는지 확인한다.
	public Node searchKey(LinkedList<Node> list, String key) {
		if(list == null)return null;
		for(Node node : list) {
			if(node.getKey().equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		//key값의 hashCode값을 가져온다.
		int hashCode = getHashCode(key);
		//key값의 hashCode값을 Index값으로 변환한다.
		int index = convertToIndex(hashCode);
		
		System.out.println(key + ", hashCode( " + hashCode + " ), index ( " + index + " )");
		
		//해당 key값의 hashCode값의 인덱스 값으로 LinkedList[]내에서 해당 index에 해당하는 LinkedList<Node>를 찾는다.
		LinkedList<Node> list = data[index];
		
		//list가 비어있다면 새로운 리스트를 선언해주고 해당 index에 list를 보게한다.
		if(list == null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		
		//키값 중복인지 확인한다.
		Node node = searchKey(list, key);
		
		//키 값이 중복되지 않았다면 새로운 노드를 추가한다.
		if(node == null) {
			list.addLast(new Node(key, value));
		}
		//키 값이 중복 되었다면 해당 키값의 노드의 value를 새로운 value값으로 대체한다.
		else {
			node.setValue(value);
		}
	}
	
	public String get(String key) {
		//key값의 해쉬코드를 가져온다.
		int hashCode = getHashCode(key);
		//key값의 해쉬코드의 index를 가져온다.
		int index = convertToIndex(hashCode);
		//key값의 해쉬코드의 index값으로 LinkedList배열 내 해당 LinkedList를 가져온다.
		LinkedList<Node> list = data[index];
		//해당 linkedList내에 key값이 존재 하는지 찾는다.
		Node node = searchKey(list, key);
		return node == null? "Not found" : node.getValue();
	}
	
}
