package com.fpt.main;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lan-T
 */
public class Student {
    private int studentId;
    private String studentName;
    private String address;
    private String email;

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) throws CommonException {
        if(Validation.checkNotIsEmpty(studentName)) {
            this.studentName = studentName;
        } else {
            throw new CommonException("Check studentName...");
        }
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws CommonException {
        if(Validation.checkNotIsEmpty(address)) {
            this.address = address;
        } else {
            throw new CommonException("Check address...");
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws CommonException {
        if(Validation.checkEmail(email)) {
            this.email = email;
        } else {
            throw new CommonException("Check email...");
        }
        
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + ", email=" + email + '}';
    }
    
    public Student InputStudent(Scanner s) {
        Student student = new Student();
        
        do {
            System.out.print("Enter name: ");
            try {
                student.setStudentName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter address: ");
            try {
                student.setAddress(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter email: ");
            try {
                student.setEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        return student;
    }
    
}
