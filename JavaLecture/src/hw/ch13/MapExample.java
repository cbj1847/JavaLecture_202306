package hw.ch13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		
		int sum = 0;
		int max = 0;
		for (String key : map.keySet()) {
			sum += map.get(key);
			if (max < map.get(key)) {
				max = map.get(key);
				name = key;
			}
		}
		System.out.println("평균점수 : " + sum/map.size());
		System.out.println("최고점수 : " + max);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}

}
