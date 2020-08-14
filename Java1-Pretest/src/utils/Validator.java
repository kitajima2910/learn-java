/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.regex.Pattern;

/**
 *
 * @author Lan-T
 */
public class Validator {

    public Validator() {
    }
    
    public static boolean isStringNotEmpty(String str) {
        return !str.trim().isEmpty();
    }
    
    public static boolean isYohRange(String str) {
        return Integer.valueOf(str) > 1939 && Integer.valueOf(str) < 2001;
    }
    
    public static boolean isNumber(String str) {
        return Pattern.matches("\\d+", str);
    }
    
    public static boolean isSalaryRange(String str) {
        return Integer.valueOf(str) > 199 && Integer.valueOf(str) < 10001;
    }
    
    public static boolean isWorkedDaysRange(String str) {
        return Integer.valueOf(str) > -1 && Integer.valueOf(str) < 28;
    }
}
