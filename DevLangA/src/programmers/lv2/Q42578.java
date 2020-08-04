package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42578
public class Q42578 {

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for(String[] arr: clothes) {
        	map.compute(arr[1], (key, val)-> (val == null)? 1: val + 1);
        }
        
        for(int val: map.values()) {
        	answer *= (val +1);
        }
        answer--;
        return answer;
    }


    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = new Q42578().solution(clothes);
        System.out.print(result);
    }
}
