package programmers.lv1;

//https://programmers.co.kr/learn/courses/30/lessons/17681
public class Q17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = {};
    	
    	int num = 0;
    	String str = "";
    	answer = new String[n];
    	for(int i=0;i<n;i++) {
    		num = arr1[i] | arr2[i];
    		str = Integer.toBinaryString(num);
    		if(str.length() < n) {    			
    			str = String.format("%1$" + n + "s", str).replace(' ', '0');
    		}
    		System.out.println(str);
    		answer[i] = toMapString(str);
    	}
    	
        return answer;
    }
    
    private String toMapString(String sbin) {
    	StringBuffer strBuf = new StringBuffer();
    	for(int i=0;i<sbin.length();i++) {
    		if(sbin.charAt(i) == '1') {
    			strBuf.append('#');
    		} else {
    			strBuf.append(' ');
    		}
    	}
    	return strBuf.toString();
    }
    
	public static void main(String[] args) {

//		int n = 5;
//		int[] arr1 = {9,20,28,18,11};
//		int[] arr2 = {30,1,21,17,28};
		
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		
		String[] results = new Q17681().solution(n, arr1, arr2);
		for(String result: results) {
			System.out.print(result+",");
		}
	}
}
