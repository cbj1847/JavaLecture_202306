package ch10_exception;

public class Ex02_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// System.out.println(args[0]);
		
		// 예외처리 방법
		if (args.length < 1) {
			System.out.println("사용법 : 매개변수를 입력하세요.");
			
		} else {
			System.out.println(args[0]);
		}
		
		
	}
}
