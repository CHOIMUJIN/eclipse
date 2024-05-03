package javabasic.oop.art;

public class ArtMain {

	public static void main(String[] args) {
		
		IArt drawing = new Drawing("절규");
		IArt music = new Music("해줄 수 없는 일");
		IArt movie = new Movie("파묘");
		
		System.out.println();
		

	} // main

} // class
