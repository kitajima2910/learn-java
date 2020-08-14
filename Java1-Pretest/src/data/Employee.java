/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import utils.NumberExcetion;
import utils.Validator;

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

    public void setSalary(int salary) throws NumberExcetion {
        if (Validator.isSalaryRange(String.valueOf(salary))) {
            this.salary = salary;
        } else {
            throw new NumberExcetion("Check salary ... [200-10000]");
        }

    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) throws NumberExcetion {
        if (Validator.isWorkedDaysRange(String.valueOf(workedDays))) {
            this.workedDays = workedDays;
        } else {
            throw new NumberExcetion("Check workedDays ... [0-27]");
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
        super.accept(s);
        
        do{
            System.out.print("Enter salary: ");
            try {
                setSalary(Integer.valueOf(s.nextLine()));
            } catch (NumberFormatException | NumberExcetion e) {
                System.out.println(e);
                continue;
            }
            break;
        }while(true);
        
        do{
            System.out.print("Enter wordker days: ");
            try {
                setWorkedDays(Integer.valueOf(s.nextLine()));
            } catch (NumberFormatException | NumberExcetion e) {
                System.out.println(e);
                continue;
            }
            break;
        }while(true);
        
        System.out.print("Enter position: ");
        setPosition(s.nextLine());
    }

    @Override
    public void printInfo() {
        float inCome = getSalary() * getWorkedDays() / 26.0f;
        String infor = getId() + "\t\t" + getName() + "\t\t" + getYoh() + "\t\t" + getPosition() + "\t\t" + getSalary() + "\t\t" + getWorkedDays() + "\t\t" + inCome;
        System.out.println(infor);
    }

    @Override
    public String toString() {
        return getPosition() + "\t\t" + getSalary() + "\t\t" + getWorkedDays();
    }
    
    
}
