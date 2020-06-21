package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12910
public class Q12910 {
	public int[] solution(int[] arr, int divisor) {
    	int[] answer = {};
    	List<Integer> list = new ArrayList<>();
    	for(int num: arr) {
    		if(num%divisor == 0) {
    			list.add(num);
    		}
    	}
    	if(list.size() == 0) {
    		list.add(-1);
    	}
    	answer = list.stream().mapToInt(i->i.intValue()).toArray();
    	Arrays.sort(answer);
        return answer;
    }
    
	public static void main(String[] args) {
//		int[] arr = {5,9,7,10};
//		int divisor = 5;
		
//		int[] arr = {2,36,1,3};
//		int divisor = 1;
//		
		int[] arr = {3,2,6};
		int divisor = 10;
		
		int[] results = new Q12910().solution(arr, divisor);
		for(int result: results) {
			System.out.print(result+",");	
		}
	}
}

