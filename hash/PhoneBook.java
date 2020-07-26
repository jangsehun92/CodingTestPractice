package codingTest.hash;

import java.util.Arrays;

public class PhoneBook {
	public static void main(String[] args) {
		String[] phoneBook = {"12", "13", "56", "567"};
		
		boolean answer = solution(phoneBook);
		System.out.println(answer);
	}
	
	public static boolean solution(String[] phoneBook) {
		Arrays.sort(phoneBook);
		
		for(int i = 0; i < phoneBook.length; i++) {
			for(int j = 0; j < phoneBook.length; j++) {
				if(i==j) {
					continue;
				}
				if(phoneBook[j].startsWith(phoneBook[i])) {
					return false;
				}
			}
		}
		return true;
	}
}


