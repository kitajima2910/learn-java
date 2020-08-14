/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.dao;

import com.fpt.common.Constant;
import com.fpt.common.JDBCConnection;
import com.fpt.dto.Student;
import com.fpt.interfaces.IDAO;
import com.fpt.interfaces.IStudent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Lan-T
 */
public class StudentDAO implements IStudent<Student>, IDAO<Student> {
    
    public StudentDAO() {
    }

    @Override
    public void createStudent(Student student) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConnection().prepareStatement(Constant.STUDENT_CREATE);
            ps.setString(1, student.getFullName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getPhone());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConnection().prepareStatement(Constant.STUDENT_UPDATE);
            ps.setString(1, student.getFullName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getPhone());
            ps.setInt(4, student.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConnection().prepareStatement(Constant.STUDENT_READ);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFullName(rs.getString("fullName"));
                student.setAge(rs.getInt("age"));
                student.setPhone(rs.getString("phone"));
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public Student findById(int id) {
        Student student = new Student();
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConnection().prepareStatement(Constant.STUDENT_READ_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                student.setId(rs.getInt("id"));
                student.setFullName(rs.getString("fullName"));
                student.setAge(rs.getInt("age"));
                student.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConnection().prepareStatement(Constant.STUDENT_DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void save(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return findAll();
    }

    @Override
    public Student get(int id) {
        return findById(id);
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
