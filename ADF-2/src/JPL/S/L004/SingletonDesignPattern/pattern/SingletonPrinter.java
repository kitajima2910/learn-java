/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L004.SingletonDesignPattern.pattern;

/**
 *
 * @author Lan-T
 */
public class SingletonPrinter {

    private String name;
    private String ipAddress;
    private String location;

    private static SingletonPrinter instance = new SingletonPrinter("LA", "10.14.15.16", "Western Wing");

    private SingletonPrinter(String name, String ipAddress, String location) {
        this.name = name;
        this.ipAddress = ipAddress;
        this.location = location;
        System.out.println("Created a printer....");
    }

    public String getName() {
        return name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLocation() {
        return location;
    }

    public static SingletonPrinter getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonPrinter{" + "name=" + name + ", ipAddress=" + ipAddress + ", location=" + location + '}';
    }

}
