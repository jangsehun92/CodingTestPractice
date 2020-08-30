package codingTest.sort.bubbleSort;

public class BubbleSort2 {
	
	public static void bubbleSort(int[] arr, int last) {
		
		//재귀적으로 처리하는 방법
		if(last > 0) {
			for(int i = 1; i < arr.length; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1);
		}
		
		//2중 포문으로 처리하는 방법
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 1; j < arr.length; j++) {
//				if(arr[j-1] < arr[j]) {
//					swap(arr, j-1, j);
//				}
//			}
//		}
	}
	
	//스왑 함수
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	//출력 함수
	public static void print(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		print(arr);
		bubbleSort(arr, arr.length-1);
		print(arr);
	}

}
