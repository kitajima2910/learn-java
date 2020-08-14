/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.a101;

/**
 *
 * @author Lan-T
 */
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Car sedanOne = new Sedan(211, 10, 10000, "WHILE");
        Car sedanTwo = new Sedan(2, 102, 140000, "WHILE");
        Car sedanThree = new Sedan(21, 130, 4000, "WHILE");
        Car fordOne = new Ford(2020, 20, 10000, "RED", 25);
        Car fordTwo = new Ford(2019, 30, 40000, "BLACK", 45);
        Car truckOne = new Truck(20001, 5, 500, "YELLOW");
        Car truckTwo = new Truck(1000, 15, 600, "GREEN");
        
        Car[] car = {sedanOne, sedanTwo, sedanThree, fordOne, fordTwo, truckOne, truckTwo};
        
        for(Car c : car) {
            if(c instanceof Sedan) {
                System.out.println("Sedan: " + c.getSalePrice());
            } else if(c instanceof Ford) {
                System.out.println("Ford: " + c.getSalePrice());
            } else {
                System.out.println("Truck: " + c.getSalePrice());
            }
        }
    }
}
