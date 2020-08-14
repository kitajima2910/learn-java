/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import utils.*;
import utils.Validator;

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

    public void setId(String id) throws StringExcetion {
        if(Validator.isStringNotEmpty(id)) {
            this.id = id;
        } else {
            throw new StringExcetion("Check id ... !");
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringExcetion {
        if(Validator.isStringNotEmpty(name)) {
            this.name = name;
        } else {
            throw new StringExcetion("Check name ... !");
        }
        
    }

    public int getYoh() {
        return yoh;
    }

    public void setYoh(int yoh) throws NumberExcetion {
        if(Validator.isYohRange(String.valueOf(yoh))) {
            this.yoh = yoh;
        } else {
            throw new NumberExcetion("Check nunber ... [1940-2000]");
        }
        
    }
    
    public void accept(Scanner s) {
        do {
            System.out.print("Enter id: ");
            
            try {
                setId(s.nextLine());
            } catch (StringExcetion e) {
                System.out.println(e);
                continue;
            }
            break;
        }while(true);
        
        do {
            System.out.print("Enter name: ");
            String name = s.nextLine();
            try {
                setName(name);
            } catch (StringExcetion e) {
                System.out.println(e);
                continue;
            }
            break;
        }while(true);
        
        String yoh;
        do {
            System.out.print("Enter yoh: ");
            yoh = s.nextLine();
            if(!Validator.isNumber(yoh)) {
                System.out.println("Check nunber ... [1940-2000]");
                continue;
            }
            try {
                setYoh(Integer.valueOf(yoh));
            } catch (NumberExcetion e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }while(true);
        
    }
    
    public abstract void printInfo();
}
