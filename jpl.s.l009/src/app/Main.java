/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Services.CourseServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Course;
import utils.Menu;

/**
 *
 * @author Lan-T
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        
        Menu.display();
        
        do {
            System.out.print("Select: ");
            switch(s.nextLine()) {
                case "1":
                    courses = CourseServices.inputCourse(s);
                    break;
                case "3":
                    CourseServices.display(courses);
                    break;
                case "7":
                    return;
            }
        }while(true);
    }
}
