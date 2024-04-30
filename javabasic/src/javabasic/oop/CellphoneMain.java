package javabasic.oop;

public class CellphoneMain {

	public static void main(String[] args) {

		// Cellphone 타입객체 3개 생성
		Cellphone cellphone1 = new Cellphone();
		Cellphone cellphone2 = new Cellphone();
		
		// 객체 데이터 설정
		cellphone1.nfName = "애플";
		cellphone1.phName = "아이폰 se";
		cellphone1.color = "검정색";
		cellphone1.series = 2;
		
		cellphone1.objCount = 1;
		
		cellphone2.nfName = "삼성";
		cellphone2.phName = "갤럭시 S";
		cellphone2.color = "흰색";
		cellphone2.series = 24;
		
		cellphone2.objCount = 2;
		
		// 객체 데이터 출력
		System.out.println("제 핸드폰은 " + cellphone1.nfName 
				+ " 회사의 " + cellphone1.phName + cellphone1.series + " " + cellphone1.color + "입니다.");
		System.out.println("제 핸드폰은 " + cellphone2.nfName 
				+ " 회사의 " + cellphone2.phName + cellphone2.series + " " + cellphone2.color + "입니다.");
		
		// 객체 메소드 호출
		cellphone1.message();
		cellphone2.message();
		cellphone1.call();
		cellphone2.call();
		cellphone1.mail();
		cellphone2.mail();
		cellphone1.game();
		cellphone2.game();
		
		// 생성된 객체 수
			System.out.println("총 " + Cellphone.objCount + "개의 객체 생성됨!");
			System.out.println("총 " + Cellphone.getObjCount() + "개의 객체 생성됨!");
		
	} // main

} // class
