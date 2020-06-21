package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class Q12906 {
	public int[] solution(int[] arr) {
    	int[] answer = {};
    	List<Integer> list = new ArrayList<>();
    	int prevNum = -1;
    	for(int num: arr) {
    		if(num == prevNum) {
    			continue;
    		}
    		prevNum = num;
    		list.add(num);
    	}
    	answer = list.stream().mapToInt(i->i.intValue()).toArray();
        return answer;
    }
    
	public static void main(String[] args) {
//		int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		int[] results = new Q12906().solution(arr);
		for(int result: results) {
			System.out.print(result);	
		}
	}
}

