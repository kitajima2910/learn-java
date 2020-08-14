/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.l.a103.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jpl.l.a103.entities.Book;
import jpl.l.a103.entities.Magazine;
import jpl.l.a103.entities.Publication;

/**
 *
 * @author Lan-T
 */
public class DataSet {

    public DataSet() {
    }

    public static List<Publication> getData() {
        List<Publication> ps = new ArrayList<>();

        try {
            Set<String> a = new TreeSet<>();
            a.add("HoaiPX01");
            a.add("HoaiPX02");
            ps.add(new Book("323-3-43-4354", a, "hn01", 2010, "ha noi 01", new SimpleDateFormat("dd/MM/yyyy").parse("22/05/2020")));
            Set<String> b = new TreeSet<>();
            b.add("HoaiPX03");
            ps.add(new Book("323-3-43-2754", b, "hn01", 2020, "ha noi 01", new SimpleDateFormat("dd/MM/yyyy").parse("22/02/2020")));
        } catch (ParseException e) {
            System.out.println(e);
        }

        Set<String> c = new TreeSet<>();
        c.add("HoaiPX14");
        c.add("HoaiPX15");
        ps.add(new Book("323-3-43-2334", c, "hn31", 2020, "ha noi 31", new Date()));
        Set<String> d = new TreeSet<>();
        d.add("HoaiPX41");
        ps.add(new Book("323-3-43-2324", d, "hn51", 2020, "ha noi 51", new Date()));
        Set<String> e = new TreeSet<>();
        e.add("HoaiPX11");
        e.add("HoaiPX12");
        ps.add(new Book("323-3-43-2364", e, "hn11", 2020, "ha noi 11", new Date()));

        ps.add(new Magazine("TS01", 324, 39, 1995, "sg01", new Date()));
        ps.add(new Magazine("TS02", 436, 58, 1996, "sg02", new Date()));
        ps.add(new Magazine("TS03", 743, 32, 1997, "sg03", new Date()));
        ps.add(new Magazine("TS04", 823, 23, 1998, "sg04", new Date()));
        ps.add(new Magazine("TS05", 292, 23, 1999, "sg05", new Date()));
        ps.add(new Magazine("TS06", 832, 48, 2000, "sg06", new Date()));
        ps.add(new Magazine("TS07", 123, 57, 2001, "sg07", new Date()));
        ps.add(new Magazine("TS08", 127, 34, 2002, "sg08", new Date()));
        ps.add(new Magazine("TS09", 389, 35, 2003, "sg09", new Date()));
        ps.add(new Magazine("TS10", 348, 10, 2004, "sg10", new Date()));
        ps.add(new Magazine("TS11", 124, 21, 2005, "sg11", new Date()));
        ps.add(new Magazine("TS12", 543, 78, 2006, "sg12", new Date()));
        ps.add(new Magazine("TS13", 543, 12, 2007, "sg13", new Date()));
        ps.add(new Magazine("TS14", 478, 23, 2008, "sg14", new Date()));
        return ps;
    }
    
    public static void main(String[] args) {
        List<Publication> ps = DataSet.getData();
        
        List<Publication> tmp1 = ps.stream().filter(e -> e instanceof Magazine).collect(Collectors.toList());
        List<Publication> tmp2 = ps.stream().filter(e -> e instanceof Book).collect(Collectors.toList());
        
//        List<Publication> combines = Stream.of(tmp1, tmp2).flatMap(e -> e.stream()).collect(Collectors.toList());
          tmp1.addAll(tmp2);
          System.out.println(tmp1.get(tmp2.size() - 1 ).getPublisher());
//        tmp1.forEach(e -> System.out.println(e.getPublisher()));
        
        
//        LocalDate ld = LocalDate.parse("2020-05-08",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        
//        System.out.println(ld);
        
        
//        List<Publication> ps = DataSet.getData();
        
//        List<String> psStr = ps.stream().map(Publication::getPublisher).collect(Collectors.toList());
//        psStr.forEach(System.out::println);
//        String psStr = ps.stream().filter(e -> "sg11".equals(e.getPublisher())).map(Publication::getPublicationDate).findAny().orElse(new Date()).toString();
//        System.out.println(psStr);
//        List<Integer> psStr = ps.stream().filter(e -> "ha noi 01".equals(e.getPublisher())).map(Publication::getPublicationYear).collect(Collectors.toList());
//        psStr.forEach(System.out::println);
        
        
//        Publication psTMP = ps.stream().filter(e -> "sg01".equals(e.getPublisher())).findAny().orElse(null);
//        if(psTMP == null) {
//            System.out.println("NULL");
//        } else {
//            System.out.println(((Magazine)psTMP).getVolume());
//        }
        
//        List<Publication> psTMP = ps.stream().filter(e -> !"ha noi 01".equals(e.getPublisher())).collect(Collectors.toList()); 
//        psTMP.forEach(e -> e.display());
    }
    
    private static Publication getPublicationByPublisher(List<Publication> ps, String filter) {
        Publication psTMP = null;
        for(Publication e : ps) {
            if(filter.equals(e.getPublisher())) {
                psTMP = e;
            }
        }
        return psTMP;
    }
    
    // Loại: ha noi 01
    // Cách cũ
    private static List<Publication> getFilterOutput(List<Publication> ps, String filter) {
        List<Publication> psTMP = new ArrayList<>();
        ps.stream().filter((e) -> (!filter.equals(e.getPublisher()))).forEachOrdered((e) -> {
            psTMP.add(e);
        });
        return psTMP;
    }
    
}
