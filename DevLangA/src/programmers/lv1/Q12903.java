package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12903
public class Q12903 {
	public String solution(String s) {
    	String answer = "";
    	int len = s.length();
    	if(len % 2 == 0) {
    		answer = String.valueOf(s.charAt(len/2-1)) + String.valueOf(s.charAt(len/2));
    	} else {
    		answer = String.valueOf(s.charAt((int)len/2));
    	}
        return answer;
    }
    
	public static void main(String[] args) {
//		String s = "abcde";
//		String s = "qwer";
		String s = "qw";
		String result = new Q12903().solution(s);
		System.out.print(result);	
	}
}

