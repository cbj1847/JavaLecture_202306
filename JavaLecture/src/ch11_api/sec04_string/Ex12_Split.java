package ch11_api.sec04_string;

import java.util.Arrays;

public class Ex12_Split {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArray = fruits.split(", ");
		System.out.println(Arrays.toString(fruitArray));
		
		String fruits2 = "감, 배. 귤; 밤";
		String[] fruitArray2 = fruits2.split("[,|.|;] ");		// 정규표현식 사용
		System.out.println(Arrays.toString(fruitArray2));
		
		// PATH
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArray = paths.split(";");
		for (String path : pathArray)
			System.out.println(path);
	}

}
