/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.db_ex3;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DB_Ex3 {

    public static void main(String[] args) {
        String id, password, name;
        
        //입력 받기
        id = "test13";
        password = "test13";
        name = "test13";
        
        // 데이터 베이스에 삽입해야 함
       MemberDAO memberDAO_obj;       
       //객체 생성
       memberDAO_obj = new MemberDAO();
       
        try {
            // 객체에게 메시지 보내기
            // memberDAO_obj.insert();
             //MemberDTO객체 생성
            MemberDTO memberDto_obj = new MemberDTO();
            // MemberDTO객체 속성값 설정
            memberDto_obj.setId(id);
            memberDto_obj.setPassword(password);
            memberDto_obj.setName(name);
            //
            memberDAO_obj.insert(memberDto_obj);
            // 객체에게 메시지 보낼 때 : 데이터를 전달해야 함
            
          //  memberDAO_obj.insert(id, password, name);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Ex3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
