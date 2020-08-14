/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import com.fpt.utils.NumberException;
import com.fpt.utils.StringException;
import com.fpt.utils.Validation;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public class Employee {

    private String id;
    private String name;
    private int age;
    private String address;

    public Employee() {
    }

    public Employee(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws StringException {
        if (Validation.checkNotIsEmpty(id)) {
            this.id = id;
        } else {
            throw new StringException("Check id...");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringException {
        if (Validation.checkNotIsEmpty(name)) {
            this.name = name;
        } else {
            throw new StringException("Check name...");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NumberException {
        if (Validation.checkAge(age)) {
            this.age = age;
        } else {
            throw new NumberException("Check age...");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws StringException {
        if (Validation.checkNotIsEmpty(address)) {
            this.address = address;
        } else {
            throw new StringException("Check address...");
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + '}';
    }

    public Employee add(Scanner s) {
        Employee employee = new Employee();
        
        do {
            System.out.print("Enter the Employee ID: ");
            try {
                employee.setId(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        
        do {
            System.out.print("Enter the Employee Name: ");
            try {
                employee.setName(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        
        do {
            System.out.print("Enter the Employee Age: ");
            try {
                employee.setAge(Integer.valueOf(s.nextLine()));
            } catch (NumberException | NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        
        do {
            System.out.print("Enter the Employee Address: ");
            try {
                employee.setAddress(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        
        return employee;
    }
}
