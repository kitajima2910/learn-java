/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l001;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Lab03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("First program");
        System.out.println("Enter your StudentId:");
        student.setId(scanner.nextLine());
        System.out.println("Enter your FirstName:");
        student.setFirstName(scanner.nextLine());
        System.out.println("Enter your LastName:");
        student.setLastName(scanner.nextLine());
        System.out.println("Enter your age:");
        student.setAge(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("StudentId: " + student.getId());
        System.out.println("Firstname: " + student.getFirstName());
        System.out.println("Lastname: " + student.getLastName());
        System.out.println("Student Age: " + student.getAge());
    }
    
}
