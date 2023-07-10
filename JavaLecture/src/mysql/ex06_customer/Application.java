package mysql.ex06_customer;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean run = true;
		CustomerService cs = new CustomerService();
		while(run) {
			System.out.println("=====================================================================");
			System.out.println("*  1. 고객목록 | 2. 고객등록 | 3. 정보수정 | 4. 고객탈퇴 | 5. 종료  *");
			System.out.println("=====================================================================");
			System.out.print("선택 >> ");
			int caseClassifier = Integer.parseInt(scan.nextLine());
			
			switch (caseClassifier) {
			case 1:
				cs.listCustomer();
				break;
			case 2:
				cs.registerCustomer();
				break;
			case 3:
				cs.updateCustomer();
				break;
			case 4:
				cs.deleteCustomer();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("Warning : 1-5 숫자만 입력하세요.");
			}
		}
	}

}
