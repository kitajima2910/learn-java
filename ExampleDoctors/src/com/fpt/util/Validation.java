/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.util;

/**
 *
 * @author Lan-T
 */
public class Validation extends Exception {

    public Validation() {
    }

    public Validation(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
