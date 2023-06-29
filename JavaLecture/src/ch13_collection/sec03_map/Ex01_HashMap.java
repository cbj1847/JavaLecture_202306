package ch13_collection.sec03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_HashMap {

	public static void main(String[] args) {
		
		// HashMap : Not ordered, TreeMap : Order by dictionary order
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1000);
		map.put("배", 2000);
		map.put("감", 500);
		System.out.println(map.size());
		System.out.println("======================================================");
		
		//key로 값 얻기
		int val = map.get("배");
		System.out.println("배 : " + val);
		System.out.println("======================================================");
		
		// key의 Set collection - 이 방법을 사용하는 것을 권장
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("======================================================");
		
		// Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey() + " : " + entry.getValue());
		System.out.println("======================================================");
		
		// Stream으로 처리
		map.forEach((k,v) -> System.out.println(k + " : " + v));
		System.out.println("======================================================");
		
		// 검색
		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsValue(2000));
		System.out.println("======================================================");
		
		 
		
	}

}
