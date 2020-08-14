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
import services.EmployeeService;
import services.Menu;
import utils.Validator;

/**
 *
 * @author Lan-T
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Person> eList = EmployeeService.getData();
        Menu.display();

        while (true) {
            System.out.print("Option[1-5]: ");
            switch (s.nextLine()) {
                case "1":
                    eList.add(EmployeeService.add(s, new Employee()));
                    break;
                case "2":
                    EmployeeService.display(eList);
                    break;
                case "3":
                    String eName;
                    do {
                        System.out.print("Enter name to search: ");
                        eName = s.nextLine();
                        if (!Validator.isStringNotEmpty(eName)) {
                            System.out.println("Check name ... ");
                            continue;
                        }
                        break;
                    } while (true);
                    EmployeeService.display(eList, eName);
                    break;
                case "4":
                    String eID;
                    do {
                        System.out.print("Enter id to remove: ");
                        eID = s.nextLine();
                        if (!Validator.isStringNotEmpty(eID)) {
                            System.out.println("Check id ... ");
                            continue;
                        }
                        break;
                    } while (true);
                    EmployeeService.remove(eList, eID);
                    break;
                case "5":
                    return;
                default:
                    break;
            }
        }

    }
}
