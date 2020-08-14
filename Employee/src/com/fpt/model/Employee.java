/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import com.fpt.utils.StringException;
import com.fpt.utils.Validation;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Employee {

    private String empId;
    private String empName;
    private String address;
    private String email;

    public Employee() {
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.print("Enter empId: ");
            try {
                setEmpId(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while(true);
        
        do {
            System.out.print("Enter empName: ");
            try {
                setEmpName(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while(true);
        
        do {
            System.out.print("Enter email: ");
            try {
                setEmail(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while(true);
        
        do {
            System.out.print("Enter address: ");
            try {
                setAddress(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while(true);
        
    }

    public Employee(String empId, String empName, String address, String email) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
    }

    public String getEmpId() {
        return empId;
    }

    private void setEmpId(String empId) throws StringException {
        if(Validation.checkEmpId(empId)) {
            this.empId = empId;
        } else {
            throw new StringException("Check empId[Exx-xxx]...");
        }
        
    }

    public String getEmpName() {
        return empName;
    }

    private void setEmpName(String empName) throws StringException {
        if(Validation.checkNotEmpty(empName)) {
            this.empName = empName;
        } else {
            throw new StringException("Check empName is empty...");
        }
        
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) throws StringException {
        if(Validation.checkNotEmpty(address)) {
            this.address = address;
        } else {
            throw new StringException("Check address is empty...");
        }
        
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) throws StringException {
        if(Validation.checkEmail(email)) {
            this.email = email;
        } else {
            throw new StringException("Check email...");
        }
        
    }
    
    

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email + '}';
    }

}
