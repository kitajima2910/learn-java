/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.final2020;

import jpl.s.l005.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Lan-T
 */
public class ReaderTool {
    private FileInputStream fis;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public ReaderTool() {
        try {
            fis = new FileInputStream(Constants.LOCATION + Constants.FILE_NAME);
            isr = new InputStreamReader(fis, Constants.CHARSET_ENCODING);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }
    
    
    public ReaderTool(String fileName) {
        try {
            fis = new FileInputStream(Constants.LOCATION + fileName);
            isr = new InputStreamReader(fis, Constants.CHARSET_ENCODING);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }
    
    public ReaderTool(FileInputStream fis, InputStreamReader isr, BufferedReader br) {
        this.fis = fis;
        this.isr = isr;
        this.br = br;
    }
    
    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public FileInputStream getFis() {
        return fis;
    }

    public void setFis(FileInputStream fis) {
        this.fis = fis;
    }

    public InputStreamReader getIsr() {
        return isr;
    }

    public void setIsr(InputStreamReader isr) {
        this.isr = isr;
    }
    
}
