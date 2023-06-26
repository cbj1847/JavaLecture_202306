package ch07_inheritance.sec05_abstract;

public class Main {

	public static void main(String[] args) {
		// Phone phone = new Phone(); 		// 추상클래스는 인스턴스화 불가
		SmartPhone sp = new SmartPhone();	// 추상 클래스를 상속받은 클래스만 객체화 가능
		sp.turnOn();
		sp.turnOff();
		sp.call("010-6405-1847");
	}

}
