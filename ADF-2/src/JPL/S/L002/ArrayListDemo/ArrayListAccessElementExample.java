/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L002.ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class ArrayListAccessElementExample {

    public void accessElement() {
        System.out.println("accessElement() !!!");
        
        List<String> topCompanies = new ArrayList<>();
        
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);
        
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        
        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);
        
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
    
    public static void main(String[] args) {
        new ArrayListAccessElementExample().accessElement();
    }
}
