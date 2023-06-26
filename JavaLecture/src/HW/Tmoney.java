package hw;

public class Tmoney {
	private int age;
	private int cash;
	
	public Tmoney () {};	
	public Tmoney(int age, int cash) {
		super();
		this.age = age;
		this.cash = cash;
	}
	public Tmoney(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCash() {
		return cash;
	}
	public void charge(int cash) {
		this.cash += cash;		
	}
	public void ride() {
		if (this.age >= 7 && this.age <=12) {
			if (this.cash < 730)
				System.out.println("잔액이 부족합니다.");
			else {
				this.cash -= 730;
				System.out.println("잔액 : " + this.cash);
			}
		}
		else if (this.age>=13 && this.age <=18) {
			if (this.cash < 1010)
				System.out.println("잔액이 부족합니다.");
			else {
				this.cash -= 1010;
				System.out.println("잔액 : " + this.cash);
			}
		}
		else if (this.age >=18) {
			if (this.cash < 1450)
				System.out.println("잔액이 부족합니다.");
			else {
				this.cash -= 1450;
				System.out.println("잔액 : " + this.cash);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Tmoney [나이=" + age + ", 잔액=" + cash + "]";
	}

	
	
}
