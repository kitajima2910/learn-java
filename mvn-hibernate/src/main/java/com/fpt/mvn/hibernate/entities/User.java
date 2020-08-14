package com.fpt.mvn.hibernate.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullname;

    @Column
    private String username;

    @Column
    private String password;
    
    @Column(name = "created_at")
    private LocalDate createdAt;
    
    @Column(name = "created_at")
    private LocalDate modifiedAt;
}
