package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12931
public class Q12931 {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            answer += n % 10;
            n = n/10;
            if(n == 0) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 987;
        int result = new Q12931().solution(n);
        System.out.print(result);
    }
}

