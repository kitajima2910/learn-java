/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.common;

/**
 *
 * @author Lan-T
 */
public class Constant {
    public static final String STUDENT_CREATE = "INSERT INTO student(fullName, age, phone) VALUES(?, ?, ?)";
    public static final String STUDENT_UPDATE = "UPDATE student SET fullName = ?, age = ?, phone = ? WHERE id = ?";
    public static final String STUDENT_READ = "SELECT * FROM student";
    public static final String STUDENT_READ_ID = "SELECT * FROM student WHERE id = ?";
    public static final String STUDENT_DELETE = "DELETE FROM student WHERE id = ?";
}
