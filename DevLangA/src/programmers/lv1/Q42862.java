package programmers.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/42862
//탐욕법 
public class Q42862 {
    public int solution(int n, int[] lost, int[] reserve) {
    	int answer = 0;
    	
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	Set<Integer> setUsed = new HashSet<>();
    	Set<Integer> setFound = new HashSet<>();
    	
    	int lostCnt = 0;
    	boolean isFound = false;
    	for(int lostNum: lost) {
    		for(int reserveNum: reserve) {
    			if(lostNum == reserveNum) {
    				setUsed.add(reserveNum);
    				setFound.add(lostNum);
    				break;
    			}
    		}
    	}
    	for(int lostNum: lost) {
    		isFound = false;
    		if(setFound.contains(lostNum)) {
    			continue;
    		}
    		for(int reserveNum: reserve) {
    			if(setUsed.contains(reserveNum)) {
    				continue;
    			}
    			
    			if(lostNum-1 <= reserveNum && reserveNum <= lostNum+1) {
    				isFound = true;
    				setUsed.add(reserveNum);
    				break;
    			}
    		}
    		if(isFound == false) {
    			lostCnt++;
    		}
    	}
    	answer = n - lostCnt;
        return answer;
    }
    
	public static void main(String[] args) {
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
		
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
//		
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		int result = new Q42862().solution(n, lost, reserve);
		System.out.print(result);
	}
}
