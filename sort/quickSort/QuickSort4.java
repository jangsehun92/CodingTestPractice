package codingTest.sort.quickSort;

public class QuickSort4 {
	
	public static void quickSort(int[] arr, int left, int right) {
		
		int partition2 = partition(arr, left, right);
		
		if(left < partition2-1) {
			quickSort(arr, left, partition2-1);
		}
		
		if(partition2 < right) {
			quickSort(arr, partition2, right);
		}
		
	}
	
	public static int partition(int[] arr, int left, int right) {
		//기준이 될 피봇값 정하기
		int pivot = arr[(left+right)/2];
		
		//왼쪽을 확인하는 값이 오른쪽을 확인하는 값보다 작거나 같을때 까지만 반복(left값이 right값을 넘어서는 순간 빠져나옴)
		while(left <= right) {
			//arr[left]의 값이 pivot값보다 작으면 left값을 증가시켜 배열의 다음값을 확인한다.
			while(arr[left] < pivot) left++; //left섹션에서 pivot값보다 큰값을 찾으면 빠져나온다.
			while(arr[right] > pivot) right--; //right섹션에서 pivot값보다 작은 값을 찾으면 빠져나온다.
			
			//left값이 right값과 같거나 right값이 더 크면 pivot을 기준으로 양쪽에서 바꿀 index를 찾았다는 것
			if(left <= right) {
				//왼쪽에서는 pivot값보다 크거나 같은 값, 오른쪽에서는 pivot값 보다 작거나 같은 값을 스왑한다.
				swap(arr, left, right);
				//스왑이 이루어진 후에는 각각 ++ , -- 를 해주어 배열의 다음 값을 보도록한다.
				left++;
				right--;
			}
		}
		
		//리턴 되어지는 left값은 다음번 검사할 오른쪽 섹션의 첫번째 index값이 된다.
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
