package javabasic.oop;

class Human {            // 그 패키지 안에서만 쓸거면 (default)가 맞다, 무작정 public X
	
	private String name;
	private int age;
	
	Human(String name, int age){ // Human 앞에는 (default)가 생략되어 있음
		this.name = name;
		this.age = age;
	}

	public String getName() { // getter/setter는 Source - Generate Getter and Setter를 누르고 generate를 눌러주면 자동으로 코드 짜짐
		return name;              // Ctrl + Shift + F 하면 줄 맞춰줌
	}									 // private을 안 쓰면 이 일을 안 해도 되지만 이 일을 하는 이유는 정보은닉(캡슐화)을 위해 사용

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// getter (get + 변수명(대문자 시작))
//	public String getName() { // 직접 접근을 못하고 getter 메소드를 통해 접근 가능하게 함
//		return name;
//	}
	
	// setter (set + 변수명(대문자 시작))
//	public void setName(String name) { // setter는 호출한 상태에서 데이터를 갖고오는 방법
//		this.name = name;
//	}
	
	// age getter/setter 만들어 보기
	
	// getter
//	public int getAge() {
//		return age; // this.age도 가능 (this를 생략한 것)
//	}
	
	// setter
//	public void setAge(int name) {
//		this.age = age;
//	}
	
	

}
