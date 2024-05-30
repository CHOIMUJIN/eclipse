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

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public BookDao() {
        conn = ConnectionUtil.getConnection();
    }

    public void insert(Books book) {
        String sql = " INSERT INTO books (btitle, bauthor, bpublisher, bprice) VALUES (?, ?, ?, ?) ";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getBtitle());
            pstmt.setString(2, book.getBauthor());
            pstmt.setString(3, book.getBpublisher());
            pstmt.setInt(4, book.getBprice());
            pstmt.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public ArrayList<Books> select() {
        ArrayList<Books> bookList = new ArrayList<>();
        String sql = " SELECT * FROM books ";
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Books book = new Books(
                    rs.getInt("bid"),
                    rs.getString("btitle"),
                    rs.getString("bauthor"),
                    rs.getString("bpublisher"),
                    rs.getInt("bprice")
                );
                bookList.add(book);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return bookList;
    }
}