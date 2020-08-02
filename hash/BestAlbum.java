package codingTest.hash;

import java.util.HashMap;
import java.util.Map;

public class BestAlbum {
	/*
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 
	 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
	 * 
	 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다. 
	 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다. 
	 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다. 
	 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수
	 * 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 */
	public static void main(String[] args) {

		//String[] genres = { "classic", "pop", "classic", "classic", "pop", "jazz" , "jazz", "kpop" };
		//int[] plays = { 120, 6000, 120, 800, 6000, 10000, 1000, 999 };
		
		String[] genres = { "classic", "pop", "classic", "pop", "classic", "pop" };
		int[] plays = { 500, 500, 500, 500, 500, 500 };

		int[] answer = solution(genres, plays);
		
		for(int i = 0; i < answer.length; i ++) {
			System.out.print(answer[i]);
		}

	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		
		//각 장르에 포함되는 index값 구하기
		HashMap<String, String> genreMap = new HashMap<String, String>();
		for (int i = 0; i < genres.length; i++) {
			genreMap.put(genres[i], genreMap.getOrDefault(genres[i], "") + i);
		}
		System.out.println("genreMap : " + genreMap);

		HashMap<String, Integer> sumMap = new HashMap<String, Integer>();
		Map<String, Integer> orderMap = new HashMap<String, Integer>();

		//각 장르의 재생수 구하기
		for (String key : genreMap.keySet()) {
			sumMap.put(key, sum(key, genres, plays));
		}
		System.out.println("sumMap : " + sumMap);
		
		int count = genreMap.size();
		for (String firstKey : genreMap.keySet()) {
			for (String secondKey : sumMap.keySet()) {
				if (firstKey.equals(secondKey)) {
					continue;
				}
				if (sumMap.get(firstKey) >= sumMap.get(secondKey)) {
					count--;
				}
			}
			orderMap.put(firstKey, count);
			count = genreMap.size();
		}
		System.out.println("orderMap : " + orderMap);
		String result = "";
		int musicCount = 0;
		System.out.println("---장르 내에서 많이 재생된 노래 2개--");
		for(int i = 1; i < genreMap.size()+1; i++) {
			String orderKey = getKey(orderMap, i);
			System.out.println(orderKey);
			for(int first = 0; first < genreMap.get(orderKey).length(); first++) {
				int index = genreMap.get(orderKey).charAt(first)-'0';
				int temp = plays[index];
				
				for(int second = 0; second < genreMap.get(orderKey).length(); second++) {
					if(genreMap.get(orderKey).length()==1) {
						musicCount--;
						break;
					}
					
					if(first==second) {
						continue;
					}
					
					if(temp < plays[genreMap.get(orderKey).charAt(second)-'0']) {
						//temp = plays[genreMap.get(orderKey).charAt(second)-'0'];
						index = genreMap.get(orderKey).charAt(second)-'0';
					}
					
					if(temp != 0 && temp == plays[genreMap.get(orderKey).charAt(second)-'0']) {
						System.out.println(first + " : " +second);
						System.out.println("plays["+index+"] : "+ plays[index] +" == plays["+(genreMap.get(orderKey).charAt(second)-'0')+"] : " + plays[genreMap.get(orderKey).charAt(second)-'0']);
						plays[genreMap.get(orderKey).charAt(second)-'0'] = 0;
						continue;
					}
					
				}
				musicCount++;
				result += index;
				plays[index] = 0;
				if(musicCount == 2) {
					musicCount=0;
					break;
				}
				
			}
		}
		
		answer = new int[result.length()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = result.charAt(i)-'0';
		}
		return answer;
	}

	public static int sum(String genre, String[] genres, int[] plays) {
		int sum = 0;
		for (int i = 0; i < genres.length; i++) {
			if (genre.equals(genres[i])) {
				sum += plays[i];
			}
		}
		return sum;
	}
	
	public static <K,V> K getKey(Map<K, V> map, V value) {
		for(K key : map.keySet()) {
			if(value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
}
