package codingTest.hash;

import java.util.HashMap;

public class BestAlbum {
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
