/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Lan-T
 */
public class A {
    
    private String id;
    private String name;
    private String address;

    public A() {
    }

    public A(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public A(String fullString) {
        String arrStr[] = fullString.split("-");
        A a = new A(arrStr[0], arrStr[1], arrStr[2]);
        System.out.println(a);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    @Override
    public String toString() {
        return "A{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
    
    public static void main(String[] args) {
        A a = new A("001-Hoai-HCM");
    }
    
}
