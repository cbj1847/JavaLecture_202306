package ch11_api.sec04_string;

public class Ex07_SubString {

	public static void main(String[] args) {
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0,6);
		System.out.println(firstPart);
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		
		// 생년월일을 "1988-08-23" 형태로 바꾸기
//		String birth = "";
//		if (secondPart.charAt(0) == '1' || secondPart.charAt(0) == '2') {
//			birth = "19";
//		} else {
//			birth = "20";
//		}
		String birth = (ssn.charAt(7) == '1' || ssn.charAt(7) == '2') ? "19" : "20";
		System.out.println(birth + firstPart.substring(0, 2) + "-" + firstPart.substring(2, 4) + "-" + firstPart.substring(4));
	}
}
