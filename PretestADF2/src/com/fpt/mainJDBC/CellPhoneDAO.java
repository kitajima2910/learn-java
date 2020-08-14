/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainJDBC;

import com.fpt.main.NumberException;
import com.fpt.main.StringException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class CellPhoneDAO implements CellPhoneImplement<CellPhone> {

    private final String INSERT = "INSERT INTO `cellphone`(`cellCode`, `cellName`, `price`) VALUES (?,?,?)";
    private final String SELECT = "SELECT * FROM `cellphone`";
    private final String DELETE = "DELETE FROM `cellphone` WHERE `cellCode` = ?";
    private final String UPDATE = "UPDATE `cellphone` SET `cellName`=?,`price`=? WHERE `cellCode` = ?";

    @Override
    public void insert(CellPhone cellPhone) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(INSERT);
            ps.setString(1, cellPhone.getCellCode());
            ps.setString(2, cellPhone.getCellName());
            ps.setDouble(3, cellPhone.getPrice());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<CellPhone> findAll() {

        List<CellPhone> cellPhones = new ArrayList<>();

        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(SELECT);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CellPhone cellPhone = new CellPhone();
                cellPhone.setCellCode(rs.getString("cellCode"));
                cellPhone.setCellName(rs.getString("cellName"));
                cellPhone.setPrice(rs.getDouble("price"));
                cellPhones.add(cellPhone);
            }

        } catch (NumberException | StringException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return cellPhones;
    }
    
    public static void main(String[] args) {
        CellPhoneDAO aO = new CellPhoneDAO();
        List<CellPhone> cellPhones = aO.findAll();
        cellPhones.forEach(System.out::println);
    }

    @Override
    public void delete(String code) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(DELETE);
            ps.setString(1, code);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(String code, CellPhone m) {
        try {
            PreparedStatement ps = JDBCConnection.getInstance().getConn().prepareStatement(UPDATE);
            ps.setString(1, m.getCellName());
            ps.setDouble(2, m.getPrice());
            ps.setString(3, code);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
