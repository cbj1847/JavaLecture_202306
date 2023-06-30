package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * List Sort
 * 	1) 대소관계가 명확한 클래스 (Integer, String,, etc)
 * 	2) 일반적인 클래스
 */

public class Ex05_Sort {

	public static void main(String[] args) {
		List<Integer> scoreList = Arrays.asList(78, 98, 64, 85, 91);
		
		// 오름차순 정렬
		scoreList.sort(Comparator.naturalOrder());
		scoreList.forEach(x -> System.out.print(x + " "));
		System.out.println("\n======================================================");
		
		// 내림차순 정렬
		scoreList.sort(Comparator.reverseOrder());
		scoreList.forEach(x -> System.out.print(x + " "));
		System.out.println("\n======================================================");
		
		List<String> fruitsList = Arrays.asList("감", "참외", "복숭아", "수박");
		// 오름차순 정렬
		fruitsList.sort(Comparator.naturalOrder());
		fruitsList.forEach(x -> System.out.print(x + " "));
		System.out.println("\n======================================================");
		
		// 내림차순 정렬
		fruitsList.sort(Comparator.reverseOrder());
		fruitsList.forEach(x -> System.out.print(x + " "));
		System.out.println("\n======================================================");
		
		List<Member> list = new ArrayList<>();
		list.add(new Member(23, "james"));
		list.add(new Member(28, "maria"));
		list.add(new Member(28, "brian"));
		list.add(new Member(23, "emma"));
		list.add(new Member(25, "amma"));
		list.add(new Member(28, "fmma"));
		// 미리 정의된 순서 : 나이 내림차순 -> (같은나이) 이름 오름차순
		list.sort(Comparator.naturalOrder());
		list.forEach(x -> System.out.println(x));
		System.out.println("======================================================");
		// 미리정의된 순서의 역순
		list.sort(Comparator.reverseOrder());
		list.forEach(x -> System.out.println(x));
		System.out.println("======================================================");
		
		list.sort(new MemberComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println("======================================================");
		
		// MemberAgeComparator class를 만들어서 비교
		list.sort(new MemberAgeComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println("======================================================");
		// MemberNameComparator class를 만들어서 비교
		list.sort(new MemberNameComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println("======================================================");
		
}

}
