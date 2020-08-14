/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import product.Invoice;
import product.Item;
import utils.Menu;

/**
 *
 * @author Lan-T
 */
public class Test {

    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        Scanner s = new Scanner(System.in);
        List<Item> is = new ArrayList<>();

        Menu.show();

        while (true) {
            System.out.print("Options[1-3]: ");
            switch (s.nextLine()) {
                case "1":
                    System.out.print("Enter n for Array: ");
                    int n = Integer.parseInt(s.nextLine());
                    invoice.setMaxItem(n);
                    Item[] items = new Item[invoice.getMaxItem()];
                    for (int i = 0; i < items.length; i++) {
                        items[i] = invoice.addItem(s);
                    }
                    System.out.println("Add successfully");
                    System.out.println("Show array: ");
                    System.out.format("%-10s %-10s %-10s %-10s\n", "Name", "Price", "Quantity", "total");
                    for (Item item : items) {
                        item.displayDetails();
                        is.add(item);
                    }
                    break;
                case "2":
                    System.out.print("Enter name: ");
                    String name = s.nextLine();

                    invoice.searchItem(is, name);
                    break;
                case "3":
                    return;
            }
        }
    }
}
