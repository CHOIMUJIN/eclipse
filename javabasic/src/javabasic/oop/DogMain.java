package javabasic.oop;

public class DogMain {

	public static void main(String[] args) {

		Dog dog1 = new Dog(); // Dog 클래스에서 기본생성자를 만들었기 때문에  Dog()가 가능함
		System.out.println(dog1);
		
		Dog dog2 = new Dog("진돗개");
		System.out.println(dog2);
		
		Dog dog3 = new Dog("진돗개", 10);
		System.out.println(dog3);
		
		Dog dog4 = new Dog("진돗개", 10, "흰");
		System.out.println(dog4);
		
		Dog dog5 = new Dog("똥개", 15, "빨간");
		System.out.println(dog5);
		
		Dog dog6 = new Dog("똘이", 17, "흰");
		System.out.println(dog6);
		
	} // main

} // class
