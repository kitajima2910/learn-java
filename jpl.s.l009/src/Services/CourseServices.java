/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Course;
import models.Student;
import utils.IDException;

/**
 *
 * @author Lan-T
 */
public class CourseServices {

    public CourseServices() {
    }
    
    public static List<Course> inputCourse(Scanner s) {
        List<Course> courses = new ArrayList<>();
        String key;
        do {
            
            Course course = new Course();
            
            do {
                System.out.print("Enter id: ");
                try {
                    course.setId(s.nextLine());
                } catch (IDException e) {
                    System.out.println(e);
                    continue;
                }
                break;
            } while (true);
            
            System.out.print("Enter title: ");
            course.setTitle(s.nextLine());
            
            System.out.print("Enter credit: ");
            course.setCredit(Double.parseDouble(s.nextLine()));
            
            System.out.print("Enter enrollment: ");
            int enrollment = Integer.valueOf(s.nextLine());
            System.out.printf("------ LIST STUDENT OF COURSE: %s ------\n", course.getId());
            List<Student> students = StudenServices.inputStudent(s, enrollment);
            course.setStudents(students);
            
            System.out.print("Do you have cotinue [Y/N]?: ");
            key = s.nextLine();
            
            if("n".equals(key.toLowerCase())) {
                courses.add(course);
                break;
            }
            
        } while("y".equals(key.toLowerCase()));
        
        return courses;
    }
    
    public static void display(List<Course> courses) {
        System.out.println("------ COURSE LIST -------");
        courses.forEach(e -> e.printInfo());
    }
    
}
