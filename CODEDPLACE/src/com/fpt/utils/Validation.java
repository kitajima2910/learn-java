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
public class Validation {

    public static boolean checkNotIsEmpty(String str) {
        return !str.isEmpty();
    }

    public static boolean checkAge(int age) {
        return age > 0;
    }

}
