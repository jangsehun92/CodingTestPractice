package codingTest.hash;

import java.util.HashMap;

public class BestAlbum {
	/*
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 
	 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다. 
	 * 
	 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다. 
	 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다. 
	 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다. 
	 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 
	 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 */
	public static void main(String[] args) {
		
		String[] genres = { "classic" , "pop", "classic", "classic", "pop", "jazz" };
		int[] plays = { 500, 600, 150, 800, 2500, 100 };
		
		System.out.println(solution(genres,plays));
		
	}
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        
        //answer = new int[hm.size()];
        
        //장르
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < genres.length; i++) {
        	hm.put(genres[i], hm.getOrDefault(genres[i], 0) +1);
        }
        
        System.out.println(hm);
        
        HashMap<String, Integer> sumMap = new HashMap<String, Integer>();
        //1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
        for(String key : hm.keySet()) {
        	sumMap.put(key, sum(key, genres, plays));
        }
        System.out.println(sumMap);
        
        
        
        //2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
        return answer;
    }
	
	public static int sum(String genre, String[] genres, int[] plays) {
		int sum = 0;
		for(int i = 0; i < genres.length; i++) {
    		if(genre.equals(genres[i])) {
    			sum += plays[i];
    		}
    	}
		return sum;
	}
}
