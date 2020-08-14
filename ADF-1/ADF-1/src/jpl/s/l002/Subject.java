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
public class Subject {
    
    protected String mainSubject;

    public Subject() {
    }

    public Subject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    
    public void teach() {
        System.out.println("Teaching math subject:");
    }
    
}
