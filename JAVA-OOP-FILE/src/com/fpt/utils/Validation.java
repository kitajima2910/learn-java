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
    public static final String REGEX_ID = "^S[0-9]{3}$";
    public static final String REGEX_NAME = "^[\\w\\s]+$";
    public static final String REGEX_EMAIL = "^[\\w]{2,}@[\\w]{2,}(.[\\w]{2,}){1,2}$";
    public static final String REGEX_PHONE = "^[0-9]{3}-[0-9]{4}-[0-9]{3}$";
    
    public static boolean checkNotIsEmpty(String str) {
        return !str.trim().isEmpty();
    }
    
    public static boolean checkID(String id) {
        return Pattern.matches(REGEX_ID, id);
    }
    
    public static boolean checkName(String name) {
        return Pattern.matches(REGEX_NAME, name);
    }
    
    public static boolean checkEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
    
    public static boolean checkPhone(String phone) {
        return Pattern.matches(REGEX_PHONE, phone);
    }
}
