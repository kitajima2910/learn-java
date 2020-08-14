/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Employee {

    private String id;
    private String name;
    private String address;
    private String email;

    public Employee() {
    }

    public Employee(String id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws CommonException {
        if (Validation.checkID(id)) {
            this.id = id;
        } else {
            throw new CommonException("Check id[Exx-xx]...");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CommonException {
        if (Validation.checkNotIsEmpty(name)) {
            this.name = name;
        } else {
            throw new CommonException("Check name...");
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws CommonException {
        if (Validation.checkEmail(email)) {
            this.email = email;
        } else {
            throw new CommonException("Check email...");
        }

    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + '}';
    }

    public Employee add(Scanner s) {
        Employee employee = new Employee();

        do {
            System.out.print("Enter id: ");
            try {
                employee.setId(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter name: ");
            try {
                employee.setName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        System.out.print("Enter address: ");
        employee.setAddress(s.nextLine());
        
        do {
            System.out.print("Enter email: ");
            try {
                employee.setEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        return employee;
    }
}
