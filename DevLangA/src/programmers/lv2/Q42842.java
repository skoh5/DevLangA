package programmers.lv2;

//https://programmers.co.kr/learn/courses/30/lessons/42842
public class Q42842 {

    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int col = 3;
        int row = 0;
        int total = brown + yellow;
        int half = total/2;
        while(true) {
        	if(total % col != 0) {
        		col++;
        		continue;
        	}
        	if(half < col) {
        		break;
        	}
        	row = total / col;
        	if((col * 2) + ((row-2)*2) == brown) {
        		break;
        	}
        	col++;
        }
        answer = new int[2];
        answer[0] = row;
        answer[1] = col;
        return answer;
    }


    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] result = new Q42842().solution(brown, yellow);
        for(int num: result) {
        	System.out.print(num+",");
        }
    }
}
