package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12918
public class Q12918 {
	public boolean solution(String s) {
		boolean answer = true;
		if(s.length() != 4 && s.length() != 6) {
			return false;
		}
		try {
			Integer.parseInt(s);
			answer = true;
		} catch (NumberFormatException e) {
			answer = false;
		}
		return answer;
    }
    
	public static void main(String[] args) {
//		String s = "a234";
		String s = "1234";
		
		boolean result = new Q12918().solution(s);
		System.out.print(result);	
	}
}

