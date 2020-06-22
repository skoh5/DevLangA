package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/12950
public class Q12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int[] innerArr1 = {};
        int[] innerArr2 = {};
        answer = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++) {
            innerArr1 = arr1[i];
            innerArr2 = arr2[i];
            for(int j=0;j<innerArr1.length;j++) {
                answer[i][j] = innerArr1[j]+innerArr2[j];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        //        int[][] arr1 = {{1,2},{2,3}};
        //        int[][] arr2 = {{3,4},{5,6}};

        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        int[][] results = new Q12950().solution(arr1, arr2);
        System.out.print(results+",");
    }
}

