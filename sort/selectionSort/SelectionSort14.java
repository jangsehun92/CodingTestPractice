package codingTest.sort.selectionSort;

public class SelectionSort14 {
	
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
		int[] arr = {1,0,9,2,8,3,5,7,6,4};
		print(arr);
		selectionSort(arr, 0);
		print(arr);
	}

}
