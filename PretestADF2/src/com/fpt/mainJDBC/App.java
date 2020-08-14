/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainJDBC;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        List<CellPhone> cellPhones = new CellPhoneDAO().findAll();
        Menu.show();
        
        while(true) {
            System.out.print("Options[1-5]: ");
            switch(s.nextLine()) {
                case "1":
                    new CellPhoneManager().addCellPhone(s);
                    break;
                case "2":
                    new CellPhoneManager().showAll();
                    break;
                case "3":
                    new CellPhoneManager().update(s);
                    break;
                case "4":
                    new CellPhoneManager().deleteId(s);
                    break;
                case "5":
                    return;
            }
        }
        
    }
    
}
