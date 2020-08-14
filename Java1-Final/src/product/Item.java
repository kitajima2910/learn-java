/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import sale.IDiscount;
import utils.NumberException;
import utils.StringException;
import utils.Validation;

/**
 *
 * @author Lan-T
 */
public class Item implements IDiscount {

    private String name;
    private int price;
    private int quantity;

    public Item() {
    }

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringException {
        if(Validation.isNotEmpty(name)) {
            this.name = name;
        } else {
            throw new StringException("Check name ... ");
        }
        
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws NumberException {
        if(Validation.isNumber(String.valueOf(price))) {
            this.price = price;
        } else {
            throw new NumberException("Check price ... ");
        }
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws NumberException {
        if(Validation.isNumber(String.valueOf(quantity))) {
            this.quantity = quantity;
        } else {
            throw new NumberException("Check quantity ... ");
        }
        
    }
    
    
    
    @Override
    public void displayDetails() {
        int total = getQuantity() * getPrice();
        System.out.format("%-10s %-10d %-10d %-10d\n", getName(), getPrice(), getQuantity(), total);
    }
    
}
