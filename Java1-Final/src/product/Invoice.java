/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import utils.NumberException;
import utils.StringException;

/**
 *
 * @author Lan-T
 */
public class Invoice {

    private int nextItem;
    private int maxItem;
    private Item[] arrItem;

    public Invoice() {
    }

    public Invoice(int nextItem, int maxItem, Item[] arrItem) {
        this.nextItem = nextItem;
        this.maxItem = maxItem;
        this.arrItem = arrItem;
    }

    public int getNextItem() {
        return nextItem;
    }

    public void setNextItem(int nextItem) {
        this.nextItem = nextItem;
    }

    public int getMaxItem() {
        return maxItem;
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public Item[] getArrItem() {
        return arrItem;
    }

    public void setArrItem(Item[] arrItem) {
        this.arrItem = arrItem;
    }

    public Item addItem(Scanner s) {

      
            
            Item item = new Item();

            do {
                System.out.print("Enter name: ");
                try {
                    item.setName(s.nextLine());
                } catch (StringException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            } while (true);

            do {
                System.out.print("Enter price: ");
                try {
                    item.setPrice(Integer.parseInt(s.nextLine()));
                } catch (NumberException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            } while (true);

            do {
                System.out.print("Enter quantity: ");
                try {
                    item.setQuantity(Integer.parseInt(s.nextLine()));
                } catch (NumberException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            } while (true);
        
    
        return item;

    }
    
    public void searchItem(List<Item> is, String name) {
        List<Item> isTMP = is.stream().filter(e -> name.contains(e.getName())).collect(Collectors.toList());
        if(isTMP.size() > 0) {
            System.out.format("%-10s %-10s %-10s %-10s\n", "Name", "Price", "Quantity", "total");
            isTMP.forEach(e -> e.displayDetails());
        } else {
            System.out.println("No item to display");
        }
        
    }

}
