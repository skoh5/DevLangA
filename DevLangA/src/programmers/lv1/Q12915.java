package programmers.lv1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12915
public class Q12915 {
	public String[] solution(String[] strings, int n) {
    	String[] answer = {};

    	for(int i=0;i<strings.length;i++) {
    		strings[i] = strings[i].charAt(n)+strings[i];
    	}
    	Arrays.sort(strings);
    	answer = new String[strings.length];
    	for(int i=0;i<strings.length;i++) {
    		answer[i] = strings[i].substring(1);
    	}
        return answer;
    }
    
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
//		String[] strings = {"abce", "abcd", "cdx"};
//		int n = 2;
		
		String[] results = new Q12915().solution(strings, n);
		for(String result: results) {
			System.out.print(result);	
		}
	}
}

