package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12926
public class Q12926 {
    public String solution(String s, int n) {
        String answer = "";
        // A-Z 65-90
        // a-z 97-122
        // space 32
        StringBuffer strBuf = new StringBuffer();
        char c = ' ';
        int asciiCode = 0;
        for(int i=0;i<s.length();i++) {
            c = s.charAt(i);
            asciiCode = c;
            if(asciiCode == 32) {
                strBuf.append(c);
                continue;
            }
            if(asciiCode >= 65 && asciiCode <= 90) {
                asciiCode += n;
                if(asciiCode > 90) {
                    asciiCode = 65 + (asciiCode-90-1);
                }
                c = (char)asciiCode;
                strBuf.append(c);
                continue;
            }

            if(asciiCode >= 97 && asciiCode <= 122) {
                asciiCode += n;
                if(asciiCode > 122) {
                    asciiCode = 97 + (asciiCode-122-1);
                }
                c = (char)asciiCode;
                strBuf.append(c);
                continue;
            }

        }
        answer = strBuf.toString();
        return answer;
    }

    public static void main(String[] args) {
        //        String s = "AB";
        //        int n = 1;

        //        String s = "z";
        //        int n = 1;

        String s = "a B z";
        int n = 4;

        String result = new Q12926().solution(s, n);
        System.out.print(result);
    }
}

