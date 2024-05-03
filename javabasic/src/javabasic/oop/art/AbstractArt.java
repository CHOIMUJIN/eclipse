package javabasic.oop.art;

public abstract class AbstractArt implements IArt {
	
	String name;

	@Override
	public void interesting() {
		System.out.println(name + "은 흥미롭다!");
	}

	@Override
	public void funny() {
		System.out.println(name + "은 재밌다!");
	}

	@Override
	public void beautiful() {
		System.out.println(name + "은 아름답다!");
	}
	
	@Override
	public void draw() {
		System.out.println(name + "을 그린다!");
	}
	
	@Override
	public void listen() {
		System.out.println(name + "을 듣는다!");
	}
	
	@Override
	public void see() {
		System.out.println(name + "을 본다!");
	}

}
