package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12934
public class Q12934 {
    public long solution(long n) {
        long answer = 0L;

        Double d = Math.sqrt(n);
        double mod = d % 1;
        if(mod == 0.0d) {
            answer = (long) Math.pow((d+1), 2);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 50000000000000L;
        long result = new Q12934().solution(n);
        System.out.print(result);
    }
}

