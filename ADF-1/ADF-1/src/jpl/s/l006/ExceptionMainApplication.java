/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l006;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class ExceptionMainApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Nhap tuoi: ");
            int n = Integer.parseInt(s.nextLine());
            System.out.println("Tuoi hien tai: " + n);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
    }
}
