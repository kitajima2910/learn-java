/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mvn.hibernate.main;

import com.fpt.mvn.hibernate.entities.User;
import com.fpt.mvn.hibernate.utils.HibernateUtils;
import java.time.LocalDate;
import org.hibernate.Session;

/**
 *
 * @author Lan-T
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setFullname("Hibernate Example");
        user.setUsername("fpt");
        user.setPassword("123456");
        user.setCreatedAt(LocalDate.now());
        user.setModifiedAt(LocalDate.now());
        
        insertUser(user);
    }

    public static void insertUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            // Begin a unit of work
            session.beginTransaction();

            // Insert user
            Long userId = (Long) session.save(user);
            System.out.println("User id = " + userId);

            // Commit the current resource transaction, writing any unflushed changes to the database.
            session.getTransaction().commit();
        }
    }

}
