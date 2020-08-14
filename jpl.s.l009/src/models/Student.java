/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utils.IDException;
import utils.PhoneException;
import utils.Validator;

/**
 *
 * @author Lan-T
 */
public class Student {

    private String id;
    private String name;
    private String phone;
    private String gender;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, String phone, String gender, double gpa) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws IDException {
        if (Validator.isStudentID(id)) {
            this.id = id;
        } else {
            throw new IDException("Check ID ... ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws PhoneException {
        if (Validator.isPhone(phone)) {
            this.phone = phone;
        } else {
            throw new PhoneException("Check phone ...");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + getPhone() + ", " + getGender() + ", " + getGpa();
    }

    
}
