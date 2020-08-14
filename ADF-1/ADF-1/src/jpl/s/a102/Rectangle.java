/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.a102;

/**
 *
 * @author Lan-T
 */
public class Rectangle implements Shape {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public int calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setLengthWidth(int len, int width) {
        this.length = len;
        this.width = width;
    }
    
}
