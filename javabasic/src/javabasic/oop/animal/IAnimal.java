package javabasic.oop.animal;

public interface IAnimal extends ILife { // 동물 interface, ILife를 상속받는다.
	
	// 먹는다
	public abstract void eat();
	
	// 움직인다
	public abstract void move();
	
//	// 숨쉰다                                             // 공통 부분은 제거
//	public abstract void breath();
//	
//	// 성장한다
//	public abstract void growth();
	
}
