package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		//  <generic> : list객체 type을 지정해줌 
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// Enhanced for-loop
		for (String a : list) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// stream과 lambda 함수로 처리
		list.forEach(x -> System.out.print(x + " ")); 		// in python : lambda x: print(x)
		System.out.println();
		
		list.remove(1);
		list.add("JDBC");
		list.add("Spring");
		
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		System.out.println(list.get(1));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains("Spring"));
		
		list.clear();
		System.out.println(list.isEmpty());
	}

}

