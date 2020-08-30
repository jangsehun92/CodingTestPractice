package codingTest.test;

public class FibonacciNumber {
	
	public static int sum(int number) {
		if(number==0) {
			return 0;
		}else if(number==1) {
			return 1;
		}else {
			return sum(number-1) + sum(number-2);
		}
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++) {
			System.out.println(sum(i));
		}
		
	}

}
