package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12937
public class Q12937 {
    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 3;
        String result = new Q12937().solution(num);
        System.out.print(result);
    }
}

