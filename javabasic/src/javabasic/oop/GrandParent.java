package javabasic.oop;

public class GrandParent {
	
	String name;
	int age;
	String job;
	
	GrandParent(){ // 기본생성자 만들기
	}

	GrandParent(String name, int age, String job){ // 생성자 만들기, 원래 기본생성자는 만들지 않지만 하위클래스에 기본생성자를 위해서
		this.name = name;                                   // 상위클래스에 기본생성자를 만든다.
		this.age = age;
		this.job = job;
	}
	
	// @Override // 처음 만든 것이기 때문에 Override를 붙이지 않는다.
	void say() { // 메소드 만들기, 메소드는 생성자 밑에 만들기
		System.out.println("할아버님이 말씀하셨다!");
	}
	
} // class
