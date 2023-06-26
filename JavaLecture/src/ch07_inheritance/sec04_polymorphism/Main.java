package ch07_inheritance.sec04_polymorphism;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		// 다형성
		Animal animal = new Cat();
		animal.sound();
		animal = dog;
		animal.sound();
		
		Animal animal_org = new Animal();
		animal_org.sound();
		
		animal = cat;
		
		// 부모 타입을 자식 타입으로 대입 할 수 있는지 확인한 후 강제 타입변환.
		// Animal이 어떤 타입인지 확인한 후 강제타입 변환할 것
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			cat.sound();
		} else if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.sound();
		} else {
			System.out.println("cat.sound() / dog.sound()를 사용할 수 없음.");
		}
		
		Object obj = new Animal();
		// obj.sound();		// 사용불가
		if (obj instanceof Animal) {
			animal = (Animal) obj;
			animal.sound();
		}
		
		
	}

}
