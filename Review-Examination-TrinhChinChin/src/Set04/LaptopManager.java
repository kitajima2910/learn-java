/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author TrinhChinChin
 */
public class LaptopManager {
    String valueStr,cod,man,des;
    TreeMap <String,Laptop> listLaptop;//Tự soft HashMap thì không soft
    Laptop objL;
    int key; 
    Scanner sc;
    
    FileReader fr;//Đọc file
    BufferedReader br;//Bộ đệm đọc
    FileWriter fw;//Ghi file
    BufferedWriter bw;//Bộ đệm ghi
    PrintWriter pw;//In file ghi
    public final String fileName="D:\\Laptop.txt";
    /**
     * @param args the command line arguments
     */
    public LaptopManager(){
        listLaptop = new TreeMap();
        objL = new Laptop();//Cái này là object lưu 
        sc = new Scanner(System.in);
    }
    
    public void add(){
        //objLT = new Laptop();
        System.out.print("Enter a Cod: ");
        sc = new Scanner(System.in);
        cod = sc.nextLine();

        System.out.print("Enter a Man: ");
        sc = new Scanner(System.in);
        man = sc.nextLine();

        System.out.print("Enter a Des: ");
        sc = new Scanner(System.in);
        des = sc.nextLine();
        
        objL = new Laptop(cod, man, des);//Phải đi cùng với nhập
        listLaptop.put(cod, objL);
        
        Set keys = listLaptop.keySet();
        System.out.println("----------- Print ----------");
        for (Object key : keys) {//Sài fore cho hay
            System.out.println(listLaptop.get(key).toString());
        }
        System.out.println("----------------------------");
        System.out.println("Add Successful...");
    }
    
    public void search(){
        System.out.println("----------------------------");
        System.out.print("Enter a Code : ");
        sc = new Scanner(System.in);
        cod = sc.nextLine();
        Set keys = listLaptop.keySet();
        for (Object key : keys) {//Sài fore cho hay
            if(cod.equalsIgnoreCase(listLaptop.get(key).cod)){
                System.out.println(listLaptop.get(key).des);
            }
        }
        objL.standardize();
        System.out.println("----------------------------");
        System.out.println("Standardize Successful...");
        
    }
    
    public void display(){
        Set keys = listLaptop.keySet();
        //Key là phương thức của họ nhà Map
        System.out.println("----------- Print ----------");
        for (Object key : keys) {//Sài fore cho hay
            System.out.println(listLaptop.get(key).toString());
        }
    }
    
    public void save(){
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            Set keys = listLaptop.keySet();
            for(Object key : keys){
                pw.print(listLaptop.get(key).toString()+"\r\n");//Ghi vô
            }
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            try {//Runtime chạy thử file đó
                Runtime objR = Runtime.getRuntime();
                objR.exec("notepad.exe "+fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void menu(){
        Laptop objLT = new Laptop();//cái này là class
        int opt;
        String cod;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------- Set 04 ----------");
            System.out.println("| 1. Add new Laptop ");
            System.out.println("| 2. Standardize the description by the code of laptop ");
            System.out.println("| 3. Display all Laptops ");
            System.out.println("| 4. Exit ");
            System.out.println("----------------------------");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();//Nhớ khai báo Scanner sc trước nhá
                switch(opt){
                    case 1:
                        add();
                        break;
                    case 2:
                        search();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        save();
                        System.exit(0);
                    default:
                        System.out.println("----------------------------");
                        System.out.println("Pls choose 1-4 ");
                        
                }
        }
    }
    
    
    
    public static void main(String[] args) {
        LaptopManager objLM = new LaptopManager();
        objLM.menu();
    }
    
}
