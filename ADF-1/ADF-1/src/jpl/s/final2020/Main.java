/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.final2020;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Main {

    public static void main(String[] args) {
        
        List<Student> students = null;
        Menu.show();
        try {
            while (true) {
                System.out.print("Option[1-5]: ");
                int n = Integer.parseInt(new Scanner(System.in).nextLine());
                switch (n) {
                    case 1:
                        Student.showInfo(Student.readStudent());
                        break;
                    case 2:
                        students = Student.setScore(Student.readStudent());
                        break;
                    case 3:
                        Student.write(students);
                        System.out.println("Write the data - Success");
                        break;
                    case 4:
                        Student.showInfoTwo();
                        break;
                    case 5:
                        return;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

}
