package Ch04;

import java.util.Scanner;

public class Ex05_Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = scan.nextInt();
		scan.close();
		String grade = "";
		
		// 분위별 학점 계산			
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		// F이외의 경우 +,0,- 학점 판별		
		if (grade != "F") {
			if (score % 10 >= 7) {
				grade += "+";
			}else if (score % 10 >= 3) {
				grade += "0";
			}else {
				if (score == 100)
					grade += "+";
				else 
					grade += "-";
			}
		}
		System.out.println(score + "점의 학점은 " + grade + "입니다.");
	}
}
