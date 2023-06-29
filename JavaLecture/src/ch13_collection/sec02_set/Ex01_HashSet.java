package ch13_collection.sec02_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// HashSet에 객체 저장
		set.add("Java"); set.add("JSP"); set.add("JDBC"); set.add("Servlet"); 
		set.add("Java"); 		// Java는 중복객체이므로 저장 X
		System.out.println("============================================");
		System.out.println(set.size());
		set.forEach(x -> System.out.println(x));
		System.out.println("============================================");
		System.out.println(set.contains("JSP"));	// boolean value return 
		
		// 객체 삭제
		set.remove("JSP");
		System.out.println(set.contains("JSP"));
		System.out.println("============================================");
		
		
	}

}
