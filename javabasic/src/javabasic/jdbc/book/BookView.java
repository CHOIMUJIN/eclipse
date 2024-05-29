package javabasic.jdbc.book;

import java.util.ArrayList;

public class BookView {
	
	public void view(ArrayList<Books> bookList) {
		for(Books books : bookList) {
			System.out.println("======================================================================================");
			System.out.print("도서 번호 : " + books.getBid() + "\t");
			System.out.print("책 이름 : " + books.getBtitle() + "\t");
			System.out.print("저자명 : " + books.getBauthor() + "\t");
			System.out.print("출판사 : " + books.getBpublisher() + "\t");
			System.out.print("가격 : " + books.getBavailable() + "\t");
			System.out.println("--------------------------------------------------------------------------------------");
		}
	}

}
