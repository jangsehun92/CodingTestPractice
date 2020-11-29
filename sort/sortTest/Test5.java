package codingTest.sort.sortTest;

import codingTest.sort.util.ArrayMaker;
import codingTest.sort.util.Util;

public class Test5 {
	
	public static void bubbleSort(int[] arr, int last, Util util) {
		if(0 < last) {
			for(int i = 1; i < arr.length; i++) {
				if(arr[i-1] > arr[i]) {
					util.swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1, util);
		}
	}
	
	public static void selectionSort(int[] arr, int start, Util util) {
		if(start < arr.length-1) {
			int minIndex = start;
			for(int i = start+1; i < arr.length; i++) {
				if(arr[minIndex] > arr[i]) minIndex = i;
			}
			util.swap(arr, minIndex, start);
			selectionSort(arr, start+1, util);
		}
	}
	
	public static void quickSort(int[] arr, int left, int right, Util util) {
		int partition = partition(arr, left, right, util);
		
		if(left < partition-1) quickSort(arr, left, partition-1, util);
		
		if(right > partition) quickSort(arr, partition, right, util);
	}
	
	public static int partition(int[] arr, int left, int right, Util util) {
		int pivot = arr[(left + right) /2];
		
		while(left <= right) {
			while(arr[left] < pivot)	left++;
			while(arr[right] > pivot)	right--;
			
			if(left <= right) {
				util.swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	
	
	public static void main(String[] args) {
		
		Util util = new Util();
		ArrayMaker arrMaker = new ArrayMaker(10);
		int[] arr = arrMaker.getArray();
		
		util.print(arr);
		//bubbleSort(arr, arr.length-1, util);
		//selectionSort(arr, 0, util);
		quickSort(arr, 0, arr.length-1, util);
		util.print(arr);
	}

}
