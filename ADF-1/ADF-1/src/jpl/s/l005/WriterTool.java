/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l005;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Lan-T
 */
public class WriterTool {
    private FileOutputStream fos;
    private OutputStreamWriter osw;
    private BufferedWriter bw;

    public WriterTool() {
        try {
            fos = new FileOutputStream(Constants.LOCATION + Constants.WRITE_DATA_FILE_NAME);
            osw = new OutputStreamWriter(fos, Constants.CHARSET_ENCODING);
            bw = new BufferedWriter(osw);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }

    public WriterTool(FileOutputStream fos, OutputStreamWriter osw, BufferedWriter bw) {
        this.fos = fos;
        this.osw = osw;
        this.bw = bw;
    }
    
    public void writeData(String content) {
        try {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
    
    public OutputStreamWriter getOsw() {
        return osw;
    }

    public void setOsw(OutputStreamWriter osw) {
        this.osw = osw;
    }

    public FileOutputStream getFos() {
        return fos;
    }

    public void setFos(FileOutputStream fos) {
        this.fos = fos;
    }
    
    public BufferedWriter getBw() {
        return bw;
    }

    public void setBw(BufferedWriter bw) {
        this.bw = bw;
    }
    
    
}
