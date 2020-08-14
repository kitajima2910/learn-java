/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L003.FileDemo;

import java.io.File;

/**
 *
 * @author Lan-T
 */
public class FileList {
    public static void main(String[] args) {
        System.out.println("File[] listFiles():\n");
        
        File dir = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\");
        
        File[] files = dir.listFiles();
        
        for(File file : files) {
            System.out.println(file.getAbsoluteFile());
        }
        
        System.out.println("\n-------------------\n");
        
        System.out.println("String[] list():\n");
        
        String[] paths = dir.list();
        for(String path : paths) {
            System.out.println(path);
        }
    }
}
