/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L002.HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Lan-T
 */
public class HashSetIterationExample {
    
    public void hashSetIterator() {
        System.out.println("hashSetIterator() !!!");
        
        Set<String> brands = new HashSet<>();
        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("Kia");
        brands.add("Lenovo");
        
        Iterator<String> it = brands.iterator();
        
        while(it.hasNext()) {
            
            String element = it.next();
            
            System.out.println(element);
        }

    }
    
    public static void main(String[] args) {
        new HashSetIterationExample().hashSetIterator();
    }
    
}
