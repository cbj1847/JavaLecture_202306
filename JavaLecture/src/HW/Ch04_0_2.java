package hw;

import java.util.Scanner;

public class Ch04_0_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시간 입력(HHMM) >> ");
		String alarm = scan.nextLine();
		int timerH = 0;
		int timerM = 0;
		scan.close();
		
		if (Integer.parseInt(alarm.substring(2, 4)) - 45 < 0) {
			if (Integer.parseInt(alarm.substring(0, 2)) == 0) {
				timerH = 23; 
				timerM = Integer.parseInt(alarm.substring(2, 4)) + 15;
			}else {
			timerH = Integer.parseInt(alarm.substring(0, 2)) - 1; 
			timerM = Integer.parseInt(alarm.substring(2, 4)) + 15;
			}
		}else {
			timerH = Integer.parseInt(alarm.substring(0, 2)); 
			timerM = Integer.parseInt(alarm.substring(2, 4)) - 45;
		}
		System.out.printf("창영식 기상시간은 %02d : %02d", timerH, timerM);
	}

}
