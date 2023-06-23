package ch05;

import java.util.Arrays;

public class Ex03_MultiDemensionArray {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];
		int score[][] = {{80, 90, 85}, {92, 76, 84}};
		
		System.out.printf("%d,%d\n", score[0][0], score[1][2]);
		
		// 다차원배열의 행의 갯수, 열의 갯수
		System.out.printf("%d, %d\n", matrix.length, matrix[0].length);
		
		System.out.println(Arrays.toString(score));			// 잘못된 방법
		System.out.println(Arrays.toString(score[0]));		// 1행
		System.out.println(Arrays.toString(score[1]));		// 2행
		
		
		
		
	}

}
