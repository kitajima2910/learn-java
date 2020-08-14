/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviecs;

import data.Cylinder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class CylinderService {

    public CylinderService() {
    }
    
    public static Cylinder add(Scanner s, Cylinder c) {
        c.accept(s);
        return c;
    }
    
    public static void display(List<Cylinder> cs) {
        System.out.format("%-10s %-10s %-15s %-10s %-10s\n", "radius", "height", "peripheral", "area", "volume");
        cs.forEach(e -> e.printInfo());
    }
    
    public static void display(List<Cylinder> cs, float v) {
        System.out.format("%-10s %-10s %-15s %-10s %-10s\n", "radius", "height", "peripheral", "area", "volume");
        cs.stream().filter(e -> e.volume() > v).collect(Collectors.toList()).forEach(e -> e.printInfo());
    }
    
    public static List<Cylinder> getData() {
        List<Cylinder> cs = new ArrayList<>();
        cs.add(new Cylinder(4.5, 3.4));
        cs.add(new Cylinder(2.4, 5.3));
        cs.add(new Cylinder(4.1, 5.6));
        cs.add(new Cylinder(6.5, 2.1));
        return cs;
    }
}
