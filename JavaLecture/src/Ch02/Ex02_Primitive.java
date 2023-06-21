package Ch02;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// Literal
		int intLiteral = 30;
		int bitLiteral = 0b1001;			// 9
		int octal = 0377; 					// 255
		int hexa = 0xff; 					// 255
		long longval = 256L;				// long type literal, xxL
		System.out.printf("%d, %d, %d, %d, %d\n",intLiteral, bitLiteral, octal, longval, hexa);		
	
		char ga = '가';						// single quote
		char capitalA = 0x41;
		System.out.printf("%c, %c\n", ga, capitalA);
		
		// 기본(primitive) 타입은 아니지만 기본처럼 사용되는 String
		String hello = "Hello World!";		// double quote
		System.out.printf("%s\n", hello);
		
		// 실수 : float, double
		double pi = 3.14;
		double mega = 1e6;
		float exp = 2.718F;					// float type literal, xxF
		System.out.printf("%.2f, %.3f, %.1f\n", pi, exp, mega);
		
		// Boolean
		boolean start = true;
		boolean stop = false;
		
		System.out.printf("%s, %s\n", start, stop);
		
		
	}
}
