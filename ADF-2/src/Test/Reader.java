/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Lan-T
 */
public class Reader {

    public static void main(String[] args) {
        String path1 = "D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\Test\\src\\app\\Main.java";
        String path2 = "C:\\Users\\Lan-T\\Videos\\vkiu\\video-1568896564.mp4";
        try {
            FileInputStream fis = new FileInputStream(path1);
            int ch = 0;
            while ((ch = fis.read()) > -1) {
                System.out.printf("%c", ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
