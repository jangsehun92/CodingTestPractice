package codingTest.test;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String inputString = "ABCD";
		
		System.out.println(reverse(inputString));
		System.out.println(reverse2(inputString));
		
	}
	
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static String reverse2(String s) {
		return new StringBuffer(s).reverse().toString();
	}

}
