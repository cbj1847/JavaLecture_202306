package hw;

import java.util.Scanner;

public class Ch05_2_6 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		double mean = 0.0;
		int lenStu = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selecNo = scan.nextInt();
			
			if(selecNo == 1) {
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			} 
			else if(selecNo == 2) {
				for (int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = scan.nextInt();
				}
			}
			else if(selecNo == 3) {
				for (int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d \n", i, scores[i]);
				}
			}
			else if(selecNo == 4) {
				for (int score : scores) {
					if (score > max)
						max = score;
					sum += score;
				} 
				lenStu += scores.length;
				mean = (double) sum / lenStu;
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("평균 점수 : %f\n", mean);
			}
			else if(selecNo == 5) {
				run = false;
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
		
	}

}
