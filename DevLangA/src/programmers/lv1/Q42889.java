package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42889
public class Q42889 {
    public int[] solution(int N, int[] stages) {
    	int[] answer = {};
    	
    	Arrays.sort(stages);
    	
    	List<RateInfo> list = new ArrayList<>();
    	int num = stages.length;    	
    	int stage = 0; 
    	int prevStage = stages[0];
    	int currCnt = 0;
    	int prevWriteStage = 0;
    	float rate = 0.0f;
    	for(int i=0;i<stages.length;i++) {
    		stage = stages[i];
    		if(prevStage != stage) {
    			rate = (float)currCnt/num;
    			
				if(prevStage - prevWriteStage > 1) {
					for(int j=prevWriteStage+1;j<prevStage;j++) {
						list.add(new RateInfo(0.0f, j));
					}
				}
				if(prevStage <= N) {
					list.add(new RateInfo(rate, prevStage));
					prevWriteStage = prevStage;
				}
        		num -= currCnt;
        		currCnt = 1;
        		prevStage = stage;
        		continue;
    		} 
    		currCnt++;
    	}
    	if(currCnt > 0) {
    		rate = (float)currCnt/num;    		
			if(prevStage - prevWriteStage > 1) {
				for(int j=prevWriteStage+1;j<prevStage;j++) {
					list.add(new RateInfo(0.0f, j));
				}
			}
			if(prevStage <= N) {
				list.add(new RateInfo(rate, prevStage));
				prevWriteStage = prevStage;
			}
    	}
    	if(list.size() < N) {
    		for(int j=prevWriteStage+1;j<=N;j++) {
				list.add(new RateInfo(0.0f, j));
			}
    	}
    	Collections.sort(list);
    	answer = new int[list.size()];
    	for(int i=0;i<list.size();i++) {
    		answer[i] = list.get(i).getStage();
    	}
        return answer;
    }
    
    public class RateInfo implements Comparable<RateInfo> {
    	private Float rate;
    	private Integer stage;
    	
    	public RateInfo(float rate, int stage) {
    		this.rate = rate;
    		this.stage = stage;
    	}
    	
    	public float getRate() {
    		return rate;
    	}
    	public int getStage() {
    		return stage;
    	}

    	@Override
		public String toString() {
			return "RateInfo [rate=" + rate + ", stage=" + stage + "]";
		}

		@Override
		public int compareTo(RateInfo o) {
			int ret = o.rate.compareTo(this.rate);			
			if(ret == 0) {
				return this.stage.compareTo(o.stage);
			}
			return ret;
		}
    }
    
	public static void main(String[] args) {

//		int N = 4;
//		int[] stage = {4,4,4,4,4};
		
		int N = 4;
		int[] stage = {1,1,1,1,1};
		
//		int N = 5;
//		int[] stage = {2,1,2,6,2,4,3,3};
		
		int[] results = new Q42889().solution(N, stage);
		for(int result: results) {
			System.out.print(result+",");
		}
	}
}
