package ch11_api.sec04_string;

public class Ex_Q1 {
	// 1~1000 0-9 몇번사용?
	public static void main(String[] args) {
		for (int num1=0; num1<10; num1++) {
			int sum = 0;
			for (int i=1; i<=1000; i++) {
				int len = String.valueOf(i).length();
				for (int j=0; j<len; j++) {
					if (String.valueOf(i).charAt(j) == String.valueOf(num1).charAt(0))
						sum ++;
				}
				
			}
			System.out.printf("%d : %d번 사용",num1, sum);
			System.out.println();
		}
	}

}
