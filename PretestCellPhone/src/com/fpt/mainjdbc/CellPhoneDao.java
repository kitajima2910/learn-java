/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainjdbc;

import com.fpt.main.CellPhone;
import com.fpt.main.CommonException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public class CellPhoneDao {
    
    public void insert(CellPhone cellPhone) {
        try {
            String query = "INSERT INTO `cellphone`(`cellCode`, `cellName`, `cellPrice`, `cellDate`, `cellProducer`, `cellEmail`) VALUES (?,?,?,?,?,?)"; 
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ps.setString(1, cellPhone.getCellCode());
            ps.setString(2, cellPhone.getCellName());
            ps.setDouble(3, cellPhone.getCellPrice());
            ps.setString(4, cellPhone.getCellDate().toString());
            ps.setString(5, cellPhone.getCellProducer());
            ps.setString(6, cellPhone.getCellEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void update(CellPhone cellPhone) {
        try {
            String query = "UPDATE `cellphone` SET `cellName`=?,`cellPrice`=?,`cellDate`=?,`cellProducer`=?,`cellEmail`=? WHERE `cellCode` = ?"; 
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ps.setString(1, cellPhone.getCellName());
            ps.setDouble(2, cellPhone.getCellPrice());
            ps.setString(3, cellPhone.getCellDate().toString());
            ps.setString(4, cellPhone.getCellProducer());
            ps.setString(5, cellPhone.getCellEmail());
            ps.setString(6, cellPhone.getCellCode());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteCellCode(String cellCode) {
        try {
            String query = "DELETE FROM `cellphone` WHERE `cellCode` = ?"; 
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ps.setString(1, cellCode);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Map<String, CellPhone> select() {
        Map<String, CellPhone> cellPhones = new TreeMap<>();
        try {
            String query = "SELECT * FROM `cellphone` WHERE 1";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                CellPhone cellPhone = new CellPhone();
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setCellPrice(rs.getDouble("cellPrice"));
                cellPhone.setCellDate(LocalDate.parse(rs.getString("cellDate")));
                cellPhone.setCellProducer(rs.getString("cellProducer"));
                cellPhone.setCellEmail(rs.getString("cellEmail"));
                cellPhones.put(cellPhone.getCellCode(), cellPhone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (CommonException ex) {
            Logger.getLogger(CellPhoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cellPhones;
    }
    
    public Map<String, CellPhone> selectName(String cellName) {
        Map<String, CellPhone> cellPhones = new TreeMap<>();
        try {
            String query = "SELECT * FROM `cellphone` WHERE `cellName` LIKE ?";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ps.setString(1, '%' + cellName + '%');
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                CellPhone cellPhone = new CellPhone();
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setCellPrice(rs.getDouble("cellPrice"));
                cellPhone.setCellDate(LocalDate.parse(rs.getString("cellDate")));
                cellPhone.setCellProducer(rs.getString("cellProducer"));
                cellPhone.setCellEmail(rs.getString("cellEmail"));
                cellPhones.put(cellPhone.getCellCode(), cellPhone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (CommonException ex) {
            Logger.getLogger(CellPhoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cellPhones;
    }
    
    public Map<String, CellPhone> selectSortCellDate() {
        Map<String, CellPhone> cellPhones = new LinkedHashMap<>();
        try {
            String query = "SELECT * FROM `cellphone` ORDER BY `cellDate` DESC";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                CellPhone cellPhone = new CellPhone();
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setCellPrice(rs.getDouble("cellPrice"));
                cellPhone.setCellDate(LocalDate.parse(rs.getString("cellDate")));
                cellPhone.setCellProducer(rs.getString("cellProducer"));
                cellPhone.setCellEmail(rs.getString("cellEmail"));
                cellPhones.put(cellPhone.getCellCode(), cellPhone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (CommonException ex) {
            Logger.getLogger(CellPhoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cellPhones;
    }
    
    public Map<String, CellPhone> selectTOP3Price() {
        Map<String, CellPhone> cellPhones = new LinkedHashMap<>();
        try {
            String query = "SELECT * FROM `cellphone` ORDER BY `cellPrice` DESC LIMIT 0, 3";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                CellPhone cellPhone = new CellPhone();
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setCellPrice(rs.getDouble("cellPrice"));
                cellPhone.setCellDate(LocalDate.parse(rs.getString("cellDate")));
                cellPhone.setCellProducer(rs.getString("cellProducer"));
                cellPhone.setCellEmail(rs.getString("cellEmail"));
                cellPhones.put(cellPhone.getCellCode(), cellPhone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (CommonException ex) {
            Logger.getLogger(CellPhoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cellPhones;
    }
    
    public CellPhone selectCode(String cellCode) {
        CellPhone cellPhone = new CellPhone();
        try {
            String query = "SELECT * FROM `cellphone` WHERE `cellCode` = ?";
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(query);
            ps.setString(1, cellCode);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setCellPrice(rs.getDouble("cellPrice"));
                cellPhone.setCellDate(LocalDate.parse(rs.getString("cellDate")));
                cellPhone.setCellProducer(rs.getString("cellProducer"));
                cellPhone.setCellEmail(rs.getString("cellEmail"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (CommonException ex) {
            Logger.getLogger(CellPhoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cellPhone;
    }
    
}
