/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


import java.util.Scanner;

/**
 *
 * @author TrinhChinChin
 */
public class Student {
    int stuID,age;
    String firstName,lastName,strID,strAge;
    Scanner sc;
    
    public Student(){
        
    }

    public Student(int stuID, int age, String firstName, String lastName) {
        this.stuID = stuID;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String toString(){
        return "ID: "+stuID+"\tFirst Name: "+firstName+"\tLast Name: "+lastName+"\tAge: "+age;
    }
}
