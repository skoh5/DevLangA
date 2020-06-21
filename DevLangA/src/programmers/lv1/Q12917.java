package programmers.lv1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12917
public class Q12917 {
	public String solution(String s) {
		String answer = "";
		char[] arr = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);
		
		for(int i=1;i<=arr.length;i++) {
			answer += arr[arr.length-i];
		}
		
		return answer;
    }
    
	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String result = new Q12917().solution(s);
		System.out.print(result);	
	}
}

