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
public class Validator {

    public Validator() {
    }
    
    public static boolean isNumber(String num) {
        return Double.valueOf(num) > 0;
    }
}
