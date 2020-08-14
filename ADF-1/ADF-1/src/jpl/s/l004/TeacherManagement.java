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
public class TeacherManagement {
    public static void main(String[] args) {
        MathTeacher mathTeacher1 = new MathTeacher("Teacher", "FU", "Math");
        MathTeacher mathTeacher2 = new MathTeacher("Teacher", "FTIT", "Math");
        EnglishTeacher englishTeacher = new EnglishTeacher("Teacher", "PTIT", "English");
        
        Teacher[] teachers = {mathTeacher1, mathTeacher2, englishTeacher};
        
        for(int i = 0; i < teachers.length; i++) {
            System.out.printf("----- TEACHER (%d) -----\n", i + 1);
            System.out.println("Colleage name: " + teachers[i].getCollegeName());
            System.out.println("Designation:: " + teachers[i].getDesignation());
            
            if(teachers[i] instanceof MathTeacher) {
                
                ((MathTeacher)teachers[i]).toString();
                ((MathTeacher)teachers[i]).toSchool();
                ((MathTeacher)teachers[i]).teach("Main Subject: " + ((MathTeacher)teachers[i]).getMainSubject());
                System.out.println("Content: " + ((MathTeacher)teachers[i]).sum(30, 50));
                ((MathTeacher)teachers[i]).teach(50);
                
            } else {
                
                ((EnglishTeacher)teachers[i]).toSchool();
                ((EnglishTeacher)teachers[i]).teach("Main Subject: " + ((EnglishTeacher)teachers[i]).getMainSubject());
                System.out.println("Content: " +  ((EnglishTeacher)teachers[i]).translate("Hello", "Xin chào"));
                ((EnglishTeacher)teachers[i]).teach(45);
                
            }
        }
    }
}
