/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainJDBC;

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
    private final String CLASS_NAME = "com.mysql.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/cellshop?zeroDateTimeBehavior=convertToNull";
    private final String USER = "root";
    private final String PASSWORD = "";

    private JDBCConnection() {
        try {
            Class.forName(CLASS_NAME);
            conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static JDBCConnection getInstance() {
        try {
            if(instance == null || instance.getConn().isClosed()) {
                instance = new JDBCConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    
    
}
