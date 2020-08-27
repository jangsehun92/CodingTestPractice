package codingTest.sort.quickSort;

public class QuickSort {
	
	private static void quickSort(int[] arr, int start, int end) {
		//2. pivot 값을 기준으로 구역을 나누고 왼쪽은 pivot값 보다 작은 값 오른쪽은 pivot값 보다 큰 값으로 서로 스왑하는 partition호출
		int part2 = partition(arr, start, end); //partition함수의 return 값은 pivot값을 기준으로 한번 정렬한 후, 오른쪽 파트의 첫번째 인덱스이다.
		System.out.println();
		//start값이 (오른쪽 섹션의 값-1)값보다 작으면 스스로를 호출한다. (오른쪽 섹션의 값[part2]이 1이면 왼쪽 섹션은 하나의 값만 존재한다는 뜻)
		if(start < part2 -1) {	//오른쪽 파티션이 시작점 바로 다음에서 시작한다면 왼쪽 파티션에 데이터가 1개 뿐이라 하지않음 시작점에서 한개 이상의 차이가 날때만 정렬
			quickSort(arr, start, part2 -1); 
		}
		//9. 왼쪽 섹션이 모두 Sort가 되면 이제 오른쪽으로 넘어간다.(part2값은 마지막 왼쪽 섹션을 Sort할 때의 값)
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
		
	}
	
	private static int partition(int[] arr, int start, int end) {
		System.out.println("start_index : " + start + " end_index : " + end);
		//3. 기준이 될 pivot값을 구한다.(start index 값과 end index값을 더해준 후 나누어 pivot값이 될 arr의 index를 구한다.)
		int pivot = arr[(start + end) /2];
		System.out.println("arr["+(arr[(start + end) /2])+"] pivot : " + pivot);
		//4. start index값이 end값보다 클때까지 반복(왼쪽 기준 index가 오른쪽 index를 넘어가면 멈춘다.
		while(start <= end) {
			//5. start index를 이용하여 pivot값보다 큰 값을 찾을 동안 index를 오른쪽으로 밀어준다.
			while(arr[start] < pivot) {
				start++;
			}
			//6. end index를 이용하여 pivot값보다 작은 값을 찾을 동안 index를 왼쪽으로 밀어준다.
			while(arr[end] > pivot) {
				end--;
			}
			printArray(arr);
			System.out.println("pivot(arr[" +(pivot-1)+ "]: "+arr[pivot-1]+")을 기준으로 왼쪽에서 pivot 보다 크거나 같은 값 : arr[" + start+ "] : " + arr[start]  + " / 오른쪽에서 pivot 보다 작거나 같은 값 : arr[" + end+ "] : " + arr[end]);
			//7. 위의 반복문에서 찾은 arr[start]=pivot보다 큰 값, arr[end]=pivot보다 작은 값을 
			// 현재 start index보다 end index가 클 때 arr[start] 값과 arr[end] 값을 스왑한다.
			// 값을 스왑 후 이제 start ++, end -- 를 통해 다음 index를 가르킨다.
			if(start <= end) {
				System.out.println("arr[" + start+ "]: " + arr[start]  + " | arr[" + end+ "]: " + arr[end] + " 스왑");
				swap(arr, start, end);
				start++;
				end--;
			}
			printArray(arr);
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			
		}
		System.out.println("return start : " + start);
		//8. pivot값을 기준으로 양쪽이 스왑이 끝나면 이제 start값(여기서 돌려주는것은 처음시작한 pivot index값의 이다)
		return start;
	}
	
	private static void swap(int[] arr, int start, int end ) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	private static void printArray(int[] arr) {
		
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		
		//1. 함수를 호출할 때, start값은 arr[0]을 가르킬수 있게 0, end값은 arr[arr.lenght-1] 즉, 배열의 첫번째와 마지막을 알려준다.
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
}
