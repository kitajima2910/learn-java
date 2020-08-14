/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L002.HashSetDemo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lan-T
 */
public class HashSetRemoveElementExample {
    
    public void removeElements() {
        System.out.println("removeElements() !!!");
        
        Set<String> brands = new HashSet<>();
        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("Kia");
        brands.add("Lenovo");
        
        Set<String> brands2 = new HashSet<>();
        brands2.add("Wilson");
        brands2.add("Nike");
        brands2.add("Volvo");
        
        System.out.println(brands);
        
        brands.remove("Kia");
        brands.remove("Lenovo");
        System.out.println(brands);
        
        brands.removeAll(brands2);
        System.out.println(brands);
        
        if(brands.isEmpty()) {
            System.out.println("The brands set is empty");
        }
    }
    
    public static void main(String[] args) {
        new HashSetRemoveElementExample().removeElements();
    }
    
}
