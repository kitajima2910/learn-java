/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.services;

import com.fpt.model.Employee;
import com.fpt.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class EmployeeDAL {
    
    List<Employee> employees = new ArrayList<>();
    private final String path = "Employee.txt";
    
    public EmployeeDAL() {
    }
    
    public void addEmp() {
        employees.add(new Employee());
    }
    
    public void searchId(Scanner s) {
        System.out.print("Enter empId: ");
        String empId = s.nextLine();
        List<Employee> employeesTmp = employees.stream().filter(e -> empId.equals(e.getEmpId())).collect(Collectors.toList());
        if(employeesTmp.isEmpty()) {
            System.out.println("Not found!!");
        } else {
            employeesTmp.forEach(System.out::println);
        }
    }
    
    public void writeFile() {
        new FileUtils().writeFile(employees, path);
    }
    
    public void readFile() {
        new FileUtils().openFile(path);
    }
}
