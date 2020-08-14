/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L006;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lan-T
 */
public class App {
    
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_t11910m3?useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        
        try {
            Class.forName(JDBC_DRIVER);
            
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            
            System.out.println("Creating statment...");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", Fullname: " + rs.getString("fullName"));
                System.out.println(", Phone: " + rs.getString("phone"));
            }
            
            rs.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(stmt != null) {
                    stmt.close();
                }
                
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
