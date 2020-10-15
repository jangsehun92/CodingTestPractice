package codingTest.sort.sortTest;

public class Test1 {
	
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
			for(int i = start; i < arr.length; i++) {
				if(arr[minIndex] > arr[i]) minIndex = i;
			}
			swap(arr, start, minIndex);
			selectionSort(arr, start+1);
		}
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		int rightFirstIndex = partition(arr, left, right);
		
		if(left < rightFirstIndex-1)quickSort(arr, left, rightFirstIndex-1);
		if(right > rightFirstIndex) quickSort(arr, rightFirstIndex, right);
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) /2];
		
		while(left<=right) {
			while(arr[left] < pivot) left++;
			while(arr[right] > pivot) right--;
			if(left<=right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
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
		
		int[] arr = {1,6,8,9,0,7,4,2,3,5};
//		print(arr);
//		quickSort(arr, 0, arr.length-1);
//		print(arr);
		
//		print(arr);
//		bubbleSort(arr, arr.length-1);
//		print(arr);
		
		print(arr);
		selectionSort(arr, 0);
		print(arr);
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
}
