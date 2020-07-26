package codingTest.hash;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Marathon {
	/*
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * 제한사항 
	 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다. 
	 * completion의 길이는 participant의 길이보다 1 작습니다. 
	 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다. 
	 * 참가자 중에는 동명이인이 있을 수 있습니다.
	 */
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
