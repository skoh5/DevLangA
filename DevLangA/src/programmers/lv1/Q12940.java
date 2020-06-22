package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12940
public class Q12940 {
    public int[] solution(int n, int m) {
        int[] answer = {};

        int gcd = (int)gcd(n, m);
        int lcm = (int)lcm(n, m);
        answer = new int[2];
        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
    // 최대공약수
    private long gcd(int p, int q) {
        if(q == 0) {
            return p;
        }
        return gcd(q, p%q);
    }

    // 최소공배수
    private long lcm(int p, int q) {
        return p*q/gcd(p, q);
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int[] results = new Q12940().solution(n, m);
        for(int result: results) {
            System.out.print(result+",");
        }
    }
}

