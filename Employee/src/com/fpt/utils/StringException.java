/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.utils;

/**
 *
 * @author Lan-T
 */
public class StringException extends Exception {

    public StringException() {
    }

    public StringException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
