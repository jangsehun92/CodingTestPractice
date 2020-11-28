package codingTest.sort.util;

public class ArrayMaker {

	private int size;
	private int[] arr;

	public ArrayMaker(int size) {
		this.size = size;
		this.arr = new int[size];
		make(0);
	}

	public void make(int count) {
		if(count < arr.length) {
			int number = (int)(Math.random() * size);
			while(0 < count) {
				if(checkNumber(number, count)) {
					number = (int)(Math.random() * size);
				} else {
					break;
				}
			}
			arr[count] = number;
			make(count+1);
		}
	}

	public boolean checkNumber(int number, int count) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == number)
				return true;
		}
		return false;
	}

	public int[] getArray() {
		return arr;
	}

}
