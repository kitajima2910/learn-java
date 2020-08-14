/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManager {
    String filename = "student.txt";
    List<Student> studentList = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void addStudent() {
        Student student = new Student();
        student.input(s);
        studentList.add(student);
    }

    public void showAll() {
        studentList.forEach(e -> System.out.println(e));
    }

    public void deleteStudent() {
        System.out.print("Enter StudentID: ");
        String idtmp = s.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(idtmp)) {
                studentList.remove(studentList.get(i));
            }else{
                System.out.println("Not Found StudentID...");
            }
        }
    }
    
    public void searchStudent(){
        System.out.print("Enter Search Field[name,email,phone] :");
        String tmp = s.nextLine();
        List<Student> list = studentList.stream().filter(e->e.getName().equalsIgnoreCase(tmp) ||e.getEmail().equalsIgnoreCase(tmp)||e.getPhone().equalsIgnoreCase(tmp)).collect(Collectors.toList());
        list.forEach(e ->System.out.println(e));
    }
    
    public void sortName(){
    studentList.sort((a,b)->a.getName().compareTo(b.getName()));
    studentList.forEach(e->System.out.println(e));
    }
    
    public void writeStudent(){
    new WriteData().writeDateFile(studentList, filename);
    }
    
    public void readfile() {
        try {
            File myObj = new File(filename);
            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

    public void openFile() {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("notepad.exe " + filename);
        } catch (IOException e) {
        }
    }
}
