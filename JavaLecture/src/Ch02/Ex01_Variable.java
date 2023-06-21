package Ch02;

public class Ex01_Variable {
	private int value = 20;
	
	public static void main(String[] args) {
		int score;				// 변수 선언
		score = 20;				// 변수 초기화
		int value = 40;
		int age = value * 2;			// 변수 선언 및 초기화
		
		System.out.println("age: " + age + ", score :" + score);
		
		int x = 10, y = 20;
		// x와 y의 값을 바꾸고 싶을 때
		int z = x;
		x = y;
		y = z;
		
		if (score > 100) {
			int localVar = 10;						// if block 내에서만 사용할 수 있는 지역변수
			// int value = 20;						// 지역변수 value가 이미 존재하므로 사용 불가
			System.out.println(localVar);
		}
													// if block 밖에서는 지역변수 localVar 사용불가
	}
	
}
