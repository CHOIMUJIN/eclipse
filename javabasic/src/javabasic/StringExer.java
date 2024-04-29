package javabasic;

public class StringExer {

	public static void main(String[] args) {

		// String 객체 생성
		
		// literal(리터럴 = 코드에 씌여있는 값) 방식
		String str1 = "안녕하세요"; // 이 코드의 리터럴은 "안녕하세요"이다.
		
		// constructor(생성자) 방식
		char[] charArray = {'안', '녕', '하', '세', '요'};
		String str2 = new String(charArray);
		
		System.out.println(str1);
		System.out.println(str2);
		
		// 문자열의 인덱스(index)/길이(length)
		// 인덱스 = 0 ~ length-1
		// method = 괄호 안, 기능
		String str3 = "Hello Java"; // index 0~9, length 10
		System.out.println(str3.charAt(0)); // H
		System.out.println(str3.charAt(5)); // 공백문자
		System.out.println(str3.length()); // 10
		
		// 반복문을 사용해서 문자열의 문자 추출
		// 성능이 좋은 코드를 위해서 동일한 결과를 내는 메소드는 한 번만 수행해서 변수에
		// 값을 담아두고 변수를 사용하는 것이 반복적으로 메소드를 호출하지 않는 좋은 코드 
		int leng = str3.length(); 
		for (int i=0; i<leng; i++) {
			System.out.println(str3.charAt(i));
		}
		
		// 한 번만 사용되는 변수는 생성하지 않는 것이 좋은 코드
		// String str4 = "Hi There"; -> 한 번만 쓸 거라 변수를 굳이 만들지 않음.
		System.out.println("Hi There");
		
		// for : 구문을 사용해서 배열의 요소(element)들을 출력
		for (char ch : charArray) {
			System.out.println(ch);
		}
		
		// 변수의 생성 단계
		
		// 선언 (Declaration) : 변수의 타입을 지정 (메모리의 크기를 지정)
		int i;
		// i는 main 메소드 내에서 선언된 지역변수이므로 main메소드 밖에서는 사용할 수 없다.
		// i는 main 메소드의 지역변수이므로 초기화 후에만 사용할 수 있다.
		// System.out.println("선언 후 : "+i);
		
		// 초기화 (Initialization) : 선언 후 변수의 값을 처음 할당(대입, 저장)
		i = 100;
		System.out.println("초기화 후 : "+i);
		
		// 대입 (=할당, Assignment) : 초기화한 후 변수에 값을 저장
		i = 200;
		System.out.println("대입 후 :"+i);
		
		// 문자열 조작
		String str5 = "안";
		String str6 = "녕";
		String str7 = "하";
		String str8 = "세";
		String str9 = "요";
		System.out.println(str5 + str6 + str7 + str8 + str9);
		
		// 문자열은 불변이므로 문자열에 접합연산(+)을 많이하면 불필요한
		// 문자열들이 메모리에 생성된다.
		// StringBuffer 또는 StringBuilder를 사용해서 문자열 조작작업을
		// 버퍼상에서 진행하고 최종적으로 문자열을 한 번만 생성한다.
		StringBuilder sb = new StringBuilder();
		sb.append("안");
		sb.append("녕");
		sb.append("하");
		sb.append("세");
		sb.append("요");
		System.out.println(sb.toString()); // -> to는 변환하라는 것, toString은 String으로 변환하라는 뜻
		
		// String 주요 메소드
		String str10 = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str10.charAt(5)); // 백
		System.out.println(str10.contains("백두산")); // 괄호 속을 포함하고 있느냐, true
		System.out.println(str10.endsWith("하느님이")); // 괄호 속의 문자열로 끝나냐, false
		System.out.println(str10.getBytes()); // 배열객체 주소
			byte[] byteArray = str10.getBytes();
			for (byte b : byteArray) {
				System.out.println((char)b);
			}
		System.out.println(str10.hashCode()); // 문자열 코드의 참조값
		System.out.println("동해물과 백두산이 마르고 닳도록".hashCode());
		System.out.println(str10.indexOf("산")); // 괄호 안의 인덱스를 추출, 7
		System.out.println(str10.isEmpty()); // 괄호 속의 문자가 있느냐, false
		System.out.println(str10.lastIndexOf("도")); // 맨 마지막에 괄호 안을 찍는 것, 15
		System.out.println(str10.length()); // 글자 수, 17
		System.out.println(str10.replace("백두산", "한라산")); // 앞에 있는 것을 뒤에 것으로 하나만 대체해줌
		System.out.println(str10.replaceAll(" ", "-")); // 앞에 있는 것을 뒤에 것으로 전부 대체해줌
		String[] strSplit = str10.split(" ");
		for (String str : strSplit) {
			System.out.println(str);
		}
		String str11 = "       헬로우      ";
		System.out.println(str11.trim()); // 앞 뒤의 공백 문자를 모두 제거해줌
		
		
		String exerStr = "  Time is a kind friend, he will make us old 010/1234/5678  ";
		// 실습 1) exerStr 문자열의 양쪽 공백을 제거
		System.out.println(exerStr.trim());
		
		// 실습 2) Time을 Gold로 변경
		System.out.println(exerStr.replace("Time", "Gold"));
		
		// 실습 3) 전화번호를 010-1234-5678로 변경해서 전화번호만 출력
		// 1. 전화번호 변경
		System.out.println(exerStr.replace("/", "-"));
		// 2. 전화번호 문자열 추출
		System.out.println(exerStr.substring(exerStr.indexOf("0"), exerStr.indexOf("0")+13).replace("/", "-"));
		
		// 실습 4) exerStr 문자열을 공백 기준으로 분리하여 String[]로 변환해 출력
		// 분리 = split
		String[] splittedExerStr = exerStr.split(" ");
		for (String Str : splittedExerStr) {
			System.out.println(exerStr);
		}
		
		// 실습 5) exerStr 문자열을 공백 기준으로 분리하여 문자 수가 3개 이상인 것들만 출력
		// 1. 공백 기준으로 분리
		// 2. 문자 수가 3개 이상인 문자열 출력
		String[] splittedExerStr2 = exerStr.split(" ");
		for (String Str : splittedExerStr2) {
			if (exerStr.length()>=3) {
				System.out.println(exerStr);
			}
		}
		
		// 실습 6) i 문자의 인덱스들을 출력
		// System.out.println(exerStr.indexOf("i")); 가 아닌 indexof from 버전을 써야한다.
		int startIdx = 0;
		for (int j=0; j<5; j++) {
			startIdx = exerStr.indexOf("i", startIdx+1);
			System.out.println(startIdx);
		}
		
		// 실습 7) 전체 문자열을 소문자로 한 번, 대문자로 한 번 변경해서 출력
		System.out.println(exerStr.toLowerCase()); // 소문자로
		System.out.println(exerStr.toUpperCase()); // 대문자로
		
	} //main

} // class


























