package ch07_inheritance.sec05_abstract;

public class SmartPhone extends Phone {
	@Override
	void turnOn() { 
		System.out.println("핸드폰 전원을 켭니다.");
	}
	@Override
	void turnOff() { 
		System.out.println("핸드폰 전원을 끕니다.");
	}
	// 추상클래스, 반드시 overriding후 사용해야함.
	@Override
	public void call(String number) {
		System.out.println(number + "로 연결중입니다.");
	}

}
