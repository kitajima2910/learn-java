/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.service;

import com.fpt.model.Doctor;
import com.fpt.util.WriterData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Lan-T
 */
public class DoctorService {

    public DoctorService() {
    }

    static Map<String, Doctor> doctors = new HashMap<>();

    public static void addDoctor(Scanner s) {
        Doctor doctor = new Doctor();

        do {
            System.out.print("Enter code: ");
            doctor.setCode(s.nextLine());
            if (doctors.containsKey(doctor.getCode())) {
                System.out.println("Doctor code existing!");
                continue;
            }
            break;
        } while (true);

        System.out.print("Enter name: ");
        doctor.setName(s.nextLine());

        System.out.print("Enter specitization: ");
        doctor.setSpecilization(s.nextLine());

        System.out.print("Enter hours: ");
        doctor.setHour(Integer.valueOf(s.nextLine()));

        doctors.put(doctor.getCode(), doctor);
    }

    public static void showAll() {
        if (doctors.isEmpty()) {
            System.out.println("No data!");
        } else {

            doctors.forEach((k, v) -> {
                System.out.println("Doctor code: " + v.getCode());
                System.out.println("Doctor name: " + v.getName());
                System.out.println("Doctor specitization: " + v.getSpecilization());
                System.out.println("Doctor hours: " + v.getHour());
            });

            System.out.println("Total doctor: " + doctors.size());
        }
    }

    public static void search(Scanner s) {
        System.out.print("Enter code: ");
        String code = s.nextLine();

        Map<String, Doctor> doctorsTmp = doctors.entrySet().stream().filter((e) -> code.equals(e.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (!doctorsTmp.isEmpty()) {
            doctorsTmp.forEach((k, v) -> {
                System.out.println("Doctor code: " + v.getCode());
                System.out.println("Doctor name: " + v.getName());
                System.out.println("Doctor specitization: " + v.getSpecilization());
                System.out.println("Doctor hours: " + v.getHour());
            });
        } else {
            System.out.println("No data!");
        }

    }
    
    public static void saveFile() {
        List<Doctor> doctorTmp = new ArrayList(doctors.values());
        new WriterData().writeDateFile(doctorTmp, "D:\\doctorsData.txt");
    }
    
    
    public static void openFile() {
        try {
            Runtime.getRuntime().exec("notepad.exe D:\\doctorsData.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
