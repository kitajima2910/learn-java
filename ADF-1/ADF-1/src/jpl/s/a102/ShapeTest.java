/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.a102;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class ShapeTest {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Nhap n phan tu: ");
            n = Integer.parseInt(s.nextLine());
            if(n < 0) {
                System.out.println("Hay nhap n > 0... !");
            }
        } while(n < 0);
        
        Rectangle[] rs = new Rectangle[n];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < rs.length; i++) {
            rs[i] = new Rectangle();
            System.out.format("Nhap Rectangle thu %d: \n", i + 1);
            System.out.format("Nhap length: ");
            int len = Integer.parseInt(s.nextLine());
            System.out.format("Nhap width: ");
            int width = Integer.parseInt(s.nextLine());
            rs[i].setLengthWidth(len, width);
            
            max = rs[i].calculateArea() > max ? rs[i].calculateArea() : max;
            min = rs[i].calculatePerimeter() < min ? rs[i].calculatePerimeter() : min;
        }
        
        System.out.format("\n%-10s %-10s %-15s %-15s", "LENGTH", "WIDTH", "PERIMETER", "AREA");
        for(Rectangle r : rs) {
            System.out.format("\n%-10d %-10d %-15d %-15d", r.getLength(), r.getWidth(), r.calculatePerimeter(), r.calculateArea());
        }
        
        System.out.format("\nMAX AREA: %d\nMIN PERIMETER: %d\n", max, min);
    }
}
