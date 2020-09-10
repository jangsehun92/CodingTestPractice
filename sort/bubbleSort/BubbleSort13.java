package codingTest.sort.bubbleSort;

public class BubbleSort13 {
	
	public static void bubbleSort(int[] arr, int last) {
		if(last > 0) {
			for(int i = 1; i <= last; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			
			bubbleSort(arr, last-1);
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
		int[] arr = {6,9,0,3,8,5,4,7,1,2};
		
		print(arr);
		bubbleSort(arr, arr.length-1);
		print(arr);
	}

}
