package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/64061
public class Q64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int val = 0;
        int col = 0;
        int maxRow = board.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<moves.length;i++) {
            col = moves[i]-1;
            val = 0;
            for(int j=0;j<maxRow;j++) {
                val = board[j][col];
                if(val != 0) {
                    board[j][col] = 0;
                    break;
                }
            }
            if(val == 0) {
                continue;
            }
            if(list.size() > 0 && list.get(list.size()-1) == val) {
                answer += 2;
                list.remove(list.size()-1);
            } else {
                list.add(val);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = new Q64061().solution(board, moves);
        System.out.print(result+",");
    }
}
