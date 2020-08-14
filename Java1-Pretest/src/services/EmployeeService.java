/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Employee;
import data.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class EmployeeService {

    public EmployeeService() {
    }
    
    public static List<Person> remove(List<Person> eList, String eID) {
        eList.removeIf(e -> eID.equals(e.getId()));
        return eList;
    }

    public static Employee add(Scanner s, Employee e) {
        e.accept(s);
        return e;
    }

    public static void display(List<Person> eList, String eName) {
        eList.stream().filter(e -> eName.contains(e.getName())).collect(Collectors.toList()).forEach(e -> e.printInfo());
    }

    public static void display(List<Person> eList) {
        eList.forEach(e -> e.printInfo());
    }

    public static List<Person> getData() {
        List<Person> eList = new ArrayList<>();
        eList.add(new Employee(3224, 25, "Manager", "001", "HoaiPX", 1995));
        eList.add(new Employee(2533, 25, "Manager", "002", "LanTTM", 2000));
        eList.add(new Employee(324, 20, "Fresher", "003", "HueHTN", 1996));
        return eList;
    }
}
