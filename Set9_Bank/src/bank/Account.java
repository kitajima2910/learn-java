/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

import java.util.Scanner;

/**
 *
 * @author BuiTruongAnh
 */
public class Account {
    String name;
    int balance;
    Scanner sc;
    
    public Account(){
        sc = new Scanner(System.in);
        System.out.print("Input a name: ");
        name = sc.nextLine();
        
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Input balance: ");
                balance = sc.nextInt();
                if (balance<=100) {
                    throw new Exception("Balance must be greater than 100");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    
        }
    }
    
    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}