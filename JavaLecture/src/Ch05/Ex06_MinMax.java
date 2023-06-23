package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex06_MinMax {
	public static void main(String[] args) {
		int[] scores = new int[30];
		Random rand = new Random();
		
		for (int i=0; i<scores.length; i++)
			scores[i] = rand.nextInt(100);
		System.out.println(Arrays.toString(scores));
		
		// scores의 최댓값 구하기
		int max = 0;
		for (int score : scores)
			if (score > max)
				max = score;
		System.out.println("scores array의 최댓값 : " + max);
		
		// scores의 최솟값 구하기
		int min = 100000000;
		for (int score : scores)
			if (score < min)
				min = score;
		System.out.println("scores array의 최솟값 : " + min);
		
	}
}
