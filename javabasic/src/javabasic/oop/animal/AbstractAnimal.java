package javabasic.oop.animal;

public abstract class AbstractAnimal implements IAnimal { // 추상클래스를 만들자, 추상클래스는 IAnimal을 구현하고 있다.
	                                                                                   // 추상클래스라서 객체를 못 만들기 때문에 this를 못 쓴다.

	String name; // Dog 클래스에서 가져옴.
	
	@Override
	public void breath() { // String name이 에러가 뜨는 이유는 만든 적이 없기 때문에 상위클래스를 건드려야한다.
		System.out.println(name + "숨을 쉰다!"); // ILife, IAnimal에 String name을 넣어준다
		                                                         // 하지만 String name을 Dog 클래스에서 가져왔으므로 상위클래스부터 모두 String name을 지워준다.
	}

	@Override
	public void growth() {
		System.out.println(name + "성장한다!");
	}

	@Override
	public void eat() {
		System.out.println(name + "먹는다!");
	}

	@Override
	public void move() {
		System.out.println(name + "움직인다!");
	}
	
	@Override
	public void light() {			// ILight가 최상위가 되고 난 후 Dog와 Cat이 ILight 하위클래스기 때문에 light를 추가해서 에러를 막아준다.
	}

}
