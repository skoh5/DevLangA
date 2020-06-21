package programmers.lv1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42576
//해시 
public class Q42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<participant.length;i++) {
        	if(i == completion.length) {
        		answer = participant[i];
        		break;
        	}
        	if(participant[i].equals(completion[i]) == false) {
        		answer = participant[i];
        		break;
        	}
        }        
        return answer;
    }
    
	public static void main(String[] args) {
//		String[] participant = new String[] {"leo", "kiki", "eden"};
//		String[] completion = new String[] {"eden", "kiki"};
		
//		String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};
//		
		String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
		String[] completion = new String[] {"stanko", "ana", "mislav"};
		String result = new Q42576().solution(participant, completion);
		System.out.println(result);
	}
}
