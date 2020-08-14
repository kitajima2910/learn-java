/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L006.dao;

import JPL.S.L006.configuration.InitConnection;
import JPL.S.L006.model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class StudentDAO {

    InitConnection initConnection;

    public StudentDAO() {
        initConnection = new InitConnection();
        initConnection.init();
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try {
            String sql = "SELECT * FROM student";
            Statement stmt = initConnection.getConn().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFullName(rs.getString("fullName"));
                student.setAge(rs.getInt("age"));
                student.setPhone(rs.getString("phone"));
                students.add(student);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return students;
    }

    public Student findById(int studentId) {
        Student student = new Student();
        try {
            String sql = "SELECT * FROM student WHERE id = ?";
            PreparedStatement preStmt = initConnection.getConn().prepareStatement(sql);
            preStmt.setInt(1, studentId);
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setFullName(rs.getString("fullName"));
                student.setAge(rs.getInt("age"));
                student.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
        }
        return student;
    }

    public void createStudent(Student s) {
        try {
            String sql = "INSERT INTO student(fullName, age, phone) VALUES(?, ?, ?)";
            PreparedStatement preStmt = initConnection.getConn().prepareStatement(sql);
            preStmt.setString(1, s.getFullName());
            preStmt.setInt(2, s.getAge());
            preStmt.setString(3, s.getPhone());
            preStmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void updateStudent(int studentId, Student newStudent) {

    }

    public void deleteStudent(int studentId) {
        try {
            String sql = "DELETE FROM student WHERE = ?";
            PreparedStatement preStmt = initConnection.getConn().prepareStatement(sql);
            preStmt.setInt(1, studentId);
            preStmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
