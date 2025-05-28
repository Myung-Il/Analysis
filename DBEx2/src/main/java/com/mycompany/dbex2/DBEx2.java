/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dbex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MNU
 */
public class DBEx2 {
    
    public static void main(String[] args) {
        String dbDriver, dbUrl, dbUser, dbPassword;
        String sql;
        PreparedStatement pstmt;

        dbDriver = "com.mysql.cj.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/mokpo";
        dbUser = "mokpo";
        dbPassword = "mokpo1234";
        
        Connection con;
        
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            
            sql = "INSERT INTO `member` (id, password, `name`) VALUES (?, ?, ?);";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "test6");
            pstmt.setString(2, "test6");
            pstmt.setString(3, "test6");
            pstmt.executeUpdate();
            
            System.out.println("sss");
            
            pstmt.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println("fff1");
        } catch (SQLException ex) {
            System.out.println("fff2");
        }
    }
}
