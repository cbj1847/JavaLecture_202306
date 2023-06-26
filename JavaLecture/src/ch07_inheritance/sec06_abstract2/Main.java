package ch07_inheritance.sec06_abstract2;

public class Main {

	public static void main(String[] args) {
		Pig pig = new Pig();
		System.out.println(pig.kind);
		pig.breathe();
		pig.sound();
		
		Cow cow = new Cow();
		System.out.println(cow.kind);
		cow.sound();
		
		// 자동 형변환
		Animal animal = cow;
		animal.sound();
		animal = pig;
		animal.sound();
		
		animalSound(cow);
		animalSound(pig);
	}
	
	static void animalSound(Animal animal) {
		animal.sound();
	}
	
	

}
