package codingTest.hash;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Marathon {

	public static void main(String[] args) {
		String[] participant = {"장세훈","장세훈","세종대왕","이순신"};
		String[] completion = {"장세훈","이순신","세종대왕"};
		
		String answer = solution1(participant, completion);
		String answer2 = solution2(participant, completion);
		System.out.println(answer);
		System.out.println(answer2);

	}
	
	public static String solution1(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int size = completion.length;
		
		for(int i = 0; i < size; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[size];
	}
	
	public static String solution2(String[] participant, String[] completion) {
		String result = "";
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for(String player : participant) {
			hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
		}
		
		for(String player : completion) {
			hashMap.put(player, hashMap.get(player) - 1);
		}
		
		for(String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
			if(hashMap.get(key)!= 0) {
				result = key;
			}
		}
		
		return result;
	}

}
