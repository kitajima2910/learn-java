/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TrinhChinChin
 */
public class Laptop {
    String cod,man,des;
    Scanner sc;
    
    public Laptop(){
        
    }

    public Laptop(String cod, String man, String des) {//Constructor
        this.cod = cod;
        this.man = man;
        this.des = des;
    }
    
    public void standardize(){
        String pStr1 = "IBM";
        String pStr2 = "Compaq";
        sc = new Scanner(System.in);
        Pattern objP1 = Pattern.compile(pStr1, Pattern.CASE_INSENSITIVE);
        Pattern objP2 = Pattern.compile(pStr2, Pattern.CASE_INSENSITIVE);
            
            Matcher objM = objP1.matcher(des);
            if(objM.find()){//sài find lấy đúng giá trị,matcher trùng hết
                System.out.println("IBMz");
                des = objM.replaceAll(" Lenovo ");
            }    
            objM = objP2.matcher(des);
            if(objM.find()){
                System.out.println("Compaqz");
                des = objM.replaceAll(" HP Compaq ");
                System.out.println(man);
            }
    }
    @Override
    public String toString(){
        return "Cod: "+cod+"\tMan: "+man+"\tDes: "+des;
    }
    public void display(){
        System.out.println("Cod: "+cod+"\tMan: "+man+"\tDes: "+des);
    }
    
}
