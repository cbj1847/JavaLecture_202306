package hw;

public class Ch05_2_5 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int rowLen = 0;
		double avg = 0.0;
		
		for (int[] row : array) {
			for (int element : row) {
				sum += element;
			} rowLen += row.length;
		}
		avg = sum / rowLen;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}
