/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set02;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author TrinhChinChin
 */
public class Event implements Serializable{//Đề yêu cầu ghi vào object
    String time,place,content;
    Scanner sc;
    
    public Event(){
        System.out.print("Enter a time: ");
        sc = new Scanner(System.in);
        time = sc.nextLine();
        //Cái này tương đương vs objE.setTime(time);
        
        System.out.print("Enter a place: ");
        sc = new Scanner(System.in);
        place = sc.nextLine();
        //Cái này tương đương vs objE.setPlace(place);
        
        System.out.print("Enter a content: ");
        sc = new Scanner(System.in);
        content = sc.nextLine();
        //Cái này tương đương vs objE.setContent(content);
        
    }    

    public Event(String time, String place, String content) {
        this.time = time;
        this.place = place;
        this.content = content;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String toString(){
        return "Time: "+time+"\t\tPlace: "+place+"\tContent: "+content;//ToString k in ra được chưa hiểu lắm
    }
    
    public void display(){
        System.out.println("Time: "+time+"\t\tPlace: "+place+"\tContent: "+content);
    }
}
