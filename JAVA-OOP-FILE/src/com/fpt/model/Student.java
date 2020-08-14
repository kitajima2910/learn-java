/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import com.fpt.utils.CommonException;
import com.fpt.utils.Validation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class Student {

    private String id;
    private String name;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws CommonException {
        if (Validation.checkID(id)) {
            this.id = id;
        } else {
            throw new CommonException("Check id...");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CommonException {
        if (Validation.checkName(name)) {
            this.name = name;
        } else {
            throw new CommonException("Check name...");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws CommonException {
        if (Validation.checkEmail(email)) {
            this.email = email;
        } else {
            throw new CommonException("Check email...");
        }

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws CommonException {
        if (Validation.checkPhone(phone)) {
            this.phone = phone;
        } else {
            throw new CommonException("Check phone...");
        }

    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("111", "Pham Xuan Hoai", "kitajima2910@gmail.com", "123-1234-123"));
        students.add(new Student("333", "Tran Thi My Lan", "lanTTM@gmail.com", "111-2222-333"));
        students.add(new Student("222", "Tran Thi My Lan", "hueHN@gmail.com", "333-4444-111"));

//        students.removeIf(e -> "S111".equals(e.getId()));
//        students.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
//        students.sort((e1, e2) -> -Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId())));
//        students.sort((e1, e2) -> -Double.valueOf(e1.getId()).compareTo(Double.valueOf(e2.getId())));
//        students.sort((e1, e2) -> -Integer.compare(Integer.valueOf(e1.getId()), Integer.valueOf(e2.getId())));
//        students.sort((e1, e2) -> -Double.compare(Double.valueOf(e1.getId()), Double.valueOf(e2.getId())));
        String key = "Tran Thi My Lan";
        List<Student> studensTMP = students.stream().filter(e -> key.equals(e.getId()) || key.equalsIgnoreCase(e.getName()) || key.equalsIgnoreCase(e.getEmail()) || key.equals(e.getPhone())).collect(Collectors.toList());

        System.out.println("Full list: ");
        students.forEach(System.out::println);

        System.out.println("Search list: ");
        studensTMP.forEach(System.out::println);

        try {
            //        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true));
//            studensTMP.forEach(e -> {
//                try {
//                    bw.write(e + "\n");
//                } catch (IOException ex) {
//                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            });
//            bw.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//        }

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String record;
            while((record = br.readLine()) != null) {
                System.out.println(record);
            }
            br.close();
            
            Runtime.getRuntime().exec("notepad.exe students.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
