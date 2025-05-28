/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dbex3;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MNU
 */
public class DBEx3 {
    
    public static void main(String[] args) {
        String id, password, name;
        MemberDAO dao;
        
        id = "test9";
        password = "test9";
        name = "test9";
        
        dao = new MemberDAO();
        
        try {
            dao.insert(id, password, name);
        } catch (SQLException ex) {
            Logger.getLogger(DBEx3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
