/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l007;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Manager extends Employee {

    private double wage;
    private double basicSalary;

    public Manager() {
    }

    public Manager(double wage, double basicSalary) {
        this.wage = wage;
        this.basicSalary = basicSalary;
    }

    public Manager(double wage, double basicSalary, String employeeName, Date dateOfBirth, String address, String companyName) {
        super(employeeName, dateOfBirth, address, companyName);
        this.wage = wage;
        this.basicSalary = basicSalary;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    
    
    @Override
    public double calcSalary() {
        return getWage() * getBasicSalary();
    }

    @Override
    public void inputData(Scanner s) {
        super.inputData(s);
        
        System.out.println("Enter wage: ");
        setWage(Double.valueOf(s.nextLine()));
        
        System.out.println("Enter basic salary: ");
        setBasicSalary(Double.valueOf(s.nextLine()));
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\t" + getWage() + "\t" + getBasicSalary() + "\t" + calcSalary() + "\n");
    }
    
    
    
}
