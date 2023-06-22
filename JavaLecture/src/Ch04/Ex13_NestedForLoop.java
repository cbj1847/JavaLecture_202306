package Ch04;

public class Ex13_NestedForLoop {

	public static void main(String[] args) {
		
		// 다이아몬드 1사분면
		for (int i=0; i<5; i++) {
			for (int k=0; k<i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 다이아몬드 2사분면
		for (int i=0; i<5; i++) {
			for (int k=0; k<4-i; k++) {
				System.out.print(' ');
			}
			for (int k=0; k<i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 다이아몬드 3사분면
		for (int i=0; i<5; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(' ');
			}
			for (int k=0; k<5-i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 다이아몬드 4사분면
		for (int i=0; i<5; i++) {
			for (int k=0; k<5-i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 완성된 다이아몬드 그리기
		// 다이아몬드 1-2사분면
		for (int i=0; i<6; i++) {
			for (int k=0; k<10-2*i; k++) {
				System.out.print(' ');
			}
			for (int k=0; k<i*4+1; k++) {
				if (k%2 == 0)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		// 다이아몬드 3-4사분면
		for (int i=0; i<5; i++) {
			for (int k=0; k<2*i+2; k++) {
				System.out.print(' ');
			}
			for (int k=0; k<17-i*4; k++) {
				if (k%2 == 0)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
	
	}

}
