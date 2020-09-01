package codingTest.test;

public class LookAndSaySequence {

	public static void main(String[] args) {
		String temp = "1";
		for(int i = 0; i < 10; i++) {
			System.out.println(temp);
			temp = lookAndSay(temp);
		}

	}
	
	public static String lookAndSay(String number) {
		String result = "";
		char firstNum = number.charAt(0);
		int count = 1;
		for(int i = 1; i < number.length(); i++) {
			if(firstNum==number.charAt(i)) {
				count++;
			}else {
				result += firstNum;
				result += count;
				firstNum = number.charAt(i);
				count = 1;
			}
		}
		result += firstNum;
		result += count;
		return result;
	}

}
