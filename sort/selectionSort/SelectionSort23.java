package codingTest.sort.selectionSort;

import codingTest.sort.util.ArrayMaker;
import codingTest.sort.util.Util;

public class SelectionSort23 {
	
	public static void selectionSort(int[] arr, int start, Util util) {
		if(start < arr.length-1) {
			int minIndex = start;
			for(int i = start+1; i < arr.length; i++) {
				if(arr[minIndex] > arr[i]) minIndex = i;
			}
			util.swap(arr, start, minIndex);
			selectionSort(arr, start+1, util);
		}
		
	}
	
	public static void main(String[] args) {
		Util util = new Util();
		ArrayMaker arrMaker = new ArrayMaker(10);
		int[] arr = arrMaker.getArray();
		util.print(arr);
		selectionSort(arr, 0, util);
		util.print(arr);
	}

}
