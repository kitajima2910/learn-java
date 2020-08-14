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
public class MakeDir {
    public static void main(String[] args) {
        File dir = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\test2");
        
        System.out.println("Pathname: " + dir.getAbsolutePath());
        System.out.println("Path Exists? " + dir.exists());
        System.out.println("Parent Path Exits? " + dir.getParentFile().exists());
        
        boolean created = dir.mkdir();
        System.out.println("Directory created? " + created);
        
        System.out.println("-----------------------------");
        
        File dir1 = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\test2\\test3\\test4");
        
        System.out.println("Pathname: " + dir1.getAbsolutePath());
        System.out.println("Exits? " + dir1.exists());
        
        created = dir1.mkdirs();
        
        System.out.println("Directory created? " + created);
    }
}
