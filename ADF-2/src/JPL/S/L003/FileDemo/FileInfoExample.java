/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L003.FileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Lan-T
 */
public class FileInfoExample {

    public static void main(String[] args) throws IOException {
        File apath = new File("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\pigame.sql");

        System.out.println("Path exists? " + apath.exists());

        apath.createNewFile();

        if (apath.exists()) {
            
            System.out.println("\n------- CONTENTS -------");
            try {
                FileInputStream fis = new FileInputStream(apath);
                int ch = 0;
                while ((ch = fis.read()) > -1) {
                    System.out.printf("%c", ch);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("\n------------------------");

            System.out.println("Directory? " + apath.isDirectory());

            System.out.println("Heiden? " + apath.isHidden());

            System.out.println("Simple Name? " + apath.getName());

            System.out.println("Absolute Path? " + apath.getAbsolutePath());

            System.out.println("Length (bytes): " + apath.length());

            long lastModifyMillis = apath.lastModified();
            Date lastModifyDate = new Date(lastModifyMillis);

            System.out.println("Last modify date: " + lastModifyDate);
        }
    }
}
