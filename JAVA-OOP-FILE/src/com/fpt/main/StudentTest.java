/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.services.StudentManager;
import com.fpt.utils.Menu;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        Menu.show();
        while(true) {
            System.out.print("Options[1-8]: ");
            switch(s.nextLine()) {
                case "1":
                    sm.add(s);
                    break;
                case "2":
                    sm.showAll();
                    break;
                case "3":
                    System.out.print("Enter id: ");
                    String id = s.nextLine();
                    sm.deleteID(id);
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Check again your options");
                    break;
            }
        }
    }
}
