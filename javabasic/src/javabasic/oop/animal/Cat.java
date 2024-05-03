package javabasic.oop.animal;

public class Cat extends AbstractAnimal { // Dog 클래스와 동일하게 implements IAnimal 지우고 extends AbstractAnimal 적어서 확장하기

	Cat(String name){
		this.name = name;
	}
	
//	@Override
//	public void breath() {
//		System.out.println("고양이가 숨을 쉰다!");
//	}
//
//	@Override
//	public void growth() {
//		System.out.println("고양이가 성장한다!");
//	}
//
//	@Override
//	public void eat() {
//		System.out.println("고양이가 먹는다!");
//	}
//
//	@Override
//	public void move() {
//		System.out.println("고양이가 움직인다!");
//	}

}
