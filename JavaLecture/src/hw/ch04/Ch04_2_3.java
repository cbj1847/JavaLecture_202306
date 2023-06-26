package hw.ch04;

public class Ch04_2_3 {

	public static void main(String[] args) {
		
		while(true) {
			int dice1 = 1 + (int) (Math.random()*6);
			int dice2 = 1 + (int) (Math.random()*6);
			System.out.printf("%d, %d", dice1, dice2);
			System.out.println();
			if (dice1 + dice2 == 5)
				break;
		}
	}

}
