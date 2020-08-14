/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Lan-T
 */
public class Main {
    
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd @ MM $ yyyy");
        String day = "2020-05-12";
//        LocalDate ld = LocalDate.parse(day);
        System.out.println(dtf.format(LocalDate.parse(day)));
    }
}
