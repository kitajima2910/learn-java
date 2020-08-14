/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.services;

import com.fpt.model.Student;
import com.fpt.utils.CommonException;
import com.fpt.utils.Validation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public StudentManager() {
        students.add(new Student("S111", "Pham Xuan Hoai", "kitajima2910@gmail.com", "123-1234-123"));
        students.add(new Student("S222", "Tran Thi My Lan", "lanTTM@gmail.com", "111-2222-333"));
        students.add(new Student("S333", "Huynh Ngoc Hue", "hueHN@gmail.com", "333-4444-111"));
    }
    

    public void add(Scanner s) {
        Student student = new Student();

        do {
            System.out.print("Enter id: ");
            try {
                student.setId(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(students.stream().filter(e -> student.getId().equals(e.getId())).findAny().isPresent()) {
                System.out.println("Had id...");
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter name: ");
            try {
                student.setName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter email: ");
            try {
                student.setEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter phone: ");
            try {
                student.setPhone(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        students.add(student);
    }

    public void showAll() {
        students.forEach(System.out::println);
    }

    public void deleteID(String id) {
        if(!students.stream().filter(e -> id.equals(e.getId())).findAny().isPresent()) {
            System.out.println("Not found!!!");
        } else {
            students.remove(id);
        }
        
    }
}
