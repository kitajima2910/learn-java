/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import utils.NumberException;
import utils.Validation;

/**
 *
 * @author Lan-T
 */
public class Employee extends Person {

    private int salary;
    private int workedDays;
    private String position;

    public Employee() {
    }

    public Employee(int salary, int workedDays, String position) {
        this.salary = salary;
        this.workedDays = workedDays;
        this.position = position;
    }

    public Employee(int salary, int workedDays, String position, String id, String name, int yoh) {
        super(id, name, yoh);
        this.salary = salary;
        this.workedDays = workedDays;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws NumberException {
        if (Validation.isNumberRange(String.valueOf(salary), 200, 10000)) {
            this.salary = salary;
        } else {
            throw new NumberException("Check salary [200 - 10000]");
        }

    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) throws NumberException {
        if (Validation.isNumberRange(String.valueOf(workedDays), 0, 27)) {
            this.workedDays = workedDays;
        } else {
            throw new NumberException("Check workedDays [0 - 27]");
        }

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void accept(Scanner s) {
        super.accept(s); //To change body of generated methods, choose Tools | Templates.
        
        do{
            System.out.print("Enter salary: ");
            try {
                setSalary(Integer.parseInt(s.nextLine()));
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        
        do{
            System.out.print("Enter worked days: ");
            try {
                setWorkedDays(Integer.parseInt(s.nextLine()));
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        System.out.print("Enter position: ");
        setPosition(s.nextLine());
    }

    @Override
    public void printInfo() {
        double income = getSalary() * getWorkedDays() / 26;
        System.out.format("%-10s %-10s %-10d %-10s %-10d %-15d %-10.2f\n", getId(), getName(), getYoh(), getPosition(), getSalary(), getWorkedDays(), income);
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", workedDays=" + workedDays + ", position=" + position + '}';
    }
    
    

}
