/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.utils;

/**
 *
 * @author Lan-T
 */
public class Menu {

    public Menu() {
    }

    public static void display() {
        System.out.println("====== LIBRARY MANAGEMENT SYSTEM ======");
        System.out.println("1. Add a book");
        System.out.println("2. Add a magazine");
        System.out.println("3. Display books and magazines");
        System.out.println("4. Add author to book");
        System.out.println("5. Display top 10 of magazines by volume");
        System.out.println("6. Search book by (isbn, author, publisher)");
    }
}
