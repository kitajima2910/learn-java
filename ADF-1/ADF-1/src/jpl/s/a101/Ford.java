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
public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public Ford() {
    }

    public Ford(int year, int speed, double regularPrice, String color, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    
    @Override
    public double getSalePrice() {
        return (manufacturerDiscount * 1.0) / 100;
    }
}
