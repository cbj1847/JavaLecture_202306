package hw.ch14;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import ch13_collection.sec02_set.Member;

public class CompanyMain {

	public static void main(String[] args) {
		// 1. 사번과 이름이 같으면 동일한 사람이다. -> hashset
		Set<Company> hs = new HashSet<>();
		hs.add(new Company(10, "박규연", Position.사원, LocalDate.of(1998, 1, 1)));
		hs.add(new Company(9, "최범준", Position.대리, LocalDate.of(1996, 1, 9)));
		hs.add(new Company(8, "전광현", Position.차장, LocalDate.of(1999, 2, 1)));
		hs.add(new Company(7, "서준범", Position.사원, LocalDate.of(2000, 3, 1)));
		hs.add(new Company(11, "박상요", Position.사원, LocalDate.of(2001, 4, 1)));
		hs.add(new Company(16, "임선영", Position.대리, LocalDate.of(2002, 5, 1)));
		hs.add(new Company(113, "박수진", Position.과장, LocalDate.of(2003, 6, 1)));
		hs.add(new Company(421, "김영주", Position.과장, LocalDate.of(2004, 7, 1)));
		hs.add(new Company(312, "손석원", Position.부장, LocalDate.of(2005, 8, 1)));
		hs.add(new Company(135, "김승규", Position.사원, LocalDate.of(2006, 9, 1)));
		
		
	}

}
