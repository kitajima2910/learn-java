/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lan-T
 */
public class JDBCConnection {

    private static JDBCConnection instance;
    private Connection connection;
    private final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/db_t11910m3?zeroDateTimeBehavior=convertToNull";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    private JDBCConnection() {
        try {
            Class.forName(DRIVER_CLASS);
            this.connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static JDBCConnection getInstance() {
        try {
            if(instance == null || instance.getConnection().isClosed()) {
                instance = new JDBCConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance;
    }
    
}
