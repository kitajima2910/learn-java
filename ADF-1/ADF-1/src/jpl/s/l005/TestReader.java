/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l005;

import java.io.IOException;

/**
 *
 * @author Lan-T
 */
public class TestReader {
    public static void main(String[] args) {
        ReaderTool rt = new ReaderTool();
        
        try {
            System.out.println("Dong 1: " + rt.getBr().readLine());
            System.out.println("Dong 2: " + rt.getBr().readLine());
            System.out.println("Dong 3: " + rt.getBr().readLine());
            System.out.println("Dong 4: " + rt.getBr().readLine());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
