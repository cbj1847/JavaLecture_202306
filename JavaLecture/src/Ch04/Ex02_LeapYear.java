package ch04;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("연도입력 >> ");
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if ((year % 400) == 0)
			System.out.println(year + "년은 윤년입니다.");
		else if ((year % 100) == 0)
			System.out.println(year + "년은 평년입니다.");
		else if ((year % 4) == 0)
			System.out.println(year + "년은 윤년입니다.");
		else
			System.out.println(year + "년은 평년입니다.");

		System.out.println(leapYear(year));		// leapYear method 이용
		
	}
	
	private static String leapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return (year + "년은 윤년입니다.");
		return (year + "년은 평년입니다.");
	}
	
}