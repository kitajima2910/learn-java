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
public class TestAccount {
    int maxAcc;
    int nextAcc;
    ATM[] bank;
    Scanner sc;
    int opt;
    Account objAcc;
    
    public static void main(String[] args) {
        TestAccount objTA = new TestAccount();
        Scanner sc = new Scanner(System.in);
        int opt;
        String nameSearch;
        while(true){
            System.out.println("1. New ATM");
            System.out.println("2. Search");
            System.out.println("3. Total money");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();
            System.out.println("");
            switch(opt){
                case 1:
                    objTA.newAccount();
                    break;
                case 2:
                    sc = new Scanner(System.in);
                    System.out.print("Enter a name to search: ");
                    nameSearch = sc.nextLine();
                    objTA.Search(nameSearch);
                    break;
                case 3:
                    objTA.totalMoney();
                    break;
                case 4:
                    System.exit(0);
                
                default:
                    System.out.println("Invalid option! Please re-enter!");
                    System.out.println("");
            }
        }
    }
    
    public TestAccount(){
        sc = new Scanner(System.in);
        System.out.print("Enter maximum of the Account in the bank: ");
        maxAcc = sc.nextInt();
        bank = new ATM[maxAcc];
    }
    
    public void newAccount(){
        if(nextAcc == maxAcc){
            System.out.println("Full Account!");
            System.out.println("");
        }
        else{
            objAcc = new ATM();
            bank[nextAcc] = (ATM)objAcc;
            nextAcc++;
        }
    }
    
    public void Search(String name){
        boolean check = false;
        for (int i = 0; i < nextAcc; i++) {
            if(name.equalsIgnoreCase(bank[i].getName())){
                check = true;
                System.out.println("Name: "+bank[i].getName()+"\tBalance: "+bank[i].getBalance()+"\tPin: "+bank[i].pin);
                System.out.println("");
            }
        }
        if(check == false){
            System.out.println("Cannot search!");
        }
    }
    
    public void totalMoney(){
        int balanceTotal = 0;
        for (int i = 0; i < nextAcc; i++) {
            balanceTotal += bank[i].getBalance();
        }
        
        System.out.println("Sum of the balance in the bank is: " +balanceTotal);
        System.out.println("");
    }

}
