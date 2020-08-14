/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import utils.NumberException;
import utils.StringException;
import utils.Validation;

/**
 *
 * @author Lan-T
 */
public abstract class Person {

    private String id;
    private String name;
    private int yoh;

    public Person() {
    }

    public Person(String id, String name, int yoh) {
        this.id = id;
        this.name = name;
        this.yoh = yoh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws StringException {
        if (Validation.isNotEmpty(id)) {
            this.id = id;
        } else {
            throw new StringException("Check id not empty...");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringException {
        if (Validation.isNotEmpty(name)) {
            this.name = name;
        } else {
            throw new StringException("Check name not empty...");
        }

    }

    public int getYoh() {
        return yoh;
    }

    public void setYoh(int yoh) throws NumberException {
        if(Validation.isNumberRange(String.valueOf(yoh), 1940, 2000)) {
            this.yoh = yoh;
        } else {
            throw new NumberException("Check yoh [1940-2000]...");
        }
        
    }

    public void accept(Scanner s) {
        do {
            System.out.print("Enter id: ");
            try {
                setId(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter name: ");
            try {
                setName(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter yoh: ");
            try {
                setYoh(Integer.parseInt(s.nextLine()));
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
    }

    public abstract void printInfo();
}
