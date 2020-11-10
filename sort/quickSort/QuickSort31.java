package codingTest.sort.quickSort;

public class QuickSort31 {
	
	public static void quickSort(int[] arr, int left, int right) {
		int partition = partition(arr, left, right);
		
		if(left < partition-1) quickSort(arr, left, partition-1);
		if(right > partition) quickSort(arr, partition, right);
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) /2];
		
		while(left <= right) {
			while(arr[left] < pivot) left++;
			while(arr[right] > pivot) right--;
			
			if(left <= right) {
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
		for (int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 0, 9, 7, 5, 3, 1 };
		print(arr);
		quickSort(arr, 0, arr.length - 1);
		print(arr);

	}

}
