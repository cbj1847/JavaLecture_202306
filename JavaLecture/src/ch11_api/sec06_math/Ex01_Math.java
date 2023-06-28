package ch11_api.sec06_math;

public class Ex01_Math {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		
		System.out.printf("%d, %.2f, %.2f, %.2f, %.2f, %.2f \n",v1, v2, v3, v4, v5, v6);
		
		// 정수 1~6 난수
		System.out.println((int) (Math.random()*6) + 1);
		
		System.out.println(Math.round(Math.PI));	// 3L
		System.out.printf("%.10f \n", Math.PI);
	}

}
