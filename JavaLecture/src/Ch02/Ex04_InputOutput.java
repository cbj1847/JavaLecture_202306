package ch02;

import java.util.Scanner;

public class Ex04_InputOutput {

	public static void main(String[] args) throws Exception{
		/*
		 * int keyCode = System.in.read(); // 하나의 character를 입력받을 때 사용, 잘 사용되지 않음.
		 * System.out.println(keyCode);
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("입력하세요> ");
		String inputText = scan.nextLine();		// Enter가 입력될 때 까지의 문자열을 입력받음
		System.out.println(inputText);
		
		System.out.printf("타입을 입력하세요> ");
		String type = scan.nextLine();			// 정수 / 실수
		System.out.printf(type + "를 입력하세요> ");
		String numStr = scan.nextLine();
		
		if (type.equals("정수")) {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		}else if (type.equals("실수")){
			double num = Double.parseDouble(numStr);
			System.out.println(num);
		}else {
			System.out.println("정수 혹은 실수를 입력하세요.");
		}		
	}

}
