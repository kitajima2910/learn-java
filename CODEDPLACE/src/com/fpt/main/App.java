/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.services.EmployeeService;
import com.fpt.utils.Menu;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String path = "EMPLOYEE.txt";
                
        Menu.show();
        while(true) {
            System.out.print("Options[1-6]: ");
            switch(s.nextLine()) {
                case "1":
                    EmployeeService.addRecord(path, s);
                    break;
                case "2":
                    EmployeeService.viewAllRecord(path);
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Check again your options...");
                    break;
            }
        }
        
    }
    
}
