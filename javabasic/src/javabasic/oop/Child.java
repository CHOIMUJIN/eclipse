package javabasic.oop;

public class Child extends Parent {
	
	String name;
	int age;
	String job;
	
	Child(String name, int age, String job){
//		super(name, age, job); // super(상위), 하위가 만들어질려면 상위가 만들어져 있어야한다, 생략가능
		this.name = name;
		this.age=age;
		this.job=job;
	}
	
	@Override // Override가 됐다는 표시
	void say( ) { // 메소드 만들기, 메소드는 생성자 밑에 만들기
		System.out.println("자식이 말했다!"); // Parent, Child는 overriding 된 것. void say는 메소드 시그니쳐
	}

}
