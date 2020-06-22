package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12922
public class Q12922 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"수", "박"};
        StringBuffer strBuf = new StringBuffer();

        for(int i=0;i<n;i++) {
            strBuf.append(arr[i%2]);
        }
        answer = strBuf.toString();
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        String result = new Q12922().solution(n);
        System.out.print(result);
    }
}

