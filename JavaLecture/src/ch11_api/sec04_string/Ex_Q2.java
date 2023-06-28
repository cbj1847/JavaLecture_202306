package ch11_api.sec04_string;

import java.util.Scanner;

public class Ex_Q2 {

	public static void main(String[] args) {
		// isPalindrome
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 >> ");
		String input1 = scan.nextLine();
		int sum = 0;
		for (int i=0; i<input1.length()/2; i++) {
			if (input1.charAt(i) == input1.charAt(input1.length()-i-1))
				sum += 1;
		}
		
		if (sum == input1.length()/2)
			System.out.println("Palindrome입니다.");
		else 
			System.out.println("Palindrome이 아닙니다.");
		
		scan.close();
	}

}
