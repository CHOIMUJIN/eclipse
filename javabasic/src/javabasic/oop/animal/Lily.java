package javabasic.oop.animal;

public class Lily extends AbstractPlant { // Dog 클래스와 동일하게 implements IAnimal 지우고 extends AbstractAnimal 적어서 확장하기
	
	Lily(String name){
		this.name = name;
	}

//	@Override
//	public void breath() {
//		System.out.println("백합이 숨을 쉰다!");
//	}
//
//	@Override
//	public void growth() {
//		System.out.println("백합이 성장한다!");
//	}
//
//	@Override
//	public void light() {
//		System.out.println("백합이 광합성을 한다!");
//	}

}
