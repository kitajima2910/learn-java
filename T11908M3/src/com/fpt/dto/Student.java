/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.dto;

/**
 *
 * @author Lan-T
 */
public class Student {

    private int id;
    private String fullName;
    private int age;
    private String phone;

    public Student() {
    }
    
    public Student(String fullName, int age, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    public Student(int id, String fullName, int age, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", age=" + age + ", phone=" + phone + '}';
    }

}
