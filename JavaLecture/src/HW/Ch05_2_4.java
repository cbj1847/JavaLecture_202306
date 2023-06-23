package hw;

public class Ch05_2_4 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int element : array) {
			if (element > max)
				max = element;
		}
		System.out.println(max);
		
	}

}
