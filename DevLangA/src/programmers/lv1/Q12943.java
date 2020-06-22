package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12943
public class Q12943 {
    public int solution(int n) {
        int answer = -1;

        long num = n;
        int jobCnt = 0;
        while(num != 1 && jobCnt < 500) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            jobCnt++;
        }
        if(num == 1) {
            answer = jobCnt;
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 8000000;
        int result = new Q12943().solution(n);
        System.out.print(result+",");
    }
}

