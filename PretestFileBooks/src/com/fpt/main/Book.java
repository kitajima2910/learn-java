/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

/**
 *
 * @author Lan-T
 */
public class Book {
    private String bookID;
    private String category;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String bookID, String category, String title, String author, double price) {
        this.bookID = bookID;
        this.category = category;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) throws CommonException {
        if(Validation.checkBookId(bookID)) {
            this.bookID = bookID;
        } else {
            throw new CommonException("Check bookID...");
        }
        
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws CommonException {
        if(Validation.checkNotIsEmpty(title)) {
            this.title = title;
        } else {
            throw new CommonException("Check title...");
        }
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws CommonException {
        if(Validation.checkNotIsEmpty(author)) {
            this.author = author;
        } else {
            throw new CommonException("Check author...");
        }
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", category=" + category + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }
    
    
}
