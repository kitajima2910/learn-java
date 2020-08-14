/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import java.util.Map;
import utils.IDException;
import utils.Validator;

/**
 *
 * @author Lan-T
 */
public class Course implements Statistical {

    private String id;
    private String title;
    private List<Student> students;
    private double credit;
    private int erollment;

    public Course() {
    }

    public Course(String id, String title, List<Student> students, double credit, int erollment) {
        this.id = id;
        this.title = title;
        this.students = students;
        this.credit = credit;
        this.erollment = erollment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws IDException {
        if (Validator.isCourseID(id)) {
            this.id = id;
        } else {
            throw new IDException("Check id ... ");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getErollment() {
        return erollment;
    }

    public void setErollment(int erollment) {
        this.erollment = erollment;
    }

    @Override
    public Map<String, String> getStatic(List<Student> students) {
        return null;
    }

    public void printInfo() {
        String info = getId() + "\t\t" + getTitle() + "\t\t" + getCredit() + "\t\t" + getStudents();
        System.out.println(info);
    }

}
