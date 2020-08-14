/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Student;
import utils.IDException;
import utils.PhoneException;
import utils.Validator;

/**
 *
 * @author Lan-T
 */
public class StudenServices {

    public StudenServices() {
    }

    public static List<Student> inputStudent(Scanner s, int enrollment) {

        List<Student> students = new ArrayList<>();
        String id;

        for (int i = 0; i < enrollment; i++) {
            Student student = new Student();
            System.out.println("Student ID: " + (i + 1));
            do {
                System.out.print("Enter id: ");
                id = s.nextLine();
                if (Validator.isStudenIDDifferent(students, id)) {
                    System.out.println("Check id ...");
                    continue;
                }
                try {
                    student.setId(id);
                } catch (IDException e) {
                    System.out.println(e);
                    continue;
                }
                break;
            } while (true);

            System.out.print("Enter name: ");
            student.setName(s.nextLine());

            do {
                System.out.print("Enter phone: ");
                try {
                    student.setPhone(s.nextLine());
                } catch (PhoneException e) {
                    System.out.println(e);
                    continue;
                }
                break;
            } while (true);

            System.out.print("Enter gender: ");
            student.setGender(s.nextLine());

            System.out.print("Enter gpa: ");
            student.setGpa(Double.parseDouble(s.nextLine()));

            students.add(student);
        }

        return students;
    }

}
