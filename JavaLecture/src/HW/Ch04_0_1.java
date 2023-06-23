package hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Ch04_0_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("생년월일 입력(ex.19960109) >> ");
		String birth = scan.nextLine();					// String[] birth = scan.nextLine().split('-') <- Array
		scan.close();
		
		LocalDate today = LocalDate.now();		
		int a = today.getYear(), b = today.getMonthValue(), c = today.getDayOfMonth();
		
		int age = 0;
		if ((b - Integer.parseInt(birth.substring(4, 6)) >= 0) && (c - Integer.parseInt(birth.substring(6, 8)) >= 0)) {
			age =  a - Integer.parseInt(birth.substring(0, 4));
		}else {
			age =  a - Integer.parseInt(birth.substring(0, 4)) - 1;
		}
		System.out.println("생년월일 : " + birth + " / 만 나이 : " + age);
	}
}
