package javabasic;

public class ThreadExer1 {
	
	public static void main(String[] args) {
		
		Thread npt = new Thread(new NumberPrintThread()); // Thread 생성자에 Runnable을 구현한 구현체를 넣어준다.
		Thread cpt = new Thread(new CharPrintThread());
		
		npt.start();
		cpt.start();
		
	} // main

} // class
