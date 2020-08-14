/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l001;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Lab04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n sinh vien: ");
        int n = Integer.parseInt(scanner.nextLine());

        Student[] student = new Student[n];

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1 + ": "));
            System.out.println("Enter your StudentId:");
            student[i].setId(scanner.nextLine());
            System.out.println("Enter your FirstName:");
            student[i].setFirstName(scanner.nextLine());
            System.out.println("Enter your LastName:");
            student[i].setLastName(scanner.nextLine());
            System.out.println("Enter your age:");
            student[i].setAge(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println("------------------------------------------");
        System.out.println("--------UNG DUNG QUAN LY SINH VIEN--------");
        System.out.println("------------------------------------------");

        int count = 1;
        for (Student sv : student) {
            System.out.println("Thong tin sinh vien: " + count++);
            System.out.println("StudentId: " + sv.getId());
            System.out.println("Firstname: " + sv.getFirstName());
            System.out.println("Lastname: " + sv.getLastName());
            System.out.println("Student Age: " + sv.getAge());
        }

    }
}
