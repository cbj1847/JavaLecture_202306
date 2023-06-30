package ch13_collection.sec01_list;

import java.util.Comparator;

/**
 * 나이만비교, 나이 오름차순 
 */

public class MemberAgeComparator implements Comparator<Member>{

	@Override
	public int compare(Member m1, Member m2) {
		
		return m1.getAge() - m2.getAge();
	}
	
	
	
}
