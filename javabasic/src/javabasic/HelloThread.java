package javabasic;

public class HelloThread extends Thread { // 2. Thread를 상속받아서 구현하는 방법
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println("Hello");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		
	}

}
