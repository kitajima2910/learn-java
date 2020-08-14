/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import sale.Discount;
/**
 *
 * @author DTP
 */
public class Item implements Discount{
    String itemName;
    float price;
    int amount;
    
    @Override
    public void displayDetails() {
        System.out.println("Item Name: "+itemName);
        System.out.println("Item Price: "+price);
        System.out.println("Item Amount: "+amount);
        System.out.println("Pay Amount: "+((price*amount)-computeDiscount()));
    }

    @Override
    public double computeDiscount() {
        double discount;
        if (amount>20){
            discount = price*amount*DISCOUNT_PERCENT;
        }else{
            discount = 0;
        }
        return discount;
    }
    
    
}
