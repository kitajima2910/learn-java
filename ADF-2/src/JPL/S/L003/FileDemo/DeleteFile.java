/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L003.FileDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Lan-T
 */
public class DeleteFile {
    public static void main(String[] args) {
        try {
            Files.deleteIfExists(Paths.get("D:\\FPT-Aptech\\Sem02\\T1.1910.M3\\ADF-2\\src\\JPL\\S\\L003\\FileDemo\\Test.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Deleted successfully");
    }
}
