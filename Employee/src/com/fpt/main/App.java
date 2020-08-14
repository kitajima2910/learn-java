/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.services.EmployeeDAL;
import com.fpt.utils.Menu;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EmployeeDAL employeeDAL = new EmployeeDAL();
        Menu.show();
        while(true) {
            System.out.print("Options[1-4]: ");
            switch(s.nextLine()) {
                case "1":
                    employeeDAL.addEmp();
                    break;
                case "2":
                    employeeDAL.searchId(s);
                    break;
                case "3":
                    employeeDAL.writeFile();
                    break;
                case "4":
                    employeeDAL.readFile();
                    return;
            }
        }
    }
}
