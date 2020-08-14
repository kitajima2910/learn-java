/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainjdbc;

import com.fpt.main.CellPhoneManager;
import com.fpt.main.Menu;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CellPhoneManager cpm = new CellPhoneManager();
        Menu.showJDBC();
        while(true) {
            System.out.print("Options[1-9]: ");
            switch(s.nextLine()) {
                case "1":
                    cpm.addJDBC(s);
                    break;
                case "2":
                    cpm.showAllJDBC();
                    break;
                case "3":
                    cpm.showWithCodeJDBC(s);
                    break;
                case "4":
                    cpm.showWithNameJDBC(s);
                    break;
                case "5":
                    cpm.deleteCellCodeJDBC(s);
                    break;
                case "6":
                    cpm.showAllSortDateJDBC();
                    break;
                case "7":
                    cpm.showTOP3PriceJDBC();
                    break;
                case "8":
                    cpm.updateJDBC(s);
                    break;
                case "9":
                    return;
                default:
                    System.out.println("Check agian...");
                    break;
            }
        }
    }
}
