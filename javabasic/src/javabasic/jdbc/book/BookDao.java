package javabasic.jdbc.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javabasic.jdbc.ConnectionUtil;
import javabasic.jdbc.guest.Guest;

public class BookDao {
		
		ArrayList<Books> bookList = new ArrayList();
		
		public void insert(Books book) {
			bookList.add(book);
		}
		
		public  ArrayList<Books> select() {
			return bookList;
		}
		
} // class