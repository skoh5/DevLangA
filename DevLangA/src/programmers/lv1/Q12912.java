package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12912
public class Q12912 {
	public long solution(int a, int b) {
    	long answer = 0;
    	if(a == b) {
    		return a;
    	}
    	int startNum = a, endNum = b;
    	if(a > b) {
    		startNum = b;
    		endNum = a;
    	}
    	for(int i=startNum;i<=endNum;i++) {
    		answer += i;
    	}

        return answer;
    }
    
	public static void main(String[] args) {

//		int a = 3, b = 5;
		
//		int a = 3, b = 3;
		
		int a = 5, b = 3;
		
		long results = new Q12912().solution(a, b);
		System.out.print(results);	
	}
}

