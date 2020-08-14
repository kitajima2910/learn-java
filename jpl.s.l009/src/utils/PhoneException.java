/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Lan-T
 */
public class PhoneException extends Exception {

    public PhoneException() {
    }

    public PhoneException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }

}
