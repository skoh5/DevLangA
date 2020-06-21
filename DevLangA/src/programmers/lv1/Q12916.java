package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12916
public class Q12916 {
	public boolean solution(String s) {
		boolean answer = true;
		String str = s.toLowerCase();
		int pCnt = 0, yCnt = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == 'p') {
				pCnt++;
			} else if(c == 'y') {
				yCnt++;
			}
		}
		if(pCnt != yCnt) {
			answer = false;
		}
		return answer;
    }
    
	public static void main(String[] args) {
//		String s = "pPoooyY";
		String s = "pyy";
		
		boolean result = new Q12916().solution(s);
		System.out.print(result);	
	}
}

