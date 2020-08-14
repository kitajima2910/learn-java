/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import jpl.l.a103.utils.Validation;

/**
 *
 * @author Lan-T
 */
public class Book extends Publication {

    private String isbn;
    private Set<String> author;
    private String publicationPlace;

    public Book() {
    }

    public Book(String isbn, Set<String> author, String publicationPlace) {
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public Book(String isbn, Set<String> author, String publicationPlace, int publicationYear, String publisher, Date publicationDate) {
        super(publicationYear, publisher, publicationDate);
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(Set<String> author) {
        this.author = author;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    @Override
    public void display() {
        System.out.printf("%-15s %-15d  %-20s %-20s %-20s %-20s\n", super.getPublisher(), super.getPublicationYear(), new SimpleDateFormat("dd/MM/yyyy").format(super.getPublicationDate()), getIsbn(), getPublicationPlace(), getAuthor());
    }
    
    public static Book input(Scanner s, List<Publication> ps) {
        
        Book b = new Book();
        Set<String> a = new TreeSet<>();
        
        System.out.print("Enter publication year: ");
        b.setPublicationYear(Integer.parseInt(s.nextLine()));
        
        System.out.print("Enter publisher: ");
        b.setPublisher(s.nextLine());
        
        System.out.print("Enter publication date: ");
        try {
            b.setPublicationDate(new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
       
        String checkISBN = "";
        do {
            System.out.print("Enter isbn(678-3-16-1486): ");
            checkISBN = s.nextLine();
            
            if(!Validation.checkIsbn(checkISBN, ps)) {
                 System.out.println("Check ISBN....");
            }
            
        } while(!Validation.checkIsbn(checkISBN, ps));
        b.setIsbn(checkISBN);
        
        System.out.print("Enter author: ");
        a.add(s.nextLine());
        b.setAuthor(a);
        
        System.out.print("Enter publication place: ");
        b.setPublicationPlace(s.nextLine());
        
        return b;
    }

}
