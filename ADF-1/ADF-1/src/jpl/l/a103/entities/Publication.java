/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.entities;

import java.util.Date;



/**
 *
 * @author Lan-T
 */
public abstract class Publication {
    private int publicationYear;
    private String publisher;
    private Date publicationDate;

    public Publication() {
    }

    public Publication(int publicationYear, String publisher, Date publicationDate) {
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public abstract void display();
}
