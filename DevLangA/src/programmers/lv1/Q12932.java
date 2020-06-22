package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12932
public class Q12932 {
    public int[] solution(long n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while(true) {
            list.add((int)(n % 10));
            n = n / 10;
            if(n == 0) {
                break;
            }
        }
        answer = new int[list.size()];
        for(int i=list.size()-1;i>=0;i--) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15423;
        int[] results = new Q12932().solution(n);
        for(int result: results) {
            System.out.print(result+",");
        }
    }
}

