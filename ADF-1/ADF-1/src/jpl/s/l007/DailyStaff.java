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
public class DailyStaff extends Employee {

    private double numberOfWorkWay;
    
    public DailyStaff() {
    }

    public DailyStaff(double numberOfWorkWay) {
        this.numberOfWorkWay = numberOfWorkWay;
    }

    public DailyStaff(double numberOfWorkWay, String employeeName, Date dateOfBirth, String address, String companyName) {
        super(employeeName, dateOfBirth, address, companyName);
        this.numberOfWorkWay = numberOfWorkWay;
    }

    public double getNumberOfWorkWay() {
        return numberOfWorkWay;
    }

    public void setNumberOfWorkWay(double numberOfWorkWay) {
        this.numberOfWorkWay = numberOfWorkWay;
    }
    
    @Override
    public double calcSalary() {
        return getNumberOfWorkWay() * 15;
    }

    @Override
    public void inputData(Scanner s) {
        super.inputData(s);
        
        System.out.println("Enter number of workday: ");
        setNumberOfWorkWay(Double.valueOf(s.nextLine()));
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\t" + getNumberOfWorkWay() + "\t" + calcSalary() + "\n");
    }
    
    
    
    
    
}
