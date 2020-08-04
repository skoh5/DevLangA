package programmers.lv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42579
public class Q42579 {


	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		
		
		Map<String, List<Music>> map = new HashMap<>();		
		String type = "";
		int play = 0;
		List<Music> list = null;
		for(int i=0;i<plays.length;i++) {
			type = genres[i];
			play = plays[i];
			if(map.containsKey(type)) {
				map.get(type).add(new Music(type, i, play));
			} else {
				list = new ArrayList<Music>();
				list.add(new Music(type, i, play));
				map.put(type, list);
			}
		}
		
		int maxPlays = -1;
		String maxGenres = "";
		for(String key: map.keySet()) {
			list = map.get(key);
			Collections.sort(list);
		}
		
		return answer;
	}
	
	public class Music implements Comparable<Music>{
		private String genres;
		private int idx;
		private int play;

		public Music(String genres, int idx, int plays) {
			this.genres = genres;
			this.idx = idx;
			this.play = plays;
		}

		@Override
		public int compareTo(Music o) {
			int ret = o.play = this.play; 
			if(ret == 0) {
				ret = this.idx - o.idx;
			}
			return 0;
		}
	}


	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] result = new Q42579().solution(genres, plays);
		System.out.print(result);
	}
}
