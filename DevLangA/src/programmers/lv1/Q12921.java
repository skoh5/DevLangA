package programmers.lv1;

import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/12921
public class Q12921 {
	public int solution(int n) {
		int answer = 0;
		
		int no = 0;
		
		int[] arr = new int[n+1];
		Set<Integer> set = new HashSet<>();
		for(int i=2;i<=n;i++) {
			if(arr[i] == 1) {
				continue;
			}
			set.add(i);
			no = i + i;
			while(no <= n) {
				arr[no] = 1;
				no = no + i;
			}
		}
		answer = set.size();
		return answer;
    }
    
	public static void main(String[] args) {
		int n = 10;
//		int n = 5;
		int result = new Q12921().solution(n);
		System.out.print(result);	
	}
}

