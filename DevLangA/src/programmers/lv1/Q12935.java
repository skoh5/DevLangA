package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12935
public class Q12935 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int min = Integer.MAX_VALUE;
        for(int num: arr) {
            if(num < min) {
                min = num;
            }
        }
        answer = new int[arr.length-1];
        int idx = 0;
        for(int num: arr) {
            if(num == min) {
                continue;
            }
            answer[idx++] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        int[] results = new Q12935().solution(arr);
        for(int result: results) {
            System.out.print(result+",");
        }
    }
}

