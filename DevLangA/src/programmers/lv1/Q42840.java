package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42840
//완전탐색 
public class Q42840 {


    public int[] solution(int[] answers) {
    	int[] answer = {};
        int[] num1 = {1, 2, 3, 4, 5};
    	int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	int a = 0;
    	int[] scores = {0, 0, 0};
    	for(int i=0;i<answers.length;i++) {
    		a = answers[i];
    		if(a == num1[i%num1.length]) {
    			scores[0]++;
    		}
    		if(a == num2[i%num2.length]) {
    			scores[1]++;
    		}
    		if(a == num3[i%num3.length]) {
    			scores[2]++;
    		}
    	}
    	int maxScore = 0;
    	for(int score: scores) {
    		if(score > maxScore) {
    			maxScore = score;
    		}
    	}
    	List<Integer> results = new ArrayList<>();
    	for(int i=0;i<scores.length;i++) {
    		if(scores[i] == maxScore) {
    			results.add(i+1);
    		}
    	}
    	
    	answer = new int[results.size()];
    	for(int i=0;i<results.size();i++) {
    		answer[i] = results.get(i);
    	}
      
        return answer;
    }
    
	public static void main(String[] args) {
//		int[] answers= {1,2,3,4,5};
		int[] answers= {1,3,2,4,2};
		
		int[] result = new Q42840().solution(answers);
		for(int r: result) {
			System.out.print(r+",");
		}
	}
}
