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
public class ProductionStaff extends Employee {
    
    private double amountOfProduct;

    public ProductionStaff() {
    }

    public ProductionStaff(double amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public ProductionStaff(double amountOfProduct, String employeeName, Date dateOfBirth, String address, String companyName) {
        super(employeeName, dateOfBirth, address, companyName);
        this.amountOfProduct = amountOfProduct;
    }

    public double getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(double amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }
    
    
    
    @Override
    public double calcSalary() {
        return getAmountOfProduct() * 20;
    }

    @Override
    public void inputData(Scanner s) {
        super.inputData(s);
        
        System.out.println("Enter number of product: ");
        setAmountOfProduct(Double.valueOf(s.nextLine()));
    }

    @Override
    public void display() {
        super.display();
        
        System.out.print("\t" + getAmountOfProduct() + "\t" + calcSalary() + "\n");
    }
    
    
    
}
