package hw.ch05;

public class Ch05_2_FizzBuzz {

	public static void main(String[] args) {
		// FizzBuzz : 1~100, 3의배수 fizz, 5의배수 buzz, 3/5 공배수 fizzbuzz
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d is FizzBuzz!\n", i);
			}
			else if (i % 3 == 0) {
				System.out.printf("%d is Fizz!\n", i);
			}
			else if (i % 5 == 0) {
				System.out.printf("%d is Buzz!\n", i);
			}
		}
	}

}
