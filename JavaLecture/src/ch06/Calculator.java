package ch06;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
		
	public int add() {
		System.out.print("x 입력 >> ");
		int x = scan.nextInt();
		System.out.print("y 입력 >> ");
		int y = scan.nextInt();
		int res = x + y;
		
		return res;
	}
	
	public int mul() {
		System.out.print("x 입력 >> ");
		int x = scan.nextInt();
		System.out.print("y 입력 >> ");
		int y = scan.nextInt();
		int res = x * y;
		
		return res;
	}
	
	public int sub() {
		System.out.print("x 입력 >> ");
		int x = scan.nextInt();
		System.out.print("y 입력 >> ");
		int y = scan.nextInt();
		int res = x - y;
		
		return res;
	}
	
	public double div() {
		System.out.print("x 입력 >> ");
		int x = scan.nextInt();
		System.out.print("y 입력 >> ");
		int y = scan.nextInt();
		double res = (double)x / y;
		
		return res;
	}
		
	

}
