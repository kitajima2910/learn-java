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
    
    public static boolean isNotEmpty(String str) {
        return !str.trim().isEmpty();
    }
    
    public static boolean isNumberRange(String num, int start, int form) {
        return Integer.parseInt(num) >= start && Integer.parseInt(num) <= form;
    }
}
