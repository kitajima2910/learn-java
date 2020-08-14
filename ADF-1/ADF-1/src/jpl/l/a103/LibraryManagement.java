/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103;

import java.util.List;
import jpl.l.a103.utils.Menu;
import java.util.Scanner;
import jpl.l.a103.entities.Book;
import jpl.l.a103.entities.Magazine;
import jpl.l.a103.entities.Publication;
import jpl.l.a103.services.BookService;
import jpl.l.a103.services.MagazineService;
import jpl.l.a103.services.PublicationService;
import jpl.l.a103.utils.DataSet;
import jpl.l.a103.utils.Validation;

/**
 *
 * @author Lan-T
 */
public class LibraryManagement {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Menu.display();
        List<Publication> ps = DataSet.getData();
        
        while(true) {
            String n;
            do {
                System.out.print("Please choose function you'd like to do: ");
                n = s.nextLine();
                if(!Validation.checkNumber(n)) {
                    System.out.println("Check number....");
                }
            } while(!Validation.checkNumber(n));
            
            switch(Integer.parseInt(n)) {
                case 1:
                    ps.add(BookService.addBook(Book.input(s, ps)));
                    break;
                case 2:
                    ps.add(MagazineService.addMagazine(Magazine.input(s)));
                    break;
                case 3:
                    PublicationService.display(ps);
                    break;
                case 4:
                    ps = PublicationService.addAuthorForBook(s, ps);
                    break;
                case 5:
                    PublicationService.displayTOP10(ps);
                    break;
                case 6:
                    PublicationService.displaySearchBook(s, ps);
                    break;
                default:
                    return;
            }
        }
        
    }
}
