package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12925
public class Q12925 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "+1234";
        int result = new Q12925().solution(s);
        System.out.print(result);
    }
}

