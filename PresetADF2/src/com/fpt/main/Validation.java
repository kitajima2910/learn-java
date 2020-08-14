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
    
    private static final String REGEX_ID = "^E[0-9]{2}-[0-9]{2}$";
    private static final String REGEX_EMAIL = "^[\\w]{2,}@[\\w]{2,}(\\.[\\w]{2,}){1,2}$";
    
    public static boolean checkNotIsEmpty(String str) {
        return !str.trim().isEmpty();
    }
    
    public static boolean checkID(String id) {
        return Pattern.matches(REGEX_ID, id);
    }
    
    public static boolean checkEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
    
}
