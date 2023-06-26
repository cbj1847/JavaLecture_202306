package ch07_inheritance.sec02;

public class Child extends Parent{		// cObject extends pObject : 객체 상속 구문
	int childInt;
	
	Child() {};
	Child(int childInt) {
		super(childInt * 2); 		// 부모 생성자 호출
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
