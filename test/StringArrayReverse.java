package codingTest.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayReverse {
	
	public static void main(String[] args) {
		String[] words = { "A", "B", "C", "D"};
		
		System.out.println(Arrays.toString(words));
		
		List<String> StringList = Arrays.asList(words);
		
		Collections.reverse(StringList);
		
		words = StringList.toArray(new String[StringList.size()]);
		
		System.out.println(Arrays.toString(words));
	}

}
