/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mokpo.my_project_fin;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 이 클래스에 대한 설명을 합니다.
 * MySQL과 연결되어 다양한 상호작용을 하는 클래스입니다.
 * @author 김태랑
 * @since 1.2
 */
public class MemberDAO {
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet resultSet = null;
    
    /**
     * connect는 mysql과 연결을 해줍니다.
     */
    public void connect(){
        String dbDriver, dbUrl, dbUser, dbPassword;

        dbDriver = "com.mysql.cj.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/mokpo";
        dbUser = "mokpo";
        dbPassword = "mokpo1234";
      
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("Connect Suceess");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect Fail");
        }        
    }
    
    /**
     * insert는 MemberJoin에 입력된 정보를 가져와 mysql에 저장합니다.
     * @param memberDto_obj
     * @throws SQLException
     */
    public void insert(MemberDTO memberDto_obj) throws SQLException {
        String sql;
        
        connect();
        sql = "INSERT INTO mokpo.member (id, password, `name`) "
                + "VALUES (?, ?, ?)";

                 
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, memberDto_obj.getId());
        pstmt.setString(2, memberDto_obj.getPassword());
        pstmt.setString(3, memberDto_obj.getName());

        pstmt.executeUpdate();
        close();   
    }
	
    /**
     * search는 MemberLogin에 입련된 정보가 실제로 있는지 mysql에 접근하여 확인하고 정보를 반환하는 함수 입니다.
     */
    public void search() {
    }
    
    /**
     * search는 MemberLogin에 입련된 정보가 실제로 있는지 mysql에 접근하여 확인하고 정보를 반환하는 함수 입니다.
     * @param id
     * @param password
     * @return
     * @throws SQLException 
     */
    public boolean search(String id, String password) throws SQLException{
        String sql;
        boolean result = false;
        
        connect();
        
        sql = "SELECT * FROM member WHERE id=? AND password=?;";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, password);
        resultSet = pstmt.executeQuery();
        
        
        if(resultSet.next()){
            result = true;
            MemberDTO dto = new MemberDTO();
            dto.setId(resultSet.getString("id"));
            dto.setPassword(resultSet.getString("password"));
            dto.setName(resultSet.getString("name"));
        }
        close();
        return result;
    }
    
    /**
     * close는 mysql과의 연결을 안정적으로 해제시켜주는 역할을 합니다.
     * @throws SQLException 
     */
    void close() throws SQLException {
        if (resultSet != null && !resultSet.isClosed()) resultSet.close();
        if (pstmt != null && !pstmt.isClosed()) pstmt.close();
        if (con != null && !con.isClosed()) con.close();
    }
}
