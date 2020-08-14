/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Tachi
 */
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        new Menu().menu();
        do {System.out.print("Enter your choice[1-8] :");
            switch (s.nextLine()) {
                case "1":
                    manager.addStudent();
                    break;
                case "2":
                    manager.showAll();
                    break;
                case "3":
                    manager.deleteStudent();
                    break;
                case "4":
                    manager.searchStudent();
                    break;
                case "5":
                    manager.sortName();
                    break;
                case "6":
                    manager.writeStudent();
                    break;
                case "7":
                    manager.readfile();
                    break;
                case "8":
                    manager.openFile();
                    return;
            }
        } while (true);
    }

}
