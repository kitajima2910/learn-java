/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.service.DoctorService;
import com.fpt.util.Menu;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Menu.show();
        while(true) {
            System.out.print("Options[1-5]: ");
            switch(s.nextLine()) {
                case "1":
                    DoctorService.addDoctor(s);
                    break;
                case "2":
                    DoctorService.showAll();
                    break;
                case "3":
                    DoctorService.search(s);
                    break;
                case "4":
                    DoctorService.saveFile();
                    break;
                case "5":
                    DoctorService.openFile();
                    return;
            }
        }
    }
    
}
