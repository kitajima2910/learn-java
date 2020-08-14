/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.services;

import com.fpt.model.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Lan-T
 */
public class EmployeeService {

    public static void addRecord(String path, Scanner s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            Employee employee = new Employee().add(s);

            bw.write(employee.getId() + ", " + employee.getName() + ", " + employee.getAge() + ", " + employee.getAddress() + "\n");
            
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void viewAllRecord(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String record;

            System.out.println(" ----------------------------------------------------------- ");
            System.out.printf("|%-10s %-15s %-15s %-15s %-15s\n", "ID", "Name", "Age", "Address", "|");
            System.out.println(" ----------------------------------------------------------- ");
            
            while((record = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(record, ",");
                System.out.printf("|%-10s %-15s %-15s %-15s %-15s\n", st.nextToken().trim(), st.nextToken().trim(), st.nextToken().trim(), st.nextToken().trim(), "|");
            }
            
            System.out.println(" ----------------------------------------------------------- ");
            
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
