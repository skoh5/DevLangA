package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42626
public class Q42627_List {

    public int solution(int[] scoville, int k) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<scoville.length;i++) {
            list.add(scoville[i]);
        }
        int result = 0;
        Integer a = null;
        Integer b = null;
        Collections.sort(list);
        while(true) {
            if(list.get(0) >= k) {
                break;
            }
            if(list.size() <= 1) {
                answer = -1;
                break;
            }

            Iterator<Integer> iter = list.iterator();
            a = iter.next();
            iter.remove();
            b = iter.next();
            iter.remove();
            result = makeNew(a, b);
            list.add(result);
            Collections.sort(list);
            answer++;
        }
        return answer;
    }

    private int makeNew(int a, int b) {
        return a + (b * 2);
    }


    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int result = new Q42627_List().solution(scoville, k);
        System.out.print(result);
    }
}
