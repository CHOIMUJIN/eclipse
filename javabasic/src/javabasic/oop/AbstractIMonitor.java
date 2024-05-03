package javabasic.oop;

public abstract class AbstractIMonitor implements IMonitor { // 변수명 뒤에 Impl은 그 변수를 구현하고 있구나라고 알 수 있다. (관례)
	                                                                                      // 추상메소드인 abstract가 붙어서 객체를 만들 수 없음
	                                                                                      // AbstractIMonitor로 바뀐이유는 F2를 눌러 추상메소드로 바꾸게 해줌.

	@Override
	public void powerOn() { // { 뒤에는 구현한 것
		System.out.println("전원을 킵니다!");
	
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다!");

	}

	@Override
	public abstract void brightUp(); // 추상메소드를 붙여 구현을 못하게 됨.
	

	@Override
	public abstract void brightDown(); // 추상메소드를 붙여 구현을 못하게 됨.
	

}
