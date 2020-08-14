/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import data.Employee;
import data.Person;
import java.util.List;
import java.util.Scanner;
import sevices.EmployeeService;
import utils.Menu;

/**
 *
 * @author Lan-T
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Person> eList = EmployeeService.getData();
        
        Menu.show();
        
        while(true) {
            System.out.print("Options[1-5]: ");
            switch(s.nextLine()) {
                case "1":
                    eList.add(EmployeeService.add(s, new Employee()));
                    break;
                case "2":
                    EmployeeService.display(eList);
                    break;
                case "3":
                    System.out.print("Enter eName: ");
                    String eName = s.nextLine();
                    EmployeeService.display(eList, eName);
                    break;
                case "4":
                    System.out.print("Enter eID: ");
                    String eID = s.nextLine();
                    eList = EmployeeService.remove(eList, eID);
                    break;
                case "5":
                    return;
            }
        }
    }
}
