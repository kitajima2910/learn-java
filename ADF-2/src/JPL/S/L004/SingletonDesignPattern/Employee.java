/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L004.SingletonDesignPattern;

import JPL.S.L004.SingletonDesignPattern.pattern.SingletonPrinter;

/**
 *
 * @author Lan-T
 */
public class Employee {

    private String name;
    private SingletonPrinter printer;

    public Employee() {
    }

    public Employee(String name, SingletonPrinter printer) {
        this.name = name;
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingletonPrinter getPrinter() {
        return printer;
    }

    public void setPrinter(SingletonPrinter printer) {
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", printer=" + printer + '}';
    }

}
