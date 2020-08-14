/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l004;

/**
 *
 * @author Lan-T
 */
public class MathTeacher extends Teacher {
    private String mainSubject;

    public MathTeacher() {
    }

    public MathTeacher(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public MathTeacher(String mainSubject, String designation, String collegeName) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    
    @Override
    public void teach(String content) {
        System.out.println(content);
    }

    @Override
    public String toString() {
        return "mainSubject: " + this.getMainSubject() + " - designation: " + super.getDesignation() + " - collegeName: " + super.getCollegeName();
    }

    @Override
    public void toSchool() {
        System.out.println("Math Teacher go to school by car!");
    }
    
    public int sum(int one, int two) {
        return one + two;
    }
    
    
}
