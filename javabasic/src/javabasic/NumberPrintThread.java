package javabasic;

public class NumberPrintThread implements Runnable { // 1) Runnable 인터페이스를 구현하는 방법, 클래스 명 뒤에 Thread가 오면 Thread (관레)
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println((int)(Math.random()*10) + 1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
