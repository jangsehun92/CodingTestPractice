package codingTest.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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

//		String[] genres = { "classic","classic","classic", "pop", "classic", "classic", "pop", "jazz" , "jazz","jazz", "kpop" };
//		int[] plays = 		{ 10203,	1000,		1,  	6000, 	120, 		800, 	 600000,  10000,   10000, 1000,    999999 };
		
//		String[] genres = { "classic", "pop", "classic", "pop", "classic", "pop" };
//		int[] plays = {		 500, 		600, 	500, 	  600, 	  700, 	    700 };
		
//		String[] genres = { "classic", "pop"};
//		int[] plays = {		 700, 		600};
		
//		String[] genres = { "classic", "pop", "classic", "classic", "pop", "zazz", "zazz" };
//		int[] plays = {500, 600, 150, 800, 2500, 2100, 1000};
		
		//틀린것으로 추정되는 TC (같을때)
		String[] genres = {"a", "a", "b", "b", "c", "c", "d", "d"};
		int[] plays = 		{1, 1, 1, 1, 1, 1, 1, 1};
		
//		String[] genres = {"a", "a", "b", "c", "a", "a"};
//		int[] plays = 		{1, 2, 2, 2, 2, 2};
		//--
		
//		String[] genres = {"classic", "pop", "classic", "pop", "classic", "classic"};
//		int[] plays = {400, 600, 150, 2500, 500, 500};
		
	
		
		
		int[] answer = solution(genres, plays);
		
		for(int i = 0; i < answer.length; i ++) {
			System.out.print(answer[i]);
		}
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		
		Map<String, List<Integer>> genreMap = new HashMap<String, List<Integer>>();
		//장르 별 index값 구하기
		for (int i = 0; i < genres.length; i++) {
			List<Integer> idList;
			
			if(genreMap.containsKey(genres[i])) {
				genreMap.get(genres[i]).add(i);
			}else {
				idList = new ArrayList<Integer>();
				genreMap.put(genres[i], idList);
				genreMap.get(genres[i]).add(i);
			}
		}
		
		System.out.println("genreMap : " + genreMap);
		
		Map<String, Integer> sumMap = new HashMap<String, Integer>();
		//각 장르의 총 play값 구하기
		for (String key : genreMap.keySet()) {
			sumMap.put(key, sum(key, genres, plays));
		}
		
		System.out.println("sumMap : " + sumMap);
		
		Map<String, List<Integer>> orderMap = new TreeMap<String, List<Integer>>();
		//genreMap sortByValue(장르별 재생수가 많은 순)
		for(String key : genreMap.keySet()) {
			List<Music> musicList = new ArrayList<Music>();
			List<Integer> indexList = new ArrayList<Integer>();
			for(int i = 0; i<genreMap.get(key).size(); i++) {
				Music music = new Music(genreMap.get(key).get(i),plays[genreMap.get(key).get(i)]);
				musicList.add(music);
			}
			Collections.sort(musicList);
			for(int i =0; i <musicList.size(); i++) {
				indexList.add(musicList.get(i).getId());
			}
			orderMap.put(key, indexList);
		}
		
		System.out.println("orderMap : " + orderMap);
		
		//총 play값을 기준으로 장르 정렬
		List<Entry<String, Integer>> listEntries = new ArrayList<Map.Entry<String,Integer>>(sumMap.entrySet()); 
		Collections.sort(listEntries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 내림 차순 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
				
		//총 play값을 기준으로 장르 별 인덱스값 구하기
		String result = "";
		for(Entry<String, Integer> entry : listEntries) {
			int count = 0;
			for(int i = 0; i < orderMap.get(entry.getKey()).size(); i++) {
				result += orderMap.get(entry.getKey()).get(i);
				count++;
				if(count > 1) {
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

}
