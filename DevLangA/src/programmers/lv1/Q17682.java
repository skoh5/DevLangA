package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/17682
public class Q17682 {
    public int solution(String dartResult) {
    	int answer = 0;
    	
    	int idx = 0;
    	String str = "";
    	int point = 0;
    	char cPow = ' ';
    	char cBonus = ' ';
    	int pow = 0;
    	boolean isStar = false;
    	boolean isAcha = false;
    	List<DartInfo> list = new ArrayList<>();
    	DartInfo info = null;
    	int infoCnt = 0;
    	for(int i=0;i<dartResult.length();i++) {
    		isStar = false;
    		isAcha = false;
    		str = dartResult.substring(idx, idx+2);
    		try {
    			point = Integer.parseInt(str);
    			idx += 2;
    		} catch (NumberFormatException e) {
    			point = Integer.parseInt(dartResult.substring(idx, idx+1));
    			idx += 1;
    		}
    		cPow = dartResult.charAt(idx++);    		
    		if(cPow == 'S') {
    			pow = 1;
    		} else if(cPow == 'D') {
    			pow = 2;
    		} else if(cPow == 'T') {
    			pow = 3;
    		}
    		if(idx < dartResult.length()) {
	    		cBonus = dartResult.charAt(idx);
	    		if(cBonus == '*') {
	    			isStar = true;
	    			idx++;
	    			if(infoCnt >= 1) {
		    			list.get(infoCnt-1).setStar();
		    		}
	    		} else if(cBonus == '#') {
	    			isAcha = true;
	    			idx++;
	    		}
    		}
    		info = new DartInfo(point, pow, isStar, isAcha);
    		list.add(info);
    		infoCnt++;
    		i = idx;
    	}
    	
    	for(DartInfo dInfo: list) {
    		answer += dInfo.getScore();
    	}
    	
        return answer;
    }
    
    public class DartInfo {
    	private int point = 0;
    	private int pow = 0;
    	private int star = 1;
    	private int acha = 1;
    	
    	public DartInfo(int point, int pow, boolean isStar, boolean isAcha) {
    		this.point = point;
    		this.pow = pow;
    		if(isStar) {
    			this.star = 2;
    		}
    		if(isAcha) {
    			this.acha = -1;
    		}
    	}
    	
    	public void setStar() {
    		this.star *= 2;
    	}
    	
    	public int getScore() {
    		int score = (int)Math.pow((double)point, pow) * this.star * this.acha;
    		return score;
    	}

		@Override
		public String toString() {
			return "DartInfo [point=" + point + ", pow=" + pow + ", star=" + star + ", acha=" + acha + "]";
		}
    	
    }
    
	public static void main(String[] args) {
//		String dartResult = "1S2D*3T";
//		String dartResult = "1D2S#10S";
//		String dartResult = "1D2S0T";
//		String dartResult = "1S*2T*3S";
//		String dartResult = "1D#2S*3S";
//		String dartResult = "1T2D3D#";
		String dartResult = "1D2S3T*";
		int results = new Q17682().solution(dartResult);
		System.out.print(results+",");
	}
}
