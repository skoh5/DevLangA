package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12948
public class Q12948 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuffer strBuf = new StringBuffer();
        for(int i=0;i<phone_number.length();i++) {
            if(i < phone_number.length()-4) {
                strBuf.append("*");
            } else {
                strBuf.append(phone_number.charAt(i));
            }
        }
        answer = strBuf.toString();
        return answer;
    }


    public static void main(String[] args) {
        String p = "027778888";
        String result = new Q12948().solution(p);
        System.out.print(result+",");
    }
}

