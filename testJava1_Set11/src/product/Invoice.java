/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author DTP
 */
public class Invoice{
    //bien local
    int maxItem, nextItem=0;
    Item[] arrItem;
    Item objItem;
    Scanner sc;
    String itemName;
    float price;
    int amount;
    String priceStr, amountStr;
    //ham dung
    public Invoice(){
        sc = new Scanner(System.in);
        System.out.print("Enter a Max Item: ");
        maxItem = sc.nextInt();
        arrItem = new Item[maxItem];
    }
    //method
    public void addItem(){
        //check empty array
        
        //check so luong Item nhap vao mang
        if (nextItem == maxItem){
            System.out.println("Array is full...");
            return;
        }
        //input and check Name
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Item Name: ");
                itemName = sc.nextLine();
                if (itemName.isEmpty()){
                    throw new Exception("Item Name cannot be blank");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //input and check Price
        while (true) {            
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Price: ");
                priceStr = sc.nextLine();
                //kiem tra du lieu nhap vao, neu loi se bao bang line 2
                if(priceStr.isEmpty()) {    
                    throw new Exception("Price cannot be blank.");
                }
                /*den buoc nay la co nhap, 
                nhung check chuoi nhap vao co phai la so hay ko,
                thong bao loi bang line 1
                */
                price = Float.parseFloat(priceStr);
                /*
                neu qua duoc buoc tren thi chac chan la so,
                neu ko dung se thong bao loi bang line 2
                */
                if(price<=0){
                    throw new Exception("Price must be greater than Zero.");
                }
                break;
            } 
            //line 1
            catch(NumberFormatException e){
                System.out.println("Price must be Number.");
            }
            //line 2
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //input and check Amount, tuong tu nhu Price
        while (true) {            
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Amount: ");
                amountStr = sc.nextLine();
                if(amountStr.isEmpty()) {    
                    throw new Exception("Amount cannot be blank.");
                }
                amount = Integer.parseInt(amountStr);
                if(amount<=0){
                    throw new Exception("Amount must be greater than Zero.");
                }
                break;
            } 
            catch(NumberFormatException e){
                System.out.println("Amount must be Number.");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        objItem = new Item();
        objItem.itemName = itemName;
        objItem.price = price;
        objItem.amount = amount;
        
        arrItem[nextItem] = objItem;
        nextItem++;
    }
    public void searchItem(){
        sc = new Scanner(System.in);
        System.out.print("Enter a Item name: ");
        String nameStr = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < nextItem; i++) {
            if (arrItem[i].itemName.equalsIgnoreCase(nameStr)){
                arrItem[i].displayDetails();
                check = true;
                break;
            }
        }
        //chay for o tren de tim kiem Item, neu khong co thi moi chay dong lenh ben duoi
        if (check == false){
            System.out.println("Not found !!!");
        }
    }
    public void displayInvoice(){
        if(nextItem==0){
            System.out.println("No Item Display !!!");
            return;
        }
        for (int i = 0; i < nextItem; i++) {
            arrItem[i].displayDetails();
            System.out.println("");
        }
    }
}
