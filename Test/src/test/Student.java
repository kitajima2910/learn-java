/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Scanner;


public class Student {
    private String id ;
    private String name;
    private String email;
    private String phone ;

    public Student() {
    }

    public Student(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (Validation.checkId(id)) {
              this.id = id;
        } else {
            throw new StringException("Check ID...");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringException {
        if (Validation.checkName(name)) {
            this.name = name;
        }else{
            throw  new StringException("check Name...");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws StringException {
        if (Validation.checkMail(email)) {
            this.email = email;
        } else {
            throw new StringException("check Email...");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws StringException {
        if (Validation.checkPhone(phone)) {
             this.phone = phone;
        } else {
            throw new StringException("check Phone...");
        }
    }

    public void input(Scanner s){
        do {            
            System.out.print("Enter ID:");
            try {
                setId(s.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }break;
        } while (true);
        
         do {            
            System.out.print("Enter Name:");
            try {
                setName(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }break;
        } while (true);
         
          do {            
            System.out.print("Enter Email:");
            try {
                setEmail(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }break;
        } while (true);
           do {            
            System.out.print("Enter Phone:");
            try {
                setPhone(s.nextLine());
            } catch (StringException e) {
                System.out.println(e.getMessage());
                continue;
            }break;
        } while (true);
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
}
