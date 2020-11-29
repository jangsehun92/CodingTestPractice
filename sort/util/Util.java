package codingTest.sort.util;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Util {
	
	public void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public void print(int[] arr) {
		IntStream intStream = Arrays.stream(arr);
		intStream.forEach(data -> System.out.print(data+", "));
		System.out.println();
	}
	
}
