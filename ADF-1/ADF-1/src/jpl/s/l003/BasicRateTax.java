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
public class BasicRateTax {
    
    private static final double BASIC_INCOME = 1000.00;
    private static final double BASIC_TAX_RATE = .20;

    public BasicRateTax() {
    }
    
    public double calcTax() {
        return BASIC_INCOME * BASIC_TAX_RATE;
    }
    
    public double calcTax(double grossIncome) {
        return grossIncome < BASIC_INCOME ? calcTax() : grossIncome * BASIC_TAX_RATE;
    }
    
}
