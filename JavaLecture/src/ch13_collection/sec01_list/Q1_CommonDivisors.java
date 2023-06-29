package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 두개의 정수를 입력받고, 공약수를 출력
 * 단, 두 수의 공약수를 리스트로 반환하는 메서드 getCommonDivisors이용
 */

public class Q1_CommonDivisors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = scan.nextInt();
		scan.close();
		
		List<Integer> divisors = getCommonDivisors(num1, num2);
		divisors.forEach(x -> System.out.print(x + " "));
	}

	private static List<Integer> getCommonDivisors(int num1, int num2) {
		List<Integer> list = new ArrayList<>();

		for (int i=1; i<=Math.min(num1, num2); i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				list.add(i);
			}
		}
		return list;
	}
}
