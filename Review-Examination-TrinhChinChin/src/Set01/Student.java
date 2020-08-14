/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set01;

import java.util.Scanner;

/**
 *
 * @author TrinhChinChin
 */
public class Student {
    int id;
    String name,batch;
    double mark;
    Scanner sc;
    //Tạo 1 cái default constructor ,initialize khởi tạo biến

    public Student(int id, String name, String batch, double mark) {//Set values
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.mark = mark;
    }
    
    public String toString(){
        System.out.println("----------------------------");
        return "ID: "+id+"\tName: "+name+"\tClass: "+batch+"\tMark: "+mark;
        //return là cuối cùng rồi k ghi j ở dưới nữa
        //Muốn lưu xuống dòng thì \r
    }

}
