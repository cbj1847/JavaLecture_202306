package ch11_api.sec08_Arrays;

import java.util.Arrays;

public class Ex02_ObjectSort {

	public static void main(String[] args) {
		Member m1 = new Member(123, "James");
		Member m2 = new Member(456, "Maria");
		Member m3 = new Member(789, "Brian");
		Member[] members = {m1, m2, m3};
		
		for (Member m: members) {
			System.out.println(m);
		} 
		System.out.println();
		
		// Member id를 기준으로 오름차순 정렬
		Arrays.sort(members);
		for (Member m: members) {
			System.out.println(m);
		}
		
		
	}

}
