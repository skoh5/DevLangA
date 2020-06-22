package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12947
public class Q12947 {
    public boolean solution(int x) {
        boolean answer = true;

        int orgNum = x;
        int sum = 0;
        while(true) {
            sum += x % 10;
            x = x/10;
            if(x == 0) {
                break;
            }
        }
        answer = orgNum %  sum == 0 ? true : false;

        return answer;
    }


    public static void main(String[] args) {
        int x = 10;
        boolean result = new Q12947().solution(x);
        System.out.print(result+",");
    }
}

