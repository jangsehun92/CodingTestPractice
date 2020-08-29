package codingTest.sort.quickSort;

public class QuickSort3 {
	
	public static void quickSort(int[] arr, int left, int right) {
		
		int firstRightIndex = partition(arr, left, right);
		
		//왼쪽 섹션 정리
		if(left < firstRightIndex-1) {
			quickSort(arr, left, firstRightIndex-1);
		}
		//오른쪽 섹션 정리
		if(firstRightIndex < right) {
			quickSort(arr, firstRightIndex, right);
		}
		
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left+right)/2];
		//int pivot = arr[(int)(Math.random() * arr.length)];
		
		//왼쪽 섹션의 index값이 오른쪽 섹션의 index를 지나치면 멈춘다.
		while(left <= right) {
			
			//왼쪽 섹션에서 pivot의 값보다 크거나 같은 값을 찾을때 까지 index값이 증가한다.
			while(arr[left] < pivot) left++;
			
			//오른쪽 섹션에서 pivot의 값보다 작거나 같은 값을 찾을때 까지 index값이 감소한다.
			while(arr[right] > pivot) right--;
			
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void print(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		
		print(arr);
		quickSort(arr, 0, arr.length-1);
		print(arr);
		
	}

}
