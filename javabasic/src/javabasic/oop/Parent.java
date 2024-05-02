package javabasic.oop;

// Parent는 GrandParent를 상속받는다.
// Parent의 참조범위는 GrandParent의 메모리까지 확장(extends)한다.
public class Parent extends GrandParent {
	
	String name;
	int age;
	String job;
	
	Parent (){
	}
	
	Parent(String name, int age, String job){
//		super(name, age, job); // super(상위), 생략가능
		this.name = name;
		this.age=age;
		this.job=job;
	}
	
	@Override
	void say( ) { // 메소드 만들기, 메소드는 생성자 밑에 만들기
		System.out.println("아버님이 말씀하셨다!");
	}

}
