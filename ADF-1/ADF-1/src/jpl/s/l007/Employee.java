/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public abstract class Employee {
    private String employeeName;
    private Date dateOfBirth;
    private String address;
    private String companyName;

    public Employee() {
    }

    public Employee(String employeeName, Date dateOfBirth, String address, String companyName) {
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.companyName = companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public abstract double calcSalary();
    
    public void inputData(Scanner s) {
        System.out.println("Enter name: ");
        setEmployeeName(s.nextLine());
        
        System.out.println("Enter date of Birth: ");
        setDateOfBirth(new Date(s.nextLine()));
        
        System.out.println("Address: ");
        setAddress(s.nextLine());
        
        System.out.println("Company: ");
        setCompanyName(s.nextLine());
    }
    
    public void display() {
        System.out.print(getEmployeeName() + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(getDateOfBirth()) + "\t" + getAddress() + "\t" + getCompanyName());
    }
}
