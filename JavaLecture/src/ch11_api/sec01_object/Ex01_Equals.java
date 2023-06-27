package ch11_api.sec01_object;

public class Ex01_Equals {

	public static void main(String[] args) {
		Member m1 = new Member("James", "제임스");
		Member m2 = new Member("James", "제임수");
		Member m3 = new Member("James", "제임스");
		
		// Member에서 equals 메서드를 재정의하기 전, 참조하는 주소를 통해 비교
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		// Member2에서 equals 메서드를 재정의한 후, id와 name이 같으면 동일
		Member2 nm1 = new Member2("James", "제임스");
		Member2 nm2 = new Member2("James", "제임수");
		Member2 nm3 = new Member2("James", "제임스");
		System.out.println(nm1.equals(nm2));
		System.out.println(nm1.equals(nm3));
		
	}

}
