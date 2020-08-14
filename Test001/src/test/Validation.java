/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.regex.Pattern;

public class Validation {
    public static final String ID =  "^S[0-9]{3}$";
    public static final String NAME  = "^[a-zA-Z ]+$";
    public static final String Mail =  "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    public static final String Phone = "^[0-9]{3}-[0-9]{4}-[0-9]{3}$";
    
    
    public static boolean  checkId(String id){
    return Pattern.matches(ID, id);
    }
    
    public static boolean checkName(String name){
    return  Pattern.matches(NAME, name);
    }
    
    public static boolean checkMail(String mail){
    return  Pattern.matches(Mail, mail);
    }
    
    public static boolean checkPhone(String phone){
    return Pattern.matches(Phone, phone);
    }
    
      public static boolean isNoEmpty(String str) {
        return !str.trim().isEmpty();
    }
}
