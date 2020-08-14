/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class EmployeeList {

    private List<Employee> employeeList;
    private String path = "employees.txt";

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public void addNew(Employee employee) {
        employeeList.add(employee);
    }

    public void display(String id) {
        List<Employee> employeeListTMP = employeeList.stream().filter(e -> id.equalsIgnoreCase(e.getId())).collect(Collectors.toList());
        if (employeeListTMP.isEmpty()) {
            System.out.println("Not found!!!");
        } else {
            employeeListTMP.forEach(System.out::println);
        }
    }

    public void save() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            employeeList.forEach(e -> {
                try {
                    bw.write(e + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void open() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException ex) {
            Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
