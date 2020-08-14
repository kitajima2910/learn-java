/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.entities;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Magazine extends Publication {

    private String author;
    private int volume;
    private int edition;

    public Magazine() {
    }

    public Magazine(String author, int volume, int edition) {
        this.author = author;
        this.volume = volume;
        this.edition = edition;
    }

    public Magazine(String author, int volume, int edition, int publicationYear, String publisher, Date publicationDate) {
        super(publicationYear, publisher, publicationDate);
        this.author = author;
        this.volume = volume;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    
    
    @Override
    public void display() {
        System.out.printf("%-15s %-15s  %-20s %-20s %-20d %-20s\n", super.getPublisher(), super.getPublicationYear(), new SimpleDateFormat("dd/MM/yyyy").format(super.getPublicationDate()), getAuthor(), getVolume(), getEdition());
    }
    
    public static Magazine input(Scanner s) {
        
        Magazine m = new Magazine();
        
        System.out.print("Enter publication year: ");
        m.setPublicationYear(Integer.parseInt(s.nextLine()));
        
        System.out.print("Enter publisher: ");
        m.setPublisher(s.nextLine());
        
        System.out.print("Enter publication date: ");
        
        try {
            m.setPublicationDate(new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
        System.out.print("Enter author: ");
        m.setAuthor(s.nextLine());
        System.out.print("Enter volume: ");
        m.setVolume(Integer.parseInt(s.nextLine()));
        System.out.print("Enter edition: ");
        m.setEdition(Integer.parseInt(s.nextLine()));
        
        return m;
    }
}
