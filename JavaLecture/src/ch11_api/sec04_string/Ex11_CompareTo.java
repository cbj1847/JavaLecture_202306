package ch11_api.sec04_string;

/**
 * compareTo() : 사전순으로 나열 했을 때, 두 객체의 비교 (음수, 0, 양수)
 * 숫자값을 보지 말고, 부호만 보면 됨.
 */

public class Ex11_CompareTo {

	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = new String("Apple");
		System.out.println(s1.compareTo(s2)); 		//-1 (A - B), 사전순으로 먼저나옴
		System.out.println(s2.compareTo(s1)); 		// 1 (B - A), 사전순 나중
		System.out.println(s1.compareTo(s3)); 		// 0 (A - A), 같음
		System.out.println();
		
		Student st1 = new Student(1, "James");
		Student st2 = new Student(2, "Maria");
		Student st3 = new Student(3, "Brian");
		System.out.println(st1.compareTo(st2));		// -3 (J - M)
		System.out.println(st1.compareTo(st3));		// 8 (J - B)
	}

}
