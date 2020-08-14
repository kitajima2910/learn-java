/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevices;

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
    
    public static List<Person> remove(List<Person> ps, String eID) {
        ps.removeIf(e -> eID.equals(e.getId()));
        return ps;
    }
    
    public static void display(List<Person> ps, String eName) {
        System.out.format("%-10s %-10s %-10s %-10s %-10s %-15s %-10s\n", "Id", "Name", "Yoh", "Position", "Salary", "WorkedDays", "income");
        ps.stream().filter(e -> eName.toLowerCase().contains(e.getName().toLowerCase())).collect(Collectors.toList()).forEach(e -> e.printInfo());
    }
    
    public static Person add(Scanner s, Employee e) {
        e.accept(s);
        return e;
    }
    
    public static void display(List<Person> ps) {
        System.out.format("%-10s %-10s %-10s %-10s %-10s %-15s %-10s\n", "Id", "Name", "Yoh", "Position", "Salary", "WorkedDays", "income");
        ps.forEach(e -> e.printInfo());
    }
    
    public static List<Person> getData() {
        List<Person> eList = new ArrayList<>();
        
        eList.add(new Employee(2000, 22, "Manager", "001", "Hoai", 1995));
        eList.add(new Employee(1000, 10, "Senior", "002", "Lan", 2000));
        
        return eList;
    }
}
