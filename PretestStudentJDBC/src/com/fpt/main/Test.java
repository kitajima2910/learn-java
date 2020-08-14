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
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Menu.show();
        while (true) {
            System.out.print("Options[1-4]: ");
            switch (s.nextLine()) {
                case "1":
                    new StudentManager().createStudent(s);
                    break;
                case "2":
                    new StudentManager().showAll();
                    break;
                case "3":
                    System.out.print("Enter id: ");
                    int id = Integer.valueOf(s.nextLine());
                    if (!new StudentManager().searchId(id)) {
                        System.out.println("Not found!!");
                    } else {
                        new StudentManager().removeStudent(id);
                        new StudentManager().showAll();
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!!!");
                    return;
                default:
                    System.out.println("Check again your options...");
                    break;
            }
        }
    }

}
