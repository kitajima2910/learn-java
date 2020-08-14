/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Lan-T
 */
public class CellPhoneManager {

    Map<String, CellPhone> cellPhones = new TreeMap<>();
    String path = "cellPhone.txt";

    public void addCellPhone(Scanner s) {
        
        CellPhone cellPhone = new CellPhone();
        
        do {
            System.out.print("Enter CellCode: ");
            try {
                cellPhone.setCellCode(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(cellPhones.containsKey(cellPhone.getCellCode())) {
                System.out.println("Had key...");
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter CellName: ");
            try {
                cellPhone.setCellName(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter Price: ");
            try {
                cellPhone.setPrice(Double.valueOf(s.nextLine()));
            } catch (NumberException | NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        cellPhones.put(cellPhone.getCellCode(), cellPhone);
    }

    public void showAll() {
//        cellPhones.forEach((k, v) -> System.out.println(k + ": " + v));
        
    }

    public void save() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            cellPhones.forEach((k, v) -> {
                try {
                    bw.write(v.toString() + "\n");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void open() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteId(Scanner s) {
        System.out.print("Delete CellCode: ");
        String code = s.nextLine();
        if(cellPhones.containsKey(code)) {
            cellPhones.remove(code);
        } else {
            System.out.println("Not found!!!");
        }
        
    }

}
