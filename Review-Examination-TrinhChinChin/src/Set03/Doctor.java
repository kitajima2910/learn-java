/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set03;

import java.util.Scanner;

/**
 *
 * @author TrinhChinChin
 */
public class Doctor {
    int hourExam;
    String doctorID,name,specialty;
    Scanner sc;
    
    public Doctor(){
        
    }

    public Doctor(int hourExam, String doctorID, String name, String specialty) {
        this.hourExam = hourExam;
        this.doctorID = doctorID;
        this.name = name;
        this.specialty = specialty;
    }
    
    @Override
    public String toString(){
        return "ID: "+doctorID+"\tName: "+name+"\tSpecialty: "+specialty+"\tHourExam: "+hourExam;
    }
    public void display(){
        System.out.println("ID: "+doctorID+"\tName: "+name+"\tSpecialty: "+specialty+"\tHourExam: "+hourExam);
    }
}
