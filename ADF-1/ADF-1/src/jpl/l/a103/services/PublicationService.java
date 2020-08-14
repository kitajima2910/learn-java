/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.services;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import jpl.l.a103.entities.Book;
import jpl.l.a103.entities.Magazine;
import jpl.l.a103.entities.Publication;

/**
 *
 * @author Lan-T
 */
public class PublicationService {

    public PublicationService() {
    }

    public static void display(List<Publication> ps) {
        System.out.println();
        System.out.printf("%-15s %-15s %-20s %-20s %-20s %-20s\n", "PUBLISHER", "PUBLICATION-YEAR", "PUBLICATION-DATE", "ISBN", "PUBLICATION-PLACE", "AUTHOR");
        ps.forEach(e -> {
            if (e instanceof Book) {
                e.display();
            }
        });
        System.out.printf("%-15s %-15s %-20s %-20s %-20s %-20s\n", "PUBLISHER", "PUBLICATION-YEAR", "PUBLICATION-DATE", "AUTHOR", "VOLUMNE", "EDITION");
        ps.forEach(e -> {
            if (e instanceof Magazine) {
                e.display();
            }
        });
        System.out.println();
    }

    public static List<Publication> addAuthorForBook(Scanner s, List<Publication> ps) {

        System.out.print("Enter isbn: ");
        String isbn = s.nextLine();
        
        List<Publication> tmp = ps.stream().filter(e -> e instanceof Book).collect(Collectors.toList());
        
        Publication b = tmp.stream().filter(e -> isbn.equals(((Book)e).getIsbn())).findAny().orElse(null);

        if (b == null) {
            System.out.println("No books found with this isbn: " + isbn);
        } else {
            Book bTmp = ((Book)b); 
            
            int index = -1;
            for (int i = 0; i < tmp.size(); i++) {
                if (((Book) tmp.get(i)).getIsbn().equals(bTmp.getIsbn())) {
                    index = i;
                }
            }

            if (index != -1) {
                System.out.print("Add author for isbn is " + isbn + ": ");
                String name = s.nextLine();
                String code = ((Book) tmp.get(index)).getAuthor().stream().filter(e -> name.equalsIgnoreCase(e)).collect(Collectors.joining(""));
                if (code.length() == 0) {
                    ((Book) tmp.get(index)).getAuthor().add(name);
                    System.out.println("Add successfully");
                } else {
                    System.out.println("Author existed");
                }

            }
        }

        return ps;
    }

    public static void displayTOP10(List<Publication> ps) {
        List<Publication> psTmp = ps.stream().filter(e -> e instanceof Magazine).collect(Collectors.toList());

        psTmp.sort((e1, e2) -> -(((Magazine) e1).getVolume() - ((Magazine) e2).getVolume()));

        System.out.println("\nTOP 10:");
        System.out.printf("%-15s %-15s %-20s %-20s %-20s %-20s\n", "PUBLISHER", "PUBLICATION-YEAR", "PUBLICATION-DATE", "AUTHOR", "VOLUMNE", "EDITION");
        for (int i = 0; i < 10; i++) {
            psTmp.get(i).display();
        }
        System.out.println();
    }

    public static void displaySearchBook(Scanner s, List<Publication> ps) {
        System.out.print("Enter (isbn, author, publisher): ");
        String key = s.nextLine();

        List<Publication> psTmp = ps.stream().filter(e -> e instanceof Book).collect(Collectors.toList());

        System.out.printf("\n%-15s %-15s %-20s %-20s %-20s %-20s\n", "PUBLISHER", "PUBLICATION-YEAR", "PUBLICATION-DATE", "ISBN", "PUBLICATION-PLACE", "AUTHOR");
        psTmp = psTmp.stream().filter(e -> key.equalsIgnoreCase(((Book) e).getIsbn()) || key.equalsIgnoreCase(((Book) e).getPublisher())
                || key.equalsIgnoreCase(((Book) e).getAuthor().stream().filter(a -> key.equalsIgnoreCase(a)).collect(Collectors.joining(""))))
                .collect(Collectors.toList());
        psTmp.sort((e1, e2) -> e1.getPublicationDate().compareTo(e2.getPublicationDate()));
        psTmp.forEach(e -> e.display());
        System.out.println();
    }
}
