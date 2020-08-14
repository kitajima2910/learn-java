/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Lan-T
 */
public class Validation {

    public Validation() {
    }
    
    public static boolean isNumber(String num) {
        return Integer.valueOf(num) > 0;
    }
    
    public static boolean isNotEmpty(String str) {
        return !str.trim().isEmpty();
    }
}
