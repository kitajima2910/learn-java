/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L003.FileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Lan-T
 */
public class FileUtil {
    public static void copyFileUsingStream(File source, File dest) {
        InputStream is = null;
        OutputStream os = null;
        
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
    
    public static void main(String[] args) {
        long start = System.nanoTime();
        File srcF = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\pigame.sql");
        File destF = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\copyPigame.sql");
        FileUtil.copyFileUsingStream(srcF, destF);
        System.out.println("Successfully...");
        System.out.println("Time: " + (System.nanoTime() - start));
    }
}
