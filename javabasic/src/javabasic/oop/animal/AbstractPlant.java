package javabasic.oop.animal;

public class AbstractPlant implements ILife { // 추상클래스라서 객체를 못 만들기 때문에 this를 못 쓴다.
	                                                                // implements IPlant에서 implements ILight로 바뀐 이유는 IPlant 클래스가 사려졌기 때문이다.

	String name;
	
	@Override
	public void breath() {
		System.out.println(name + "숨을 쉰다!");
	}

	@Override
	public void growth() {
		System.out.println(name + "성장한다!");
	}

	@Override
	public void light() {
		System.out.println(name + "광합성을 한다!");
	}

}
