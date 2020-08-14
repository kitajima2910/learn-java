/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.util.regex.Pattern;

/**
 *
 * @author Lan-T
 */
public class Validation {
    
    private final static String REGEX_CELL_CODE = "^C[\\d]{4}-[\\d]{3}$";
    private final static String REGEX_CELL_NAME = "^[a-zA-Z ]+$";
    
    public static boolean checkCode(String str) {
        return !str.isEmpty() && Pattern.matches(REGEX_CELL_CODE, str);
    }
    
    public static boolean checkPrice(double price) {
        return price > 0;
    }
    
    public static boolean checkName(String str) {
        return Pattern.matches(REGEX_CELL_NAME, str);
    }
}
