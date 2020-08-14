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
public class HashSetCreationExample {
    
    public void createHashSet() {
        System.out.println("createHashSet() !!!");
        
        Set<String> brands = new HashSet<>();
        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("IBM");
        brands.add("IBM");
        
        int nOfElements = brands.size();
        
        System.out.format("The set contains %d element\n", nOfElements);
        System.out.println(brands);
    }
    
    public static void main(String[] args) {
        new HashSetCreationExample().createHashSet();
    }
    
}
