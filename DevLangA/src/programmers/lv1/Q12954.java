package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12954
public class Q12954 {
    public long[] solution(int x, int n) {
        long[] answer = {};

        long num = x;
        List<Long> list = new ArrayList<>();
        while(list.size() < n) {
            list.add(num);
            num += x;
        }

        answer = list.stream().mapToLong(i->i.longValue()).toArray();
        return answer;
    }


    public static void main(String[] args) {
        int x = -4;
        int n = 2;

        long[] results = new Q12954().solution(x, n);
        for(long result: results) {
            System.out.print(result+",");
        }
    }
}

