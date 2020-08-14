/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.final2020;

/**
 *
 * @author Lan-T
 */
public class ScoreCheckingException extends Exception {

    public ScoreCheckingException(String message) {
        super(message);
    }
    
    @Override
    public String getMessage() {
        return "Diem khong hop le: " + super.getMessage();
    }
    
    
}
