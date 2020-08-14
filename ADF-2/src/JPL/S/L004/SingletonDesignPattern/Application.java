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
public class Application {
    
    public static void main(String[] args) {
        SingletonPrinter printer1 = SingletonPrinter.getInstance();
        Employee e1 = new Employee("David", printer1);
        System.out.println(e1);
        
        SingletonPrinter printer2 = SingletonPrinter.getInstance();
        Employee e2 = new Employee("Peter", printer2);
        System.out.println(e2);
    }
    
}
