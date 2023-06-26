package ch08_interface.sec03_polymorphism;

public class Car {
	// 필드의 다형성
	Rollable frontLeftTire = new HankookTire();
	Rollable frontRightTire = new HankookTire();
	Rollable backLeftTire = new KeumhoTire();
	Rollable backRightTire = new KeumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	// 매개변수의 다형성
	void changeFrontTire(Rollable tire) {
		this.frontLeftTire = tire;
		this.frontRightTire = tire;
	}
}
