package codingTest.test;

public class LookAndSaySequence {

	public static void main(String[] args) {
		String result = "1";
		for(int i = 0; i < 10; i++) {
			System.out.println(result);
			result = lookAndSay(result);
		}

	}
	
	public static String lookAndSay(String numbers) {
		String result = "";
		char number = numbers.charAt(0);
		int count = 1;
		for(int i = 1; i < numbers.length(); i++) {
			if(number==numbers.charAt(i)) {
				count++;
			}else {
				result += number;
				result += count;
				number = numbers.charAt(i);
				count = 1;
			}
		}
		result += number;
		result += count;
		return result;
	}

}
