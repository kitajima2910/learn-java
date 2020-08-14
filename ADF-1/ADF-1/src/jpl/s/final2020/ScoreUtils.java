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
public class ScoreUtils {
    
    public static void check(int score) throws ZeroException, TenException {
        if(score < 0) {
            throw new ZeroException("Diem " + score + " wrong");
        } else if(score > 10) {
            throw new TenException("Diem " + score + "wrong");
        }
        
        System.out.println("Diem " + score + "hop le");
    }
    
}
