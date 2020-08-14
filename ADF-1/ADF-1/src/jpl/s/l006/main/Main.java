/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l006.main;

import jpl.s.l006.AgeUtils;
import jpl.s.l006.TooOldException;
import jpl.s.l006.TooYoungException;

/**
 *
 * @author Lan-T
 */
public class Main {
    public static void main(String[] args) {
        try {
            AgeUtils.checkAge(11);
        } catch (TooYoungException | TooOldException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
