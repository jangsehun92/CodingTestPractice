package codingTest.sort.bubbleSort;

public class BubbleSort3 {
	
	public static void bubbleSort(int[] arr, int last) {
		//맨 오른쪽에 가장큰 숫자가 들어가는 것이 한 사이클
		if(last > 0) {
			//last값 까지 반복한다.
			for(int i = 1; i <= last; i++) {
				//왼쪽값이 오른쪽 값보다 크다면
				if(arr[i-1] > arr[i]) {
					//스왑
					swap(arr, i-1, i);
				}
			}
			//정렬이 끝나면 재귀호출한다. 
			//배열의 모든 곳을 돌며 비교하여 스왑하는 과정을 거치면 맨 오른쪽엔 가장큰 수가 가게된다. 그러므로 마지막 값은 비교하지않게 last값을 -1 해준다. 
			bubbleSort(arr, last-1);
		}
	}
	
	public static void swap(int[] arr, int leftIndex, int rightIndex) {
		int temp = arr[leftIndex];
		arr[leftIndex] = arr[rightIndex];
		arr[rightIndex] = temp;
	}
	
	public static void print(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {7,9,5,6,2,1,3,8,0,4};
		print(arr);
		bubbleSort(arr, arr.length-1);
		print(arr);
	}

}
