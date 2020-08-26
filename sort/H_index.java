package codingTest.sort;

import java.util.Arrays;
import java.util.Comparator;

public class H_index {
	/*
	 * 
	 * 	H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
		어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
		어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
		
		제한사항
		과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
		논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
		입출력 예
		citations		return
		[3, 0, 6, 1, 5]	3
		입출력 예 설명
		이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
	 */
	public static void main(String[] args) {
		//int[] citations = {3, 0, 6, 1, 5};
		//int[] citations = {25, 8, 5, 3, 3};
		int[] citations = {0, 0, 0};
		
		int answer = solution(citations);
		
		System.out.println(answer);
	}
	
	public static int solution(int[] citations) {
		int answer = 0;
		
		Integer[] arr = new Integer[citations.length];
		
		for(int i = 0; i < citations.length; i++) {
			arr[i] = citations[i];
		}
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		int h_index = arr[0];
		
		boolean isBoolean = true;
		while(isBoolean) {
			int count = 0;
			if(arr[0] == 0) {
				answer = count;
				isBoolean = false;
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= h_index) {
					count++;
					System.out.println("h_index : " + h_index + " count : " + count);
				}
				
				if(h_index == count) {
					answer = count;
					isBoolean = false;
				}
			}
			h_index--;
		}
		
		return answer;
	}
	

}
