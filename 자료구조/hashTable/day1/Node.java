package codingTest.자료구조.hashTable.day1;

public class Node {
	private String key;
	private String value;
	
	public Node(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
