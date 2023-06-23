package ch02;

public class Ex03_typeconversion {
	
	public static void main(String[] args) {
		// 형변환 : 작은type -> 큰type 자동형변환, 큰type -> 작은type 수동(명시적)으로 형변환	
		
		// 자동형변환(Promotion)
		// byte -> short -> int -> long -> float -> double
		short a = 256;
		int b = a;			
		long c = b;			
		float d = c;		
		double e = d;
		
		System.out.printf("%d, %d, %.1f, %.1f\n", b, c, d, e);
		
		
		// 강제형변환(Casting)
		long f = 250L;
		int g = (int)f;
		short h = (short)g;
		double i = 3.14;
		float j = (float)i;
		System.out.printf("%d, %.2f\n", h, j);
		
		int k = (int)i; 				// 3.14 -> 3
		
		
		// 연산에서의 자동형변환
		long l = a + b + c;		// short + int + long --> long
		double m = l + 1024.5f; // long + float --> double
		double n = a / b;
		System.out.printf("%d, %.2f, %.1f\n", l, m, n);
	
		
		// 문자열 자동형변환
		int o = 3 + 7;
		String p = "3" + 7;		// res : "37"
		String q = "3" + "7";	// res : "37"
		String r = "pi값은 " + 3.14f;					// String + float -> String
		String s = 1 + 2 + "3";					// res : 33, 좌->우 연산 수행
		System.out.printf("%d, %s, %s, %s, %s\n", o, p, q, r, s);
		
		// 문자열 -> 기본 타입 강제형변환
		int t = Integer.parseInt(q);
		long u = Long.parseLong("123456789000");
		double v = Double.parseDouble("3.14156735");
		System.out.printf("%d, %,d, %.10f\n", t, u, v);
		
		
		// 기본타입 -> 문자열 강제형변환
		String w = String.valueOf(u);
		String x = String.valueOf(3.1415926535);
		System.out.printf("%s, %s", w, x);
	}
	
}
