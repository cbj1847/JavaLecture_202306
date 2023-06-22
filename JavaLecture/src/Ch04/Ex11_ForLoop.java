package Ch04;

import java.util.Scanner;

public class Ex11_ForLoop {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++) 
			sum += i;
		System.out.println("1 ~ 100 정수의 합 : " + sum);
		
		int oddSum = 0;
		for (int i=1; i<=100; i+=2)
			oddSum += i;
		System.out.println("1 ~ 100 홀수의 합 : " + oddSum);
		
		int evenSum = 0;
		for (int i=0; i<=100; i+=2)
			evenSum += i;
		System.out.println("1 ~ 100 짝수의 합 : " + evenSum);
		
		int divSum = 0, num =24;
		for (int i=1; i<=num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
				divSum += i;
		}
		System.out.println("\n1 ~ 24 약수의 합 : " + divSum);
		
		// 사용자가 5번 입력한 문자열을 받아서, 공백을 사이에 넣고 하나의 문자열로 만들기
		String res = "";
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 문자 입력 >> ");
			String strInput = scan.nextLine();
			res += strInput + " ";
		}
		scan.close();
		System.out.println(res);
		
	}
}
