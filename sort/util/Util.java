package codingTest.sort.util;

public class Util {
	
	public void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public void print(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
}
