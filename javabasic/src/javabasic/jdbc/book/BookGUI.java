package javabasic.jdbc.book;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javabasic.jdbc.ConnectionUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookGUI extends JFrame {

    private Connection conn;
    private PreparedStatement pstmt;
    private DefaultTableModel tableModel;

    private JTextField titleField;
    private JTextField authorField;
    private JTextField publisherField;
    private JTextField priceField;

    public BookGUI() {
        conn = ConnectionUtil.getConnection();

        setTitle("도서 관리 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel titleLabel = new JLabel("책 제목:");
        inputPanel.add(titleLabel);
        titleField = new JTextField();
        inputPanel.add(titleField);

        JLabel authorLabel = new JLabel("저자:");
        inputPanel.add(authorLabel);
        authorField = new JTextField();
        inputPanel.add(authorField);

        JLabel publisherLabel = new JLabel("출판사:");
        inputPanel.add(publisherLabel);
        publisherField = new JTextField();
        inputPanel.add(publisherField);

        JLabel priceLabel = new JLabel("가격:");
        inputPanel.add(priceLabel);
        priceField = new JTextField();
        inputPanel.add(priceField);

        JButton submitButton = new JButton("추가");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = " INSERT INTO books VALUES(seq_Books.nextval, ?, ?, ?, ?) ";
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, titleField.getText());
                    pstmt.setString(2, authorField.getText());
                    pstmt.setString(3, publisherField.getText());
                    pstmt.setInt(4, Integer.parseInt(priceField.getText()));
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(BookGUI.this, "도서가 추가되었습니다.");
                    clearFields();
                    updateTable();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        });
        inputPanel.add(submitButton);

        JButton exitButton = new JButton("나가기");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        inputPanel.add(exitButton);

        tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("책 번호");
        tableModel.addColumn("책 이름");
        tableModel.addColumn("저자");
        tableModel.addColumn("출판사");
        tableModel.addColumn("가격");

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        publisherField.setText("");
        priceField.setText("");
    }

    private void updateTable() {
        try {
            String sql = " SELECT * FROM BOOKS ";
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tableModel.setRowCount(0);
            while (rs.next()) {
                Object[] row = {
                        rs.getInt("BID"),
                        rs.getString("BTITLE"),
                        rs.getString("BAUTHOR"),
                        rs.getString("BPUBLISHER"),
                        rs.getInt("BPRICE")
                };
                tableModel.addRow(row);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookGUI();
            }
        });
    }
}