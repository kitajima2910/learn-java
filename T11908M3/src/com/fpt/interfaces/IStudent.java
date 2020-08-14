/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.interfaces;

import java.util.List;

/**
 *
 * @author Lan-T
 */
public interface IStudent<Student> {

    void createStudent(Student student);

    void updateStudent(Student student);

    List<Student> findAll();

    Student findById(int id);

    void deleteStudent(int id);
}
