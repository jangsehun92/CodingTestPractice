package codingTest.hash;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class BestAlbum {
	/*
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를
	 * 수록하는 기준은 다음과 같습니다.
	 * 
	 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다. 장르 내에서 많이 재생된 노래를 먼저 수록합니다. 장르 내에서 재생 횟수가 같은 노래
	 * 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다. 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수
	 * 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 */
	public static void main(String[] args) {

		String[] genres = { "classic", "pop", "classic", "classic", "pop", "jazz" };
		int[] plays = { 150, 600, 120, 800, 2500, 100 };

		int[] answer = solution(genres, plays);
		
		for(int i = 0; i < answer.length; i ++) {
			System.out.println(answer[i]);
		}

	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		answer = new int[5];
		HashMap<String, String> genreMap = new HashMap<String, String>();
		for (int i = 0; i < genres.length; i++) {
			genreMap.put(genres[i], genreMap.getOrDefault(genres[i], "") + i);
		}
		System.out.println("genreMap : " + genreMap);
		// 장르
		HashMap<String, Integer> genreCountMap = new HashMap<String, Integer>();
		for (int i = 0; i < genres.length; i++) {
			genreCountMap.put(genres[i], genreCountMap.getOrDefault(genres[i], 0) + 1);
		}
		System.out.println("genreCountMap : "  + genreCountMap);

		HashMap<String, Integer> sumMap = new HashMap<String, Integer>();
		Map<String, Integer> orderMap = new HashMap<String, Integer>();

		// 1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
		for (String key : genreCountMap.keySet()) {
			sumMap.put(key, sum(key, genres, plays));
		}
		System.out.println("sumMap : " + sumMap);
		int count = genreCountMap.size();
		for (String firstKey : genreCountMap.keySet()) {
			for (String secondKey : genreCountMap.keySet()) {
				if (firstKey.equals(secondKey)) {
					continue;
				}
				if (genreCountMap.get(firstKey) > genreCountMap.get(secondKey)) {
					count--;
				}
			}
			orderMap.put(firstKey, count);
			count = genreCountMap.size();
		}
		
		System.out.println("orderMap : " + orderMap);

//		for (String key : genreMap.keySet()) {
//			if (genreMap.get(key).length() == 1) {
//				System.out.println(key + genreMap.get(key).charAt(0));
//			} else {
//				for (int i = 0; i < 2; i++) {
//					System.out.println(key + genreMap.get(key).charAt(i));
//				}
//			}
//		}
		
		for(int i = 1; i < genreCountMap.size()+1; i++) {
			String orderKey = getKey(orderMap, i);
			System.out.println(getKey(orderMap, i));
			for(String genreKey : genreMap.keySet()) {
				if(orderKey.equals(genreKey)) {
					System.out.println(genreMap.get(genreKey) + " [ size : "+ genreMap.get(genreKey).length() + " ]");
					for(int j = 0; j < genreMap.get(genreKey).length(); j++) {	
						int index = genreMap.get(genreKey).charAt(j)-'0';
						System.out.println("plays["+ index + "] : " + plays[index]);
						if(genreMap.get(genreKey).length()==1) {
							answer[i] = plays[index];
						}
					}						
				}
				
			}
		}
		
		System.out.println("---장르 내에서 많이 재생된 노래 2개--");
		
		for(int i = 0; i < genreMap.get("pop").length(); i++) {
			int temp = 0;
			int count1 = 0;
			int index = 0;
			for(int j = 0; j < genreMap.get("pop").length(); j++) {
				if(i==j) continue;
				if(genreMap.get("pop").charAt(i)-'0' < plays[genreMap.get("pop").charAt(j)-'0']) {
					temp = plays[genreMap.get("pop").charAt(j)-'0'];
					index = genreMap.get("pop").charAt(j)-'0';
				}
			}
			count1++;
			//plays[genreMap.get("classic").charAt(i)-'0'] = 0;
			System.out.println("plays["+ index + "] : "  + temp);
			plays[index] = 0;
			if(count1 == 2) {
				break;
			}
		}
		// 2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
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
