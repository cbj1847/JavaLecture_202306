package HW;

public class Ch04_2_2 {

	public static void main(String[] args) {
		// for문을 이용 -> 1~100 3의 배수 총합 구하는 코드 작성.
		int sum = 0;
		for (int i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
