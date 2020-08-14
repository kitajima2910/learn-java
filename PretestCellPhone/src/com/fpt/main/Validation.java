/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 *
 * @author Lan-T
 */
public class Validation {

    private static final String REGEX_CELL_CODE = "^C[\\d]{4}-[\\d]{3}$";
    private static final String REGEX_CELL_NAME = "^[a-zA-Z\\s]+$";
    private static final String REGEX_CELL_DATE = "^[\\d]{2}\\/[\\d]{2}\\/[\\d]{4}$";
    private static final String REGEX_CELL_PRODUCER = "^nokia|samsung|oppo|iphone$";
//    private static final String REGEX_CELL_EMAIL = "^[\\w]+@[\\w]{2,}+.[\\w|.\\w]{2,}$";
    private static final String REGEX_CELL_EMAIL = "^[\\w]{2,}@[\\w]{2,}(\\.[\\w]{2,}){1,2}$";

    public static boolean checkNotIsEmpty(String str) {
        return !str.trim().isEmpty();
    }

    public static boolean checkCellCode(String cellCode) {
        return Pattern.matches(REGEX_CELL_CODE, cellCode);
    }

    public static boolean checkCellName(String cellName) {
        return Pattern.matches(REGEX_CELL_NAME, cellName);
    }

    public static boolean checkPrice(double cellPrice) {
        return cellPrice > 0;
    }

    public static boolean checkCellDate(LocalDate cellDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Pattern.matches(REGEX_CELL_DATE, dtf.format(cellDate));
    }

    public static boolean checkCellProducer(String cellProducer) {
        return Pattern.matches(REGEX_CELL_PRODUCER, cellProducer.toLowerCase());
    }

    public static boolean checkCellEmail(String cellEmail) {
        return Pattern.matches(REGEX_CELL_EMAIL, cellEmail);
    }
}
