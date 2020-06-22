package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12944
public class Q12944 {
    public double solution(int[] arr) {
        double answer = 0d;

        long sum = 0L;
        for(int num: arr) {
            sum += num;
        }
        answer = sum/(double)arr.length;


        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {};
        double result = new Q12944().solution(arr);
        System.out.print(result+",");
    }
}

