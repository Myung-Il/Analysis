/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mokpo.myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MemberDAO {
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet resultSet = null;
    
    public void connect(){
        String dbDriver, dbUrl, dbUser, dbPassword;
        String sql;

        // DB Driver
        dbDriver = "com.mysql.cj.jdbc.Driver";
        // IP:PORT/스키마 
        dbUrl = "jdbc:mysql://localhost:3306/mokpo";
        dbUser = "mokpo";
        dbPassword = "mokpo1234";
      
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("Connect Suceess");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void insert(MemberDTO memberDto_obj) throws SQLException {
        String sql;
        
        // DB 연결
        connect();
        
        sql = "INSERT INTO mokpo.member (id, password, `name`) "
                + "VALUES (?, ?, ?)";

        // SQL문을 이용해 MySQL 서버의 DB에 삽입, 삭제, 갱신, 검색 Statement객체                    
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, memberDto_obj.getId());
        pstmt.setString(2, memberDto_obj.getPassword());
        pstmt.setString(3, memberDto_obj.getName());

        // pstmt를 이용하여 쿼리 전송하기
        pstmt.executeUpdate();

        System.out.println("Success");

        //DB연결 객체 닫기
        close();   

    }

    private void close() throws SQLException {
        // Stamtement 객체와 Connection 객체를 반환
        pstmt.close();
        con.close();
    }
        
}
