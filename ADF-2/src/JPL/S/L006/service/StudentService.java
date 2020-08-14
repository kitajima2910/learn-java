/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L006.service;

import JPL.S.L006.dao.StudentDAO;
import JPL.S.L006.model.Student;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class StudentService {

    StudentDAO studentDAO;
    
    public StudentService() {
        studentDAO = new StudentDAO();
    }
    
    
    public List<Student> findAll() {
        return studentDAO.findAll();
    }
    
    public Student findById(int studentId) {
        return studentDAO.findById(studentId);
    }
    
    
    public void createStudent(Student s) {
        studentDAO.createStudent(s);
    }
    
    public void deleteStudent(int studentId) {
        studentDAO.deleteStudent(studentId);
    }
    
    
}
