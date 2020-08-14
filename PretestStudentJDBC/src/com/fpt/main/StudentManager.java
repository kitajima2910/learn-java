/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class StudentManager {
    
    public void createStudent(Scanner s) {
        Student student = new Student().InputStudent(s);
        try {
            String sql = "INSERT INTO `student`(`StudentName`, `Address`, `Email`) VALUES (?, ?, ?)";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(sql);
            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getAddress());
            ps.setString(3, student.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void showAll() {
        try {
            String sql = "SELECT * FROM `student` WHERE 1";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.printf("%-5d %-15s %-15s %-15s\n", rs.getInt("StudentID"), rs.getString("StudentName"), rs.getString("Address"), rs.getString("Email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean searchId(int id) {
        try {
            String sql = "SELECT * FROM `student` WHERE `StudentID` = ?";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public void removeStudent(int id) {
        try {
            String sql = "DELETE FROM `student` WHERE `StudentID` = ?";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
