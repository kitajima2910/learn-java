/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l006;

/**
 *
 * @author Lan-T
 */
public class AgeCheckingException extends Exception {

    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Tuoi khong hop le: " + super.getMessage();
    }
    
    
    
}
