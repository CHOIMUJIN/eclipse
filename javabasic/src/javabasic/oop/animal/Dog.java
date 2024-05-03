package javabasic.oop.animal;

public class Dog extends AbstractAnimal { // implements IAnimal를 지우고 extends AbstractAnimal 적어서 확장하기
	                                                           // IAnimal을 구현하는 Dog 클래스를 만들 때는 Add를 누르고 IAnimal을 검색해서 적용시킨 후 만들기
	
	Dog(String name){
		this.name = name;
	}
	
	// 추상클래스를 만들면 지워도 됨.
//	@Override
//	public void breath() {
//		System.out.println("강아지가 숨을 쉰다!");
//	}
//
//	@Override
//	public void growth() {
//		System.out.println("강아지가 성장한다!");
//	}
//
//	@Override
//	public void eat() {
//		System.out.println("강아지가 먹는다!");
//	}
//
//	@Override
//	public void move() {
//		System.out.println("강아지가 움직인다!");
//	}

}
