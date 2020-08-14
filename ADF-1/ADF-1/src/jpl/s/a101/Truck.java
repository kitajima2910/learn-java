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
public class Truck extends Car {
    private int weight;

    public Truck() {
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public double getSalePrice() {
        return getWeight() > 2000 ? getRegularPrice() * 10.0 / 100 : getRegularPrice() * 20.0 / 100;
    }
}
