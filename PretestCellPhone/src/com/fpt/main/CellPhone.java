/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.time.LocalDate;

/**
 *
 * @author Lan-T
 */
public class CellPhone {

    private String cellCode;
    private String cellName;
    private double cellPrice;
    private LocalDate cellDate;
    private String cellProducer;
    private String cellEmail;

    public CellPhone() {
    }

    public CellPhone(String cellCode, String cellName, double cellPrice, LocalDate cellDate, String cellProducer, String cellEmail) {
        this.cellCode = cellCode;
        this.cellName = cellName;
        this.cellPrice = cellPrice;
        this.cellDate = cellDate;
        this.cellProducer = cellProducer;
        this.cellEmail = cellEmail;
    }

    public String getCellCode() {
        return cellCode;
    }

    public void setCellCode(String cellCode) throws CommonException {
        if (Validation.checkCellCode(cellCode)) {
            this.cellCode = cellCode;
        } else {
            throw new CommonException("Check code[Cxxxx-xxx]...");
        }

    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) throws CommonException {
        if (Validation.checkCellName(cellName)) {
            this.cellName = cellName;
        } else {
            throw new CommonException("Check cellName...");
        }

    }

    public double getCellPrice() {
        return cellPrice;
    }

    public void setCellPrice(double cellPrice) throws CommonException {
        if (Validation.checkPrice(cellPrice)) {
            this.cellPrice = cellPrice;
        } else {
            throw new CommonException("Check cellPrice...");
        }

    }

    public LocalDate getCellDate() {
        return cellDate;
    }

    public void setCellDate(LocalDate cellDate) throws CommonException {
        if (Validation.checkCellDate(cellDate)) {
            this.cellDate = cellDate;
        } else {
            throw new CommonException("Check cellDate...");
        }

    }

    public String getCellProducer() {
        return cellProducer;
    }

    public void setCellProducer(String cellProducer) throws CommonException {
        if (Validation.checkCellProducer(cellProducer)) {
            this.cellProducer = cellProducer;
        } else {
            throw new CommonException("Check cellProducer...");
        }

    }

    public String getCellEmail() {
        return cellEmail;
    }

    public void setCellEmail(String cellEmail) throws CommonException {
        if (Validation.checkCellEmail(cellEmail)) {
            this.cellEmail = cellEmail;
        } else {
            throw new CommonException("Check cellEmail...");
        }

    }

    @Override
    public String toString() {
        return "CellPhone{" + "cellCode=" + cellCode + ", cellName=" + cellName + ", cellPrice=" + cellPrice + ", cellDate=" + cellDate + ", cellProducer=" + cellProducer + ", cellEmail=" + cellEmail + '}';
    }

}
