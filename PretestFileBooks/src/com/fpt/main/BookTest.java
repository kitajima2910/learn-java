/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class BookTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookManager bm = new BookManager();
        Menu.show();
        while(true) {
            System.out.print("Options[1-4]: ");
            switch(s.nextLine()) {
                case "1":
                    bm.addNewBook(s);
                    break;
                case "2":
                    bm.displayAll();
                    break;
                case "3":
                    bm.save();
                    break;
                case "4":
                    bm.open();
                    System.out.println("Bye!!!");
                    return;
                default:
                    System.out.println("Check again your options...");
                    break;
            }
        }
    }
}
