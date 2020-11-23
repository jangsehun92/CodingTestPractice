package codingTest.sort.sortTest;

import codingTest.sort.bubbleSort.BubbleSort;

public class Test4 {
	
	public static void quickSort(int[] arr, int left, int right) {
		int partition = partition(arr, left, right);
		if(left < partition-1) quickSort(arr, left, partition-1);
		if(right > partition) quickSort(arr, partition, right);
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right)/2];
		while(left <= right) {
			while(pivot > arr[left]) left++;
			while(pivot < arr[right]) right--;
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void bubbleSort(int[] arr, int last) {
		if(0 < last) {
			for(int i = 1; i <= last; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1);
		}
	}
	
	public static void selectionSort(int[] arr, int start) {
		if(start < arr.length-1) {
			int minIndex = start;
			for(int i = start+1; i < arr.length; i++) {
				if(arr[minIndex] > arr[i]) minIndex = i;
			}
			swap(arr, start, minIndex);
			selectionSort(arr, start+1);
		}
	}
	
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void print(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}	
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,6,5,7,9,8,0,1};
		print(arr);
		//quickSort(arr, 0, arr.length-1);
		//bubbleSort(arr, arr.length-1);
		selectionSort(arr, 0);
		print(arr);
	}

}
