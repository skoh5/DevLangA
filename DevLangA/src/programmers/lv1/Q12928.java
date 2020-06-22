package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12928
public class Q12928 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;

        int result = new Q12928().solution(n);
        System.out.print(result);
    }
}

