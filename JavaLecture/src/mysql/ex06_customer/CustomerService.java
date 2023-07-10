package mysql.ex06_customer;

import java.util.List;
import java.util.Scanner;

public class CustomerService {
	private CustomerDao cDao = new CustomerDao();
	private Scanner scan = new Scanner(System.in);
	
	public void listCustomer() {
		List<Customer> list = cDao.getCustomerList();
		for (Customer c : list)
			System.out.println(c);
	}
	
	public void registerCustomer() {
		String uid = null;
		while(true) {			// unique한 uid를 받을 때 까지 루프 돌리기
			System.out.print("UID 입력 >> ");
			uid = scan.nextLine();
			Customer c = cDao.getCustomer(uid);
			if (c == null)
				break;
			System.out.println("중복된 UID입니다. 다시 입력하세요.");
		}
		System.out.print("이름 입력 >> ");
		String uname = scan.nextLine();
		cDao.insertCustomer(new Customer(uid, uname));
		System.out.println("### 등록되었습니다 ###");
	}
	
	public void updateCustomer() {
		
	}
	
	public void deleteCustomer() {
		
	}
}
