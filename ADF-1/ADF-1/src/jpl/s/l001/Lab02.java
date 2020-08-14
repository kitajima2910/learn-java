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
public class Lab02 {
    
    public static void main(String[] args) {
        System.out.println("First program");
        System.out.println("Enter your fullname:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        
        System.out.println("Your name is: " + userName);
    }
    
}
