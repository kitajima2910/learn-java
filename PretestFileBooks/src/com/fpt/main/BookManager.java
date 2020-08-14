/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Lan-T
 */
public class BookManager {

    private Map<String, Book> bookTreeMap = new TreeMap<>();
    private String path = "Book.txt";

    public void addNewBook(Scanner s) {
        Book b = new Book();
        do {
            System.out.print("Enter bookID: ");
            try {
                b.setBookID(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        System.out.print("Enter categary: ");
        b.setCategory(s.nextLine());

        do {
            System.out.print("Enter title: ");
            try {
                b.setTitle(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter author: ");
            try {
                b.setAuthor(s.nextLine());
            } catch (CommonException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);

        do {
            System.out.print("Enter price: ");
            try {
                b.setPrice(Double.valueOf(s.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        
        

        bookTreeMap.put(b.getBookID(), b);
    }

    public void displayAll() {
        bookTreeMap.forEach((k, v) -> System.out.println(v));
    }

    public void save() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bookTreeMap.forEach((k, v) -> {
                try {
                    bw.write(v + "\n");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            });
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void open() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
