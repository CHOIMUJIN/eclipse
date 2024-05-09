package javabasic;

public class LambdaExer {

	public static void main(String[] args) {

		printStr("Hello");
//		str -> System.out.println(str) // 1, 파라미터가 한 개 있으면 괄호 생략 가능
		
		System.out.println(add(10, 20));
//		(x, y) -> x + y                     // 2, 파라미터가 두 개 있으면 괄호 써주기
		
		printStr2("Hi", "There");
//		(str1, str2) -> {                   // 3, 실행값이 두 개라면 중괄호를 써서 써주기
//			System.out.println(str1);
//			System.out.println(str2);
//		}
		
	} // main
	
	static void printStr(String str) {                     // 1
		System.out.println(str);
	}
	
	static int add(int x, int y) {                           // 2
		return x + y;
	}
	
	static void printStr2(String str1, String str2) { // 3
		System.out.println(str1);
		System.out.println(str2);
	}

} // class
