/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.final2020;

import jpl.s.l005.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lan-T
 */
public class Student implements Serializable {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private List<Grade> grades;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String id, String firstName, String lastName, int age, List<Grade> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Student> readStudent() {

        List<Student> students = new ArrayList<>();
        ReaderTool rt = new ReaderTool();
        int n;
        try {
            n = Integer.parseInt(rt.getBr().readLine());
            for (int i = 0; i < n; i++) {
                Student student = new Student();
                student.setId(rt.getBr().readLine());
                student.setFirstName(rt.getBr().readLine());
                student.setLastName(rt.getBr().readLine());
                student.setAge(Integer.valueOf(rt.getBr().readLine()));
                students.add(student);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return students;
    }

    public static void showInfoTwo() {
        ReaderTool rt = new ReaderTool(Constants.WRITE_DATA_FILE_NAME);
        int n;
        try {
            n = Integer.parseInt(rt.getBr().readLine());
            for (int i = 0; i < n; i++) {
                System.out.println("ID: " + rt.getBr().readLine());
                System.out.println("FirstName: " + rt.getBr().readLine());
                System.out.println("LastName: " + rt.getBr().readLine());
                System.out.println("Age: " + rt.getBr().readLine());
                System.out.println("Subject: " + rt.getBr().readLine());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void showInfo(List<Student> students) {
        try {
            System.out.println("\nLength studens: " + students.size());
            System.out.printf("%-10s %-15s %-15s %-5s\n", "ID", "FIRSTNAME", "LASTNAME", "AGE");
            Student.readStudent().forEach(student -> {
                System.out.printf("%-10s %-15s %-15s %-5d\n", student.getId(), student.getFirstName(), student.getLastName(), student.getAge());
            });
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static List<Student> setScore(List<Student> students) {
        students.forEach(student -> {
            List<Grade> grades = new ArrayList<>();
            System.out.println("Grade the scores for ID: " + student.getId());
            System.out.print("Enter n subject: ");
            int n = Integer.parseInt(new Scanner(System.in).nextLine());
            for (int i = 0; i < n; i++) {
                Grade g = new Grade();
                System.out.println("Subject " + (i + 1) + ": ");
                System.out.print("Name: ");
                g.setName(new Scanner(System.in).nextLine());
                System.out.print("Score: ");
                int score = Integer.parseInt(new Scanner(System.in).nextLine());
                try {
                    ScoreUtils.check(score);
                    g.setScore(score);
                } catch (ZeroException | TenException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                grades.add(g);
            }
            student.setGrades(grades);
        });
        return students;
    }

    public static void write(List<Student> students) {
        StringBuilder sb = new StringBuilder("");
        WriterTool wt = new WriterTool();
        
    sb.append(students.size()).append("\n");
        students.forEach(s -> {
            sb.append(s.getId()).append("\n");
            sb.append(s.getFirstName()).append("\n");
            sb.append(s.getLastName()).append("\n");
            sb.append(s.getAge()).append("\n");
            sb.append(s.getGrades()).append("\n");
        });

        try {
            wt.writeData(sb.toString());
            wt.getBw().close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
