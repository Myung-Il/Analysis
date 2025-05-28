package edu.mnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MNU
 */
public class MemberDAO {
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet resultSet = null;
    
    public void connect() {
        String dbDriver, dbUrl, dbUser, dbPassword;

        dbDriver = "com.mysql.cj.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/mokpo";
        dbUser = "mokpo";
        dbPassword = "mokpo1234";
        
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                        
            System.out.println("sss");
        } catch (ClassNotFoundException ex) { System.out.println("fff1");
        } catch (SQLException ex) {           System.out.println("fff2");
        }
    }
    
    public boolean insert(String id, String password, String name) throws SQLException{
        String sql;
        boolean result = false;
        int dbresult;
        
        connect();
        
        sql = "INSERT INTO `member` (id, password, `name`) VALUES (?, ?, ?);";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, password);
        pstmt.setString(3, name);
        
        dbresult = pstmt.executeUpdate();
        close();
        
        if(dbresult != 0){result = true;}
        return result;
    }
    
    public boolean search(String id, String password) throws SQLException{
        String sql;
        boolean result = false;
        
        connect();
        
        sql = "SELECT * FROM member WHERE id=? AND password=?;";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, password);
        resultSet = pstmt.executeQuery();
        
        
        if(resultSet.next()){result = true;}
        close();
        return result;
    }
    
    void close() throws SQLException {
        if (resultSet != null && !resultSet.isClosed()) resultSet.close();
        if (pstmt != null && !pstmt.isClosed()) pstmt.close();
        if (con != null && !con.isClosed()) con.close();
    }
}
