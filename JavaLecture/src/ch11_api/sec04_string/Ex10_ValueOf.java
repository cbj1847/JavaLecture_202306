package ch11_api.sec04_string;

public class Ex10_ValueOf {

	public static void main(String[] args) {
		// valueOf : 기본타입의 값을 문자열로 변환
		String num = String.valueOf(100);
		String num2 = "" + 100;
		System.out.println(num.equals(num2)); 
	}

}
