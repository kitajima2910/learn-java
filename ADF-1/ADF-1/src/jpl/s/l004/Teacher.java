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
public abstract class Teacher implements Actionable{
    private String designation;
    private String collegeName;

    public Teacher() {
    }

    public Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public void teach(String content) {
        System.out.println(content);
    }
    
    public void teach(int duration) {
        System.out.println("Teacher has duration is " + duration);
    }
    
    public String translate(String en, String vi) {
        return en + " : " + vi; 
    }
}
