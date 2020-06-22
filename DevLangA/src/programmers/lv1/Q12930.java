package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12930
public class Q12930 {
    public String solution(String s) {
        String answer = "";

        int idx = 0;
        char c = ' ';
        StringBuffer strBuf = new StringBuffer();
        for(int i=0;i<s.length();i++) {
            c = s.charAt(i);
            if(c == ' ') {
                idx = 0;
                strBuf.append(c);
                continue;
            }
            if(idx % 2 == 1) {
                strBuf.append(String.valueOf(c).toLowerCase());
            } else {
                strBuf.append(String.valueOf(c).toUpperCase());
            }
            idx++;
        }
        answer = strBuf.toString();
        return answer;
    }

    public static void main(String[] args) {
        String s = "trym    i hello world";
        String result = new Q12930().solution(s);
        System.out.print(result);
    }
}

