package codingTest.sort.quickSort;

public class QuickSort2 {
	
	//재귀 함수는 메모리(스택)에 이전 함수(복사본)의 주소가 저장 : 마지막 호출된 복사본이 종료되면 이전 함수(복사본)으로 돌아감
	public static void quickSort(int[] array, int left, int right) {
		System.out.println("start - left : " + left + " right : " + right);
		//정렬 후 오른쪽 섹션의 첫번째 인덱스를 받는다.
		int rightFirstIndex = partition(array, left, right);
		//왼쪽 섹션의 값이 1개 이상이여야 정렬한다.
		if(left < rightFirstIndex-1) {
			quickSort(array, left, rightFirstIndex-1);
		}
		//오른쪽 섹션 정렬
		if(rightFirstIndex < right) {
			quickSort(array, rightFirstIndex, right);
		}
	}
	
	public static int partition(int[] array, int left, int right) {
		int pivot = array[(left + right)/2];
		System.out.println("left : " + left + " right : " + right); 
		System.out.println("arr["+((left + right) /2)+"] = pivot : " + pivot);
		
		while(left <= right) {
			
			while(array[left] < pivot) {
				left++;
			}
			while(array[right] > pivot) {
				right--;
			}
			printArray(array);
			System.out.println("왼쪽 섹션에서 피봇 보다 크거나 같은 값 : " + array[left] + " 오른쪽 섹션에서 피봇 보다 작거나 같은 값 : " + array[right] );
			if(left <= right) {
				System.out.println("array[" + left+ "]: " + array[left]  + " | array[" + right+ "]: " + array[right] + " 스왑");
				swap(array, left, right);
				left++;
				right--;
			}
			printArray(array);
			System.out.println("------------------------------------------------------------------------------------");
		}
		System.out.println("return right section firstIndex : " + left);
		System.out.println();
		return left;
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
	}
	
	public static void printArray(int[] array) {
		for(int data : array) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] array = {3,9,4,7,5,0,1,6,8,2};
		quickSort(array,0, array.length-1);
		printArray(array);
	}
	
	
}
