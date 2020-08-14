/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.utils;

import java.util.regex.Pattern;

/**
 *
 * @author Lan-T
 */
public class Validation {

    private final static String REGEX_EMP_ID = "^E[0-9]{2}-[0-9]{3}$";
    private final static String REGEX_EMAIL = "^[\\w]+@\\w+.\\w+";
    
    public Validation() {
    }
    
    public static boolean checkEmpId(String empId) {
        return Pattern.matches(REGEX_EMP_ID, empId);
    }
    
    public static boolean checkEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
    
    public static boolean checkNotEmpty(String str) {
        return !str.isEmpty();
    }
}
