/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.services;

import com.fpt.dao.StudentDAO;
import com.fpt.dto.Student;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class StudentService {

    private static StudentService instance;
    private final StudentDAO studentDAO;
    
    public StudentService() {
        studentDAO = new StudentDAO();
    }

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }
    
    public List<Student> findAll() {
        return getStudentDAO().findAll();
    }
    
    public void deleteStudent(int id) {
        getStudentDAO().deleteStudent(id);
    }
    
    public void createStudent(Student student) {
        getStudentDAO().createStudent(student);
    }
    
    public Student findById(int id) {
        return getStudentDAO().findById(id);
    }
    
    public void updateStudent(Student student) {
        getStudentDAO().updateStudent(student);
    }
    
    public List<Student> getAll() {
        return getStudentDAO().getAll();
    }
}
