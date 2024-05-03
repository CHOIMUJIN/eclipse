package javabasic.oop;

public interface IMonitor { // 변수 앞에 I가 붙으면 interface 라는 걸 알 수 있다. (관례)
	
	public static final int INCH_TWENTY_FOUR = 24;
	public static final int INCH_THIRTY = 30;
	public static final int INCH_FORTY = 40;
	
	public abstract void powerOn(); // 세미콜론으로 끝, {} (X) -> 메소드 시그니쳐
	public abstract void powerOff();
	public abstract void brightUp();
	public abstract void brightDown();

}
