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
public class PretestADF2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CellPhoneManager cpm = new CellPhoneManager();
        Menu.show();
        while(true) {
            System.out.print("Options[1-6]: ");
            switch(s.nextLine()) {
                case "1":
                    cpm.add(s);
                    break;
                case "2":
                    cpm.showAll();
                    break;
                case "3":
                    cpm.saveFile();
                    System.out.println("Successfully...");
                    break;
                case "4":
                    cpm.readFile();
                    System.out.println("Successfully...");
                    break;
                case "5":
                    cpm.deleteCode(s);
                    break;
                case "6":
                    System.out.println("Goodbye!!!");
                    cpm.openFile();
                    return;
                default:
                    System.out.println("Check agian...");
                    break;
            }
        }
    }
}
