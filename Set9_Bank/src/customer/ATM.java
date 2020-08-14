/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customer;

import bank.Account;
import java.util.Scanner;

/**
 *
 * @author BuiTruongAnh
 */
public class ATM extends Account {
    Account objA;
    String pin;
    
    public ATM(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a pin: ");
        pin = sc.nextLine();
        System.out.println("");
    }
}
