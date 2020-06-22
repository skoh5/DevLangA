package programmers.lv1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
public class Q12982 {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int num: d) {
            budget -= num;
            if(budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int results = new Q12982().solution(d, budget);
        System.out.print(results+",");
    }
}

