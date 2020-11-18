package codingTest.자료구조.hashTable.day6;

import java.util.LinkedList;

public class HashTable6 {

    private LinkedList[] table;

    public HashTable6(int size){
        this.table = new LinkedList[size];
    }

    public int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            hashCode += c;
        }
        return hashCode;
    }

    public int convertToIndex(int hashCode){
        return hashCode % table.length;
    }

    public Node6 searchNode(LinkedList<Node6> list, String key){
        if(list == null) return null;
        for(Node6 node : list){
            if(node.getKey().equals(key)){
                return node;
            }
        }
        return null;
    }

    public void put(String key, String value){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        LinkedList<Node6> list = table[index];
        if(list == null){
            list = new LinkedList<>();
            table[index] = list;
        }

        Node6 node = searchNode(list, key);

        if(node == null){
            node = new Node6(key, value);
            list.addLast(node);
        }
        else{
            node.setValue(value);
        }
    }

    public String get(String key){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        LinkedList<Node6> list = table[index];
        Node6 node = searchNode(list, key);
        return node == null ? "Not Found" : node.getValue();
    }

}