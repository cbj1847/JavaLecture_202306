package ch10_exception;

public class Ex01_NullPointerException {

	public static void main(String[] args) {
		String str = null;
		// str = "Java";
		
		// System.out.println(str.length());	예외 발생
		
		if(str != null)		// 조건문으로 예외 처리
			System.out.println(str.length());
	}

}
