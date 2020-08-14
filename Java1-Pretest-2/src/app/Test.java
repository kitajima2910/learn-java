/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import data.Cylinder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import serviecs.CylinderService;
import utils.Menu;

/**
 *
 * @author Lan-T
 */
public class Test {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        List<Cylinder> cs = CylinderService.getData();
        
        Menu.show();
        
        while(true) {
            System.out.print("Options[1-5]: ");
            switch(s.nextLine()) {
                case "1":
                    cs.add(CylinderService.add(s, new Cylinder()));
                    break;
                case "2":
                    CylinderService.display(cs);
                    break;
                case "3":
                    System.out.print("Enter v: ");
                    float v = Float.parseFloat(s.nextLine());
                    CylinderService.display(cs, v);
                    break;
                case "4":
                    return;
            }
        }
    }
}
