/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.interfaces;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Lan-T
 */
public interface IDAO<T> {
    
    void save(T t);

    void update(T t);

    List<T> getAll();

    T get(int id);

    void delete(int id);
}
