/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Lan-T
 */
public class Menu {

    public Menu() {
    }
    
    public static void show() {
        System.out.println("1. Add a new employee");
        System.out.println("2. Display list of employee");
        System.out.println("3. Search employee by name");
        System.out.println("4. Remove employee by id");
        System.out.println("5. Exit");
    }
}
