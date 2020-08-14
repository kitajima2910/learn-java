/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Menu.show();
        EmployeeList employeeList = new EmployeeList();
        
        while(true) {
            System.out.print("Options[1-4]: ");
            switch(s.nextLine()) {
                case "1":
                    employeeList.addNew(new Employee().add(s));
                    break;
                case "2":
                    System.out.print("Enter id: ");
                    String id = s.nextLine();
                    employeeList.display(id);
                    break;
                case "3":
                    employeeList.save();
                    System.out.println("Successfuly...");
                    break;
                case "4":
                    System.out.println("Bye!...");
                    employeeList.open();
                    return;
                default:
                    System.out.println("Check again your options");
                    break;
            }
        }
    }
    
}
