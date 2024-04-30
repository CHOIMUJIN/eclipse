package javabasic.oop;

public class Cellphone {

	static int objCount = 0; // static은 초기화 해주는 것이 좋다.

	String nfName; // ""로 자동 초기화
	String phName; // ""로 자동 초기화
	String color; // ""로 자동 초기화
	int series; // 0으로 자동 초기화
	
	static int getObjCount() {
		return objCount;
	}
	
	void message() {
		System.out.println(this.phName + " 메세지 중!");
	}
	void call() {
		System.out.println(this.phName + " 통화 중!");
	}
	void mail() {
		System.out.println(this.phName + " 메일 중!");
	}
	void game() {
		System.out.println(this.phName + " 게임 중!");
	}
	
}

	

