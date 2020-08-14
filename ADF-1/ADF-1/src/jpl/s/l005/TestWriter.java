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
public class TestWriter {
    public static void main(String[] args) throws IOException {
        WriterTool wt = new WriterTool();
        wt.writeData("Chao JAVA 1");
        wt.writeData("Chao JAVA 2");
        wt.getBw().close();
    }
}
