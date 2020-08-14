/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l006;

/**
 *
 * @author Lan-T
 */
public class AgeUtils {

    public AgeUtils() {
    }
    
    public static void checkAge(int age) throws TooYoungException, TooOldException {
        if(age < 18) {
            throw new TooYoungException("Age " + age + " too young");
        } else if(age > 40) {
            throw new TooOldException("Age " + age + " too old");
        }
        
        System.out.println("Age " + age + " stll correct!");
    }
}
