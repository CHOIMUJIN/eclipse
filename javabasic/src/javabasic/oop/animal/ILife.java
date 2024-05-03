package javabasic.oop.animal;

public interface ILife extends ILight { // 상위클래스인 생물 interface
	                                                     // extends ILight를 하는 이유는 ILight를 최상위로 만들기 위해서다.
	
	// 숨쉰다
	public abstract void breath();
	
	// 성장한다
	public abstract void growth();

}
