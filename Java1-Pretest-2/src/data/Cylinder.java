/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import utils.NumberException;
import utils.Validator;

/**
 *
 * @author Lan-T
 */
public class Cylinder extends Shape implements IGeometry {

    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NumberException {
        if(Validator.isNumber(String.valueOf(radius))) {
            this.radius = radius;
        } else {
            throw new NumberException("Check radius > 0 ...");
        }
        
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws NumberException {
        if(Validator.isNumber(String.valueOf(height))) {
            this.height = height;
        } else {
            throw new NumberException("Check height > 0 ...");
        }
        
    }
    
    
    
    @Override
    public void accept(Scanner s) {
        
        do{
            System.out.print("Enter radius: ");
            try {
                setRadius(Double.parseDouble(s.nextLine()));
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do{
            System.out.print("Enter height: ");
            try {
                setHeight(Double.parseDouble(s.nextLine()));
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
    }

    @Override
    public void printInfo() {
        System.out.format("%-10.2f %-10.2f %-15.2f %-10.2f %-10.2f\n", getRadius(), getHeight(), peripheral(), area(), volume());
    }

    @Override
    public double area() {
        return getRadius() * getRadius() * PI;
    }

    @Override
    public double peripheral() {
        return getRadius() * 2 * PI;
    }

    @Override
    public double volume() {
        return getHeight() * PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return getRadius() + "\t\t" + getHeight() + "\t\t" + peripheral() + "\t\t" + area() + "\t\t" + volume();
    }
    
    
    
}
