package ch05;

import java.util.Scanner;

public class Ex01_Reference {
	
	public static void main (String[] args) {
		
		// 참조형 : 배열, 열거, 클래스, 인터페이스
		int a = 10, b = 10;
		System.out.println(a == b); 
		
		String ref1 = "자바";
		String ref2 = "자바";
		System.out.println(ref1 == ref2);		// String의 내용이 같은지 판별하는 것이 아닌 주소지가 같은지 판별
		
		String ref3 = new String("자바");
		System.out.println(ref2 == ref3);		// 주소지가 같은지 판별
		System.out.println(ref2.equals(ref3));	// 값이 같은지 판별
		
		String s = null;
		String[] strArr = null;
		Scanner scan = null;
		System.out.println(s == null);
		
		String t = "";
		System.out.println(t.length());
		//System.out.println(s.length());	->	Nullpointexception
		
	}
}
