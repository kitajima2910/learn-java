/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        ProductionStaff productionStaff = new ProductionStaff();
        DailyStaff dailyStaff = new DailyStaff();
        Manager manager = new Manager();
        
        System.out.println("Employee 1: ");
        productionStaff.inputData(new Scanner(System.in));
        
        System.out.println("Employee 2: ");
        dailyStaff.inputData(new Scanner(System.in));
        
        System.out.println("Employee 3: ");
        manager.inputData(new Scanner(System.in));
        
        employees.add(productionStaff);
        employees.add(dailyStaff);
        employees.add(manager);
        
        employees.forEach(e -> e.display());
        
    }
}
