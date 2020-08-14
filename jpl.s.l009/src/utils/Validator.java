/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import java.util.regex.Pattern;
import models.Student;

/**
 *
 * @author Lan-T
 */
public class Validator {
    
    private static final String REGEX_PHONE = "^\\d{10,}$";
    private static final String REGEX_STUDENT_ID = "^\\d{6}$";
    private static final String REGEX_COURSE_ID = "^[A-Z]{2}\\d{3}$";
    
    public static boolean isStudenIDDifferent(List<Student> students, String id) {
        return students.stream().filter(e -> id.equals(e.getId())).findAny().isPresent();
    }
    
    public static boolean isCourseID(String id) {
        return Pattern.matches(REGEX_COURSE_ID, id);
    }
    
    public static boolean isStudentID(String id) {
        return Pattern.matches(REGEX_STUDENT_ID, id);
    }
    
    public static boolean isPhone(String phone) {
        return Pattern.matches(REGEX_PHONE, phone);
    } 
}
