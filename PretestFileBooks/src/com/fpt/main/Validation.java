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

    private static final String REGEX_BOOK_ID = "^B[\\d]{4}-A[\\d]{2}$";

    public static boolean checkNotIsEmpty(String str) {
        return !str.trim().isEmpty();
    }
    
    
    public static boolean checkBookId(String bookID) {
        return Pattern.matches(REGEX_BOOK_ID, bookID);
    }
}
