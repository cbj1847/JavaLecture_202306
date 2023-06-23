package ch05;

import java.util.Arrays;

public class Ex02_Array {
	
	public static void main (String[] args) {
		int score[] = {80, 70, 78, 92, 96};
		System.out.printf("%d, %d\n", score[0], score[4]);
		// 성적 평균
		int sum = 0;
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("평균 : " + (double)sum/score.length);
		 
		// 배열 생성
		// 생성하면서 값을 지정하는 경우
		int[] intArray = {4, 67, 8, 91, 23};					// *** 자주사용
		double doubleArray[] = {3. , 4.6, 2.4};
		String[] fruits = {"사과", "배", "딸기", "수박"};
		
		// 크기를 지정하고 empty array를 생성하는 경우 - 이 경우 배열의 값은 초기값(숫자자료형 - 0, 참조자료형 - null)으로 지정 됨.
		int[] newArray = new int[10]; 							// *** 자주사용
		int dice[] = new int[5];
		for (int i =0; i < 5; i++) {
			dice[i] = 1 + (int)(Math.random() * 6);
		}
		System.out.println(Arrays.toString(dice));
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(args.length);
		for (int i=0; i<args.length; i++)
			System.out.println(args[i]);
		String[] myArgs = "10 20 30".split(" ");
		System.out.println(Arrays.toString(myArgs));
	} 
}
