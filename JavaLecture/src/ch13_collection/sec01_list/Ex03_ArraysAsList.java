package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex03_ArraysAsList {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Cherry"};
		List<String> fruitList = Arrays.asList(fruits);
		fruitList.forEach(x -> System.out.println(x));
		
//		fruitList.add("PineApple");
//		fruitList.forEach(x -> System.out.println(x));
		
		// List를 쉽게 만드는 방법
		List<Integer> scoreList = Arrays.asList(80, 90, 94, 76);
		scoreList.forEach(x -> System.out.println(x));
		
		scoreList = generaScore(5);
		System.out.println(scoreList);
	}

	private static List<Integer> generaScore(int count) {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<count; i++) {
			int score = (int) (Math.random() * 40) + 60;
			list.add(score);
		}
		return list;
	}
}
