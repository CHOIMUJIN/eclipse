package javabasic.oop;

public class Monitor extends Device { // class 만들 때 Superclass에 상위클래스를 넣으면 extends가 자동으로 입력되어 생성됨

	private int xSize; // 화면의 가로넓이, Monitor 클래스에는 Device에 갖고있는 것들도 포함되어 있음(name, price, weight)
	private int ySize; // 화면의 세로넓이

	Monitor() {
	}

	Monitor(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}
	
	// 상속클래스에 공통으로 만든 것을 하위클래스에 적용시킬 때 @Override를 붙인다
	// @Override는 오타 방지용으로도 쓰임
	@Override
	void on() {
		System.out.println("모니터를 켜다!");
	}
	
	@Override
	void off() {
		System.out.println("모니터를 끄다!");
	}

}
