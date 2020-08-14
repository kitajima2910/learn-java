/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l002;

/**
 *
 * @author Lan-T
 */
public class Teacher {
    private String name;
    private String collegeName;
    private Subject subject;

    public Teacher() {
    }

    public Teacher(String name, String collegeName, Subject subject) {
        this.name = name;
        this.collegeName = collegeName;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    
}
