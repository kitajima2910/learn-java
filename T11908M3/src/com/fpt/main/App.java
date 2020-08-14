/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.dto.Student;
import com.fpt.services.StudentService;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class App {

    public static void main(String[] args) {
//        List<Student> students = StudentService.getInstance().findAll();
//        students.forEach(System.out::println);
        List<Student> students = StudentService.getInstance().getAll();
        students.forEach(System.out::println);
        
//        StudentService.getInstance().deleteStudent(5);
        
//        StudentService.getInstance().createStudent(new Student("Pham Xuan Hoai", 25, "0975646422"));
//        StudentService.getInstance().createStudent(new Student("Tran Thi My Lan", 18, ""));

//        Student student = StudentService.getInstance().findById(7);
//        System.out.println(student);

//        StudentService.getInstance().updateStudent(new Student(7, "Tran Thi My Lan", 18, "0363782023"));
    }

}
