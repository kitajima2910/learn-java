/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientManager {

    ArrayList<Patient> patientList;
    Scanner sc;
    String ID;
    String name, sex, examDate;
    Patient objP = new Patient();
    String fileName = "D:\\Patient.txt";

    public PatientManager() {
        patientList = new ArrayList<>();

    }

    public void addNew() {
        sc = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        ID = sc.nextLine();
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new Exception("Name cannot be null!");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }

        while (true) {
            try {
                System.out.print("Enter sex(Male/Female): ");
                sex = sc.nextLine();
                if (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female")) {
                    throw new Exception("Sex only be male or female!");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }

        System.out.print("Enter an ExamDate: ");
        examDate = sc.nextLine();
        System.out.println("");

        objP = new Patient(ID, name, sex, examDate);
        patientList.add(objP);

    }

    public void display(String ID) {
        boolean check = false;

        if (patientList.isEmpty()) {
            System.out.println("List is Empty!");
            System.out.println("");
        }

        for (int i = 0; i < patientList.size(); i++) {
            if (ID.equalsIgnoreCase(patientList.get(i).ID)) {
                System.out.println(patientList.get(i).toString());
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Cannot find id to display!");
        }

    }

    public void save() {
        new WriterData().writeDateFile(patientList, fileName);
        System.out.println("Succefully...");
    }

    public void openFile() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
