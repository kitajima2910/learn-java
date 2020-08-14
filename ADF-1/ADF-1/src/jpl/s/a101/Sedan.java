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
public class Sedan extends Car {
    
    private int length;

    public Sedan() {
    }
    
    public Sedan(int length, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public double getSalePrice() {
        return length > 20 ? getRegularPrice() * 5.0 / 100 : getRegularPrice() * 1.0 / 100;
    }
    
}
