 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public class JDBCConnection {

    private static JDBCConnection instance;
    private Connection conn;
    private final String CLASE_NAME = "com.mysql.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/xyz college?zeroDateTimeBehavior=convertToNull";
    private final String USER = "root";
    private final String PASS = "";
    
    private JDBCConnection() {
        try {
            Class.forName(CLASE_NAME);
            conn = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static JDBCConnection getInstance() {
        try {
            if(instance == null || instance.getConn().isClosed()) {
                instance = new JDBCConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    
    
}
