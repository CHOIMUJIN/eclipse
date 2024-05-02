package javabasic.oop;

public class Device { // class 앞에 final을 붙이면 상속 불가! (에러 뜸)

	private String name; // 5~42줄 = 데이터 클래스
	private int price;
	private int weight;

	Device() {
	}

	Device(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 메소드 클래스, 생성자 밑에 만들기, 상위클래스에다가만 적어도 하위클래스들은 자동적으로 적용
	// 상위클래스는 공통의 역할을 가짐
	// Device는 상위클래스이기 때문에 @Override를 붙이지 않는다.
	void on() { // void(메소드) 앞에 final을 붙이면 오버라이딩 불가! (에러 뜸)
		System.out.println("켜다!");
	}
	
	void off() {
		System.out.println("끄다!");
	}
	
}
