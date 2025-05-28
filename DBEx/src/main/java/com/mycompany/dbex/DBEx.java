/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MNU
 */
public class DBEx {
    
    public static void main(String[] args) {
        String dbDriver, dbUrl, dbUser, dbPassword;
        String sql;
        Statement stmt;

        dbDriver = "com.mysql.cj.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/mokpo";
        dbUser = "mokpo";
        dbPassword = "mokpo1234";
        
        Connection con;
        
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            
            sql = "INSERT INTO `member` (id, password, `name`) VALUES ('test4', 'test4', 'test4');";
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            
            System.out.println("sss");
            
            stmt.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println("fff1");
        } catch (SQLException ex) {
            System.out.println("fff2");
        }
    }
}
