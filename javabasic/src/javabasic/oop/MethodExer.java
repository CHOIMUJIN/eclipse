package javabasic.oop;

public class MethodExer {

	public static void main(String[] args) {
		
		MethodExer obj = new MethodExer();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.getMessage());
		obj.hello();
		
		System.out.println(MethodExer.getMessage());
		
	} // main
	
	static String getMessage() {
		return "message";
	}
	
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	void hello() {                                       // 모든 메소드는 리턴을 한다
		System.out.println("Hello");
	}

} // class
