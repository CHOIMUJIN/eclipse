package javabasic.oop.animal;

public class LifeMain {
	
	public static void main(String[] args) {
		
		ILife dog = new Dog("말티즈"); // 생성은 상위타입으로 한다. -> ILife, 상위타입으로 하위타입 객체를 생성한다.
		ILife cat = new Cat("러시안 고양이"); // 이름을 붙여준다.
		
		ILife rose = new Rose("백장미"); // 생성은 상위타입으로 한다. -> ILife, 상위타입으로 하위타입 객체를 생성한다.
		ILife lily = new Lily("홍백합"); // 이름을 붙여준다.
		
		// 개를 숨쉬도록 해보자.
		dog.breath(); // 괄호 속 dog.name이 안 되는 이유는 dog.name이 ILife 타입인데 ILife에 없기 때문이다
		                    // Dog가 이미 말티즈를 갖고있기 때문에 괄호 안에 써주면 안 된다.
		
		// 장미를 광합성하게 해보자.
//		rose.light(); // rose 타입은 ILife인데 ILife에는 light가 없어서 에러가 뜬다.
		// 방법 1 (형변환 이용)
//		((IPlant)rose).light(); // 형변환해서 하위타입으로 바꿨다.
		// 방법 2 (인터페이스 분리 이용)
		rose.light();
		
		// 고양이를 숨쉬도록 해보자.
		cat.breath();
		
		// 백합을 광합성하게 해보자.
		lily.light();
		
	} // main

} // class
