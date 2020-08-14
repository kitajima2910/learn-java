/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author NguyenVuSon
 */
public class DBConnection{
    static Connection conn;
    public static Connection getConnect(String db){
        String account = "sa";
        String password = "sa";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String dbURL = "jdbc:sqlserver://localhost:1433;" +  
                        "databaseName="+db+
                        ";user="+account+
                        ";password="+password+"";

            conn = DriverManager.getConnection(dbURL,account,password);
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}