package ch07_inheritance.sec01;

public class Child extends Parent{		// cObject extends pObject : 객체 상속 구문
	int childInt;
	
	Child() {};
	Child(int childInt) { 
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
