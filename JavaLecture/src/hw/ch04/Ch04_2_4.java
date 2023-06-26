package hw.ch04;

import java.time.Year;

public class Ch04_2_4 {

	public static void main(String[] args) {
		// nested for-loop을 이용, 4x+5y=60의 모든해를 구하여 (x, y)형태로 출력 * x, y <= 10 자연수
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				if (4*i + 5*j == 60) {
					System.out.printf("(%d, %d)", i, j);
					System.out.println();
				}
			}
		}
	}

}
