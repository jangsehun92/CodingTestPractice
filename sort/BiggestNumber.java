package codingTest.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BiggestNumber {
/*
 * 	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
	
	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	
	제한 사항
	numbers의 길이는 1 이상 100,000 이하입니다.
	numbers의 원소는 0 이상 1,000 이하입니다.
	정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 */
	
	public static void main(String[] args) {
		
		//int[] numbers = {3, 30, 34, 5, 9};
		int[] numbers = {1, 2, 3, 4, 5};
		
		
		String answer = solution(numbers);
		
		for(int i = 0; i < answer.length(); i++) {
			System.out.print(answer.charAt(i));
		}
		
		
	}
	
	public static String solution(int[] numbers) {
		String answer = "";
		
		String[] strNumbers = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			strNumbers[i] = String.valueOf(numbers[i]);
			//strNumbers[i] = ""+numbers[i];
			System.out.println(strNumbers[i]);
		}
		
		
		
		Arrays.sort(strNumbers, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				System.out.println("s1 : " + s1 + " s2 : " + s2);
				System.out.println((s2+s1) + " | " +  (s1+s2));
				return (s2+s1).compareTo(s1+s2);
			};
		});
		
		if(strNumbers[0].startsWith("0")) {
			answer += "0";
		}else {
			for(int i = 0; i<strNumbers.length; i++) {
				answer += strNumbers[i];
			}
		}
		
		return answer;
	}
	
	
	public static String solution2(int[] numbers) {
		PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
            	System.out.print("1 : "+s1);
            	System.out.println(" 2 : "+s2);
            	System.out.println("result : " + (Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2)));
                return Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2);
            }
        });
        String ans = "";

        for (int num : numbers) {
        	System.out.println(num);
            pq.offer(String.valueOf(num));
        }

        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        if (ans.charAt(0) == '0')
            return "0";
        else return ans;
	}
	
}
