package programmers.lv1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42748
//K번째수 
public class Q42748 {
	public int[] solution(int[] array, int[][] commands) {
    	int[] answer = {};
    	answer = new int[commands.length];
    	int startIdx = 0, endIdx = 0, selectIdx = 0;
    	int[] subArr = {};
    	for(int i=0;i<commands.length;i++) {
    		int[] command = commands[i];
    		startIdx = command[0];
    		endIdx = command[1];
    		selectIdx = command[2];
    		subArr = Arrays.copyOfRange(array, startIdx-1, endIdx);
    		Arrays.sort(subArr);
    		answer[i] = subArr[selectIdx-1];
    	}
        return answer;
    }
    
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] results = new Q42748().solution(array, commands);
		for(int result: results) {
			System.out.print(result);	
		}
	}
}
