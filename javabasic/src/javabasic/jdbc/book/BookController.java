package javabasic.jdbc.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javabasic.jdbc.ConnectionUtil;

public class BookController {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public static final int CONTINUE = 1;
	public static final int BREAK = 0;

	   public BookController() {
	      conn = ConnectionUtil.getConnection();
	   }

	   public void consoleToDatabase() {
	           Scanner scanner = new Scanner(System.in);
	               int flag = CONTINUE;
	               System.out.println("********** 도서 정보 입력 **********");
	               while (true) {
	                   if (flag == CONTINUE) {
	                       System.out.print("==도서 번호 입력 : ");
	                       int bid = scanner.nextInt();
	                       scanner.nextLine(); 
	                       System.out.print("==책 이름 입력 : ");
	                       String btitle = scanner.nextLine();
	                       System.out.print("==저자 입력 : ");
	                       String bauthor = scanner.nextLine();
	                       System.out.print("==출판사 입력 : ");
	                       String bpublisher = scanner.nextLine();
	                       System.out.print("==대여가능여부 입력 : ");
	                       String bavailable = scanner.nextLine();
	                       System.out.println();

	                       String sql = " insert into books values(seq_Books.nextval, ?, ?, ?, ?) ";
	                       try {
	                           pstmt.setInt(1, bid);
	                           pstmt.setString(2, btitle);
	                           pstmt.setString(3, bauthor);
	                           pstmt.setString(4, bpublisher);
	                           pstmt.setString(5, bavailable);
	                           pstmt.executeUpdate();
	                       } catch (SQLException sqle) {
	                           sqle.printStackTrace();
	                       }
	                   } else if (flag == BREAK) {
	                       break;
	                   } else {
	                       System.out.println("다시 입력해주세요 : ");
	                       flag = scanner.nextInt();
	                   }
	                   System.out.println("도서 정보를 더 입력하실건가요? (계속 : 1, 중지 : 0) : ");
	                   flag = scanner.nextInt();
	               }
	           }
	   
		public void BookDao2(BookDao dao) {
			for (int i = 0; i < bid.size(); i++) {
				Books book = new Books(bid.get(i), btitle.get(i), bauthor.get(i), bpublisher.get(i), bavailable.get(i));
				dao.insert(book);
			}
		}

		public static void main(String args[]) {
			BookController controller = new BookController();
			BookDao dao = new BookDao();
			BookView bView = new BookView();
			bView.view(dao.select());
		}
	   
}
