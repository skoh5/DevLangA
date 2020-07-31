package programmers.lv2;

import java.util.PriorityQueue;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
public class Q42627_PriorityQueue {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++) {
            queue.add(scoville[i]);
        }
        int result = 0;
        while(true) {
            if(queue.peek() >= k) {
                break;
            }
            if(queue.size() < 2) {
                answer = -1;
                break;
            }

            result = makeNew(queue.poll(), queue.poll());
            queue.add(result);
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
        int result = new Q42627_PriorityQueue().solution(scoville, k);
        System.out.print(result);
    }
}
