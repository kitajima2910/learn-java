/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L002.ArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Lan-T
 */
public class ArrayListRemoveElementExample {
    
    public void removeElement() {
        System.out.println("removeElement() !!!");
        
        List<String> programmingLanguaes = new ArrayList<>();
        programmingLanguaes.add("C");
        programmingLanguaes.add("C++");
        programmingLanguaes.add("Java");
        programmingLanguaes.add("Kotlin");
        programmingLanguaes.add("Python");
        programmingLanguaes.add("Perl");
        programmingLanguaes.add("Ruby");
        
        System.out.println("Initial List: " + programmingLanguaes);
        
        programmingLanguaes.remove(5);
        System.out.println("After remove(5): " + programmingLanguaes);
        
        programmingLanguaes.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguaes);
        
        List<String> scriptingLangues = new ArrayList<>();
        scriptingLangues.add("Python");
        scriptingLangues.add("Ruby");
        scriptingLangues.add("Perl");
        
        programmingLanguaes.removeAll(scriptingLangues);
        System.out.println("After removeAll(scriptingLangues): " + programmingLanguaes);
        
        programmingLanguaes.removeIf(t -> t.startsWith("C"));
        System.out.println("After Removing all elements that start with \"C\": " + programmingLanguaes);
        
        programmingLanguaes.clear();
        System.out.println("After clear(): " + programmingLanguaes);
    }
    
    public static void main(String[] args) {
        new ArrayListRemoveElementExample().removeElement();
    }
    
}
