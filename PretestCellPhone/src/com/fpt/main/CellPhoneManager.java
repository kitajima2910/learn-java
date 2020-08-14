/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import com.fpt.mainjdbc.CellPhoneDao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public class CellPhoneManager {

    private CellPhoneDao cpd = new CellPhoneDao();
    private Map<String, CellPhone> cellPhones = new TreeMap<>();
    private Map<String, CellPhone> cellPhones02 = cpd.select();
    private final String path = "cellphone.txt"; 

    public void addJDBC(Scanner s) {
        CellPhone cellPhone = new CellPhone();

        do {
            System.out.print("Enter CellCode: ");
            try {
                cellPhone.setCellCode(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(cellPhones02.containsKey(cellPhone.getCellCode())) {
                System.out.println("Had key...");
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellName: ");
            try {
                cellPhone.setCellName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellPrice: ");
            try {
                cellPhone.setCellPrice(Double.valueOf(s.nextLine()));
            } catch (CommonException | NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellDate: ");
            try {
                cellPhone.setCellDate(LocalDate.parse(s.nextLine()));
            } catch (CommonException | DateTimeParseException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellProducer: ");
            try {
                cellPhone.setCellProducer(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellEmail: ");
            try {
                cellPhone.setCellEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        cpd.insert(cellPhone);

    }
    
    public void add(Scanner s) {
        CellPhone cellPhone = new CellPhone();

        do {
            System.out.print("Enter CellCode: ");
            try {
                cellPhone.setCellCode(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(cellPhones.containsKey(cellPhone.getCellCode())) {
                System.out.println("Had key...");
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellName: ");
            try {
                cellPhone.setCellName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellPrice: ");
            try {
                cellPhone.setCellPrice(Double.valueOf(s.nextLine()));
            } catch (CommonException | NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellDate: ");
            try {
                cellPhone.setCellDate(LocalDate.parse(s.nextLine()));
            } catch (CommonException | DateTimeParseException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellProducer: ");
            try {
                cellPhone.setCellProducer(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellEmail: ");
            try {
                cellPhone.setCellEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        cellPhones.put(cellPhone.getCellCode(), cellPhone);

    }
    
    public void showWithNameJDBC(Scanner s) {
        String cellName;
        do {
            System.out.print("Enter CellName: ");
            cellName = s.nextLine();
            if(!Validation.checkNotIsEmpty(cellName)) {
                System.out.println("Check cellName...");
                continue;
            }
            break;
        } while(true);
        Map<String, CellPhone> cellPhoneTMP = cpd.selectName(cellName);
        if(!cellPhoneTMP.isEmpty()) {
            cellPhoneTMP.forEach((k, v) -> System.out.println(v));
        } else {
            System.out.println("Not found!!!!");
        }
    }
    
    public void showWithCodeJDBC(Scanner s) {
        String cellCode;
        do {
            System.out.print("Enter CellCode: ");
            cellCode = s.nextLine();
            if(!Validation.checkNotIsEmpty(cellCode)) {
                System.out.println("Check code...");
                continue;
            }
            break;
        } while(true);
        if(cellPhones02.containsKey(cellCode)) {
            System.out.println(cpd.selectCode(cellCode));
        } else {
            System.out.println("Not found!!!!");
        }
    }
    
    public void deleteCellCodeJDBC(Scanner s) {
        String cellCode;
        do {
            System.out.print("Enter CellCode: ");
            cellCode = s.nextLine();
            if(!Validation.checkNotIsEmpty(cellCode)) {
                System.out.println("Check code...");
                continue;
            }
            break;
        } while(true);
        if(cpd.select().containsKey(cellCode)) {
            cpd.deleteCellCode(cellCode);
        } else {
            System.out.println("Not found!!!!");
        }
    }
    
    public void updateJDBC(Scanner s) {
        CellPhone cellPhone = new CellPhone();
        do {
            System.out.print("Enter CellCode: ");
            try {
                cellPhone.setCellCode(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if(!cpd.select().containsKey(cellPhone.getCellCode())) {
                System.out.println("Not key...");
                continue;
            }
            break;
        } while(true);
        
        do {
            System.out.print("Enter CellName: ");
            try {
                cellPhone.setCellName(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellPrice: ");
            try {
                cellPhone.setCellPrice(Double.valueOf(s.nextLine()));
            } catch (CommonException | NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellDate: ");
            try {
                cellPhone.setCellDate(LocalDate.parse(s.nextLine()));
            } catch (CommonException | DateTimeParseException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellProducer: ");
            try {
                cellPhone.setCellProducer(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter CellEmail: ");
            try {
                cellPhone.setCellEmail(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        cpd.update(cellPhone);
    }
    
    public void showTOP3PriceJDBC() {
        cpd.selectTOP3Price().entrySet().forEach(e -> System.out.println(e.getValue()));
    }
    
    public void showAllSortDateJDBC() {
        cpd.selectSortCellDate().forEach((k, v) -> System.out.println(v));
    }
    
    public void showAllJDBC() {
        cpd.select().forEach((k, v) -> System.out.println(v));
    }
    
    public void showAll() {
        cellPhones.forEach((k, v) -> System.out.println(v));
    }
    
    public void saveFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            cellPhones.forEach((k, v) -> {
                try {
                    bw.write(v + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(CellPhoneManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(CellPhoneManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String record;
            while((record = br.readLine()) != null) {
                System.out.println(record);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CellPhoneManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CellPhoneManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteCode(Scanner s) {
        String cellCode;
        do {
            System.out.print("Enter CellCode: ");
            cellCode = s.nextLine();
            if(!Validation.checkNotIsEmpty(cellCode)) {
                continue;
            }
            break;
        } while(true);
        if(cellPhones.containsKey(cellCode)) {
            cellPhones.remove(cellCode);
        } else {
            System.out.println("Not found!!!!");
        }
    }
    
    public void openFile() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException ex) {
            Logger.getLogger(CellPhoneManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
