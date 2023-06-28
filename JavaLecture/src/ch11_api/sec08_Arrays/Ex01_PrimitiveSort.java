package ch11_api.sec08_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {87, 73, 65, 98, 79};
		Arrays.sort(scores);		// 오름차순 정렬, 자기파괴적 -> scores 내용바뀜
		System.out.println(Arrays.toString(scores));
		Arrays.stream(scores).forEach(x -> System.out.println(x));
		
		// default : Ascending order
		String[] fruits = {"참외", "수박", "토마토"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		// Descending order, int와 같은 primitive type은 Boxing을 해야함
		Arrays.sort(fruits, Comparator.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		
		Integer[] descScore = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descScore, Comparator.reverseOrder());
		System.out.println(Arrays.toString(descScore));
	}

}
