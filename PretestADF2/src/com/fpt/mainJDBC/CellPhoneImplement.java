/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mainJDBC;

import java.util.List;

/**
 *
 * @author Lan-T
 */
public interface CellPhoneImplement<M> {
    
    void insert(M m);
    
    List<M> findAll();
    
    void delete(String code);
    
    void update(String code, M m);
    
}
