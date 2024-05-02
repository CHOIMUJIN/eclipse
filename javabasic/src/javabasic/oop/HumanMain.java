package javabasic.oop;

class HumanMain {  // 같은 패키지 안에 있으므로 (default)가 맞다, 무조건 public X

	public static void main(String[] args) { // main은 public이여야 함.

		Human human1 = new Human("홍길동", 80);
		// System.out.println(human1.name);가 에러가 뜨는 이유는 human1.name이 private이므로 직접 접근이 불가능
		System.out.println(human1.getName());
		
		 // human1.name = "강감찬"; // human1.name이 private 이므로 직접 접근이 불가능
		human1.setName("강감찬"); // setter로 변경
		
		human1.setAge(50);
		System.out.println(human1.getAge());
		
		
	} // main

} // class
