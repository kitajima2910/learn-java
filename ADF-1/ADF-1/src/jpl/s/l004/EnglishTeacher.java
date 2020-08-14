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
public class EnglishTeacher extends Teacher {
    
    private String mainSubject;

    public EnglishTeacher() {
    }

    public EnglishTeacher(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public EnglishTeacher(String mainSubject, String designation, String collegeName) {
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
    public void toSchool() {
        System.out.println("English Teacher go to school by walk!");
    }
    
}
