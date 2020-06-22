package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12933
public class Q12933 {
    public long solution(long n) {
        long answer = 0L;

        List<Integer> list = new ArrayList<>();
        while(true) {
            list.add((int)(n%10));
            n = n / 10;
            if(n == 0) {
                break;
            }
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i);
            if(i > 0) {
                answer *= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 118372L;
        long result = new Q12933().solution(n);
        System.out.print(result+",");
    }
}

