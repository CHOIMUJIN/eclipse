package javabasic;

public class AgeRestrictMain {

	public static void main(String[] args) {

		int age = 15;
		if (age<19) {
			try {
				throw new AgeRestrictException(); // throw = 발생시키다
			} catch (AgeRestrictException are) {
				are.printStackTrace();
			}
		}
		
	} // main

} // class
