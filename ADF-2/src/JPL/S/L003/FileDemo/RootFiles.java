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
public class RootFiles {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        
        for(File root : roots) {
            System.out.println(root.getAbsoluteFile());
        }
    }
}
