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
public class HashSetRetrieveElementExample {
    
    public void retrieveElement() {
        System.out.println("retrieveElement() !!!");
        
        Set<String> brands = new HashSet<>();
        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("Kia");
        brands.add("Lenovo");
        
        if(brands.contains("Wilson")) {
            System.out.println("The set contains the Wilson elemtent");
        } else {
            System.out.println("The set does not contain the Wilson elements");
        }
        
        if(brands.contains("Apple")) {
            System.out.println("The set contains the Apple elemtent");
        } else {
            System.out.println("The set does not contain the Apple elements");
        }
        
        brands.clear();
        if(brands.isEmpty()) {
            System.out.println("The set does not contain any elements.");
        }
    }
    
    public static void main(String[] args) {
        new HashSetRetrieveElementExample().retrieveElement();
    }
    
}
