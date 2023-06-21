package Ch03;

import java.util.function.BiConsumer;

public class Ex01_Operand {

	public static void main(String[] args) {
		int i = 20;
		System.out.printf("%d, %d\n", i++, ++i);		// 20, 22
		
		int x = -100;
		System.out.println(x);
		
		int sum = 0;
		for (int k=1; k<=100; k++) {
			sum += k;
		}
		System.out.println(sum);
		
		System.out.printf("%s, %s\n", 3+3.0+"JDK", "JDK"+3+3.0);
		
		char capitalA = 'A', capitalB = 'B';
		if (capitalA < capitalB) {
			System.out.println("capitalA가 capitalB보다 작다.");
		}
		
		boolean m = false, n = true;
		System.out.println(m | n);
		System.out.println(m & n);
		System.out.println(!(m & n));
		
	}

}
