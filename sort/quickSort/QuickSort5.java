package codingTest.sort.quickSort;

public class QuickSort5 {
	
	public static void quickSort(int[] arr, int left, int right) {
		int rightFirstIndex = partition(arr, left, right);
		
		//rightFirstIndex-1 한 값이 left보다 크지 않다면 왼쪽에 정렬할 값이 없다는 것이다.
		if(left < rightFirstIndex-1) {
			quickSort(arr, left, rightFirstIndex-1);
		}
		//right의 값이 rightFirstIndex의 값보다 크면 아직 정렬할 값이 있다.
		if(right > rightFirstIndex) {
			quickSort(arr, rightFirstIndex, right);
		}
	}
	
	public static int partition(int[] arr, int left, int right) {
		//피봇값을 정해준다.(배열 중간의 값을 피봇으로 정했다.)
		int pivot = arr[(left+right)/2];
		
		//비교를 위해 증감하는 left,right값이 서로 같아지거나 right가 더 작다는 것은 서로 지나쳤다는 것이다.
		while(left<=right) {
			//피봇 값을 중심으로 왼쪽에서 피봇보다 크거나 같은 값을 찾는다.
			while(arr[left] < pivot) left++;
			//피봇 값을 중심으로 오른쪽에서 피봇보다 작거나 같은 값을 찾는다.
			while(arr[right] > pivot) right--;
			
			//서로 지나치지만 않았다면 스왑해준다.(같은 index의 같은 값을 보고 있어도 스왑이 이루어진다.)
			if(left<=right) {
				swap(arr, left, right);
				//스왑 후 서로 값을 증감한다.
				left++;
				right--;
			}
		}
		//left의 값을 돌려준다.(left의 값은 재귀호출을 통해 오른쪽 섹션 첫번째 index값이 된다.)
		return left;
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
		int[] arr = {7,9,5,6,2,1,3,8,0,4};
		print(arr);
		//첫 호출 할때, 0과 배열의 길이-1 값을 보내준다.
		quickSort(arr, 0, arr.length-1);
		print(arr);
	}

}
