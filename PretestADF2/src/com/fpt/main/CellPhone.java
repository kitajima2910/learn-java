/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class CellPhone {
    private String cellCode;
    private String cellName;
    private double price;

    public CellPhone() {
    }

    public CellPhone(String cellCode, String cellName, double price) {
        this.cellCode = cellCode;
        this.cellName = cellName;
        this.price = price;
    }

    public String getCellCode() {
        return cellCode;
    }

    public void setCellCode(String cellCode) throws StringException {
        if(Validation.checkCode(cellCode)) {
            this.cellCode = cellCode;
        } else {
            throw new StringException("Check code...");
        }
        
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) throws StringException {
        if(Validation.checkName(cellName)) {
            this.cellName = cellName;
        } else {
            throw new StringException("Check cellName...");
        }
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws NumberException {
        if(Validation.checkPrice(price)) {
            this.price = price;
        } else {
            throw new NumberException("Check price...");
        }
        
    }

    @Override
    public String toString() {
        return "CellPhone{" + "cellCode=" + cellCode + ", cellName=" + cellName + ", price=" + price + '}';
    }
    
//    public CellPhone add(Scanner s) {
//        CellPhone cellPhone = new CellPhone();
//        
//        do {
//            System.out.print("Enter CellCode: ");
//            try {
//                cellPhone.setCellCode(s.nextLine());
//            } catch (StringException e) {
//                System.out.println(e.getMessage());
//                continue;
//            }
//            break;
//        }while(true);
//        
//        do {
//            System.out.print("Enter CellName: ");
//            try {
//                cellPhone.setCellName(s.nextLine());
//            } catch (StringException e) {
//                System.out.println(e.getMessage());
//                continue;
//            }
//            break;
//        }while(true);
//        
//        do {
//            System.out.print("Enter Price: ");
//            try {
//                cellPhone.setPrice(Double.valueOf(s.nextLine()));
//            } catch (NumberException | NumberFormatException e) {
//                System.out.println(e.getMessage());
//                continue;
//            }
//            break;
//        }while(true);
//        
//        
//        return cellPhone;
//        
//    }
    
    
}
