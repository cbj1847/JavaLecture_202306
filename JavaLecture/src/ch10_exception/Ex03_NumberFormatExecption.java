package ch10_exception;

public class Ex03_NumberFormatExecption {

	public static void main(String[] args) {
		String str = "100원";
		str = str.replace("원", "");
		// int value = Integer.parseInt(str); 		숫자포맷 예외
				
		// 문자열 API 또는 정규표현식을 사용하여 숫자 이외의 문자는 다 삭제
		int value = Integer.parseInt(str);
		System.out.println(value);
	}

}
