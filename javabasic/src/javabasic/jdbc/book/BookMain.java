package javabasic.jdbc.book;

public class BookMain {
	
	public static void main(String args[]) {
		
		BookController controller = new BookController();
		controller.consoleToDatabase();
		
		BookDao dao = new BookDao();
		
		BookView bView = new BookView();
		bView.view(dao.select());
	}

} // class