/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.utils;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import jpl.l.a103.entities.Book;
import jpl.l.a103.entities.Publication;

/**
 *
 * @author Lan-T
 */
public class Validation {
    
    private static final String ISBN_PATTERN = "\\d{3}-\\d{1}-\\d{2}-\\d{4}$";
    private static final String NUMBER_PATTERN = "\\d{1}$";

    public Validation() {
    }
    
    public static boolean checkIsbn(String isbn, List<Publication> ps) {
        
        List<Publication> bs = ps.stream().filter(e -> e instanceof Book).collect(Collectors.toList());
        
        Publication bTmp = bs.stream().filter(e -> isbn.equals(((Book)e).getIsbn())).findAny().orElse(null);
        
        if(bTmp != null) {
            return false;
        }
        
        if(isbn.length() >= 10 && isbn.length() <= 17) {
            return Pattern.matches(ISBN_PATTERN, isbn);
        }
        
        return false;
    }
    
    public static boolean checkNumber(String n) {
        if(n.length() == 1) {
            return Pattern.matches(NUMBER_PATTERN, n);
        }
        
        return false;
    }
    
}
