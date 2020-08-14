/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l003;

/**
 *
 * @author Lan-T
 */
public class TaxCollector {
    
    public static void main(String[] args) {
        double grossIncome = Double.parseDouble("1000");
        BasicRateTax basicRateTax = new BasicRateTax();
        double tax = basicRateTax.calcTax(grossIncome);
        
        System.out.println("Tax due is: " + tax);
    }
    
}
