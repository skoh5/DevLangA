package programmers.lv2;

import java.util.Arrays;
import java.util.TreeSet;

//https://programmers.co.kr/learn/courses/30/lessons/42577
public class Q42577 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        TreeSet<String> set = new TreeSet<String>();
        set.addAll(Arrays.asList(phone_book));
        
        for(String num: phone_book) {
        	if(set.subSet(num, false, num+Character.MAX_VALUE, true).size() > 0) {
        		System.out.println(num);
        		return false;
        	}
        }
        
        return answer;
    }


    public static void main(String[] args) {
        String[] phone_book = {"123", "1234", "789"};
        boolean result = new Q42577().solution(phone_book);
        System.out.print(result);
    }
}
