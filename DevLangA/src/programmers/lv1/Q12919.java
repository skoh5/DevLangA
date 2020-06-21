package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12919
public class Q12919 {
	public String solution(String[] seoul) {
		String answer = "";
		String fmt = "김서방은 %d에 있다";
		int idx = 0;
		for(int i=0;i<seoul.length;i++) {
			if(seoul[i].equals("Kim")) {
				idx = i;
				break;
			}
		}
		answer = String.format(fmt, idx);
		return answer;
    }
    
	public static void main(String[] args) {
		String[] s = {"Jane", "sara", "Oh", "Kim", "Lee"};
		
		String result = new Q12919().solution(s);
		System.out.print(result);	
	}
}

