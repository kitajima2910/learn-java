/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TrinhChinChin
 */
public class DoctorManager {
    Doctor objD;
    HashMap doctorMap;
    Scanner sc;
    String valueStr,name,specialty,id,hourStr;
    int keyInt,key,hourExam;
    Set keys;
    
    String pStr = "B\\d{4}";//Escape character
    Pattern objP = Pattern.compile(pStr, Pattern.CASE_INSENSITIVE);
    
    FileReader fr;//Đọc file
    BufferedReader br;//Bộ đệm đọc
    FileWriter fw;//Ghi file
    BufferedWriter bw;//Bộ đệm ghi
    PrintWriter pw;//In file ghi
    public final String fileName="D:\\Doctor.txt";
    public DoctorManager(){
        doctorMap = new HashMap();//Khớ khởi tạo mới chạy nha
        sc = new Scanner(System.in);
    }    
    public void addDoctor(){
        while(true){//ID
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a ID: ");
                id = sc.nextLine();
                if(id.isEmpty()){
                    throw new Exception("ID cannot be blank.Pls re-enter ");
                }
                Matcher objM = objP.matcher(id);
                if(!objM.find()){//sài find lấy đúng giá trị,matcher trùng hết
                    throw new Exception("Wrong format.Pls re-enter");
                }    
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//Name
            try {
                System.out.print("Enter a Name: ");
                sc = new Scanner(System.in);
                name = sc.nextLine();
                if(name.isEmpty()){
                    throw new Exception("Name cannot be blank.Pls re-enter ");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//Name
            try {
                System.out.print("Enter a Specialty: ");
                sc = new Scanner(System.in);
                specialty = sc.nextLine();
                if(specialty.isEmpty()){
                    throw new Exception("Specialty cannot be blank.Pls re-enter ");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//hourExam
            try {
                System.out.print("Enter a hourExam: ");
                sc = new Scanner(System.in);
                hourStr = sc.nextLine();
                if(hourStr.isEmpty()){
                    throw new Exception("ID cannot be blank.Pls re-enter ");
                }
                hourExam = Integer.parseInt(hourStr);
                if(hourExam<=0){
                    System.out.println("HourExam must be greater tahn 0. ");
                }
                break;
            } 
            catch (NumberFormatException e) {
                System.out.println("HourExam must be number. ");;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        
        objD = new Doctor(hourExam, id, name, specialty);
        doctorMap.put(id, objD);

        Set keys = doctorMap.keySet();//Trả về 1 set tất cả cái key cho map
        System.out.println("----------- Print ----------");
        for (Object key : keys) {//Hay
            System.out.println(doctorMap.get(key).toString());
        }
        System.out.println("Add Successful...");
    }
    
    public void search(String id){
        keys = doctorMap.keySet();//Trả ra 1 tập hợp key
        if(keys.contains(id)){//Nếu như tìm được id trong key
            System.out.println("----------------------------");
            System.out.println(doctorMap.get(id).toString());
        }else{
            System.out.println("----------------------------");
            System.out.println("Not found. ");
        }
    }
    
    public void save(){
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for(Object key : keys){
                pw.print(doctorMap.get(key).toString()+"\r\n");//Ghi vô
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
        DoctorManager objDM = new DoctorManager();
        int opt;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------- Set 03 ----------");
            System.out.println("| 1. Add new Doctor ");
            System.out.println("| 2. Search doctor ");
            System.out.println("| 3. Save file ");
            System.out.println("| 4. Exit ");
            System.out.println("----------------------------");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();//Nhớ khai báo Scanner sc trước nhá
                switch(opt){
                    case 1:
                        objDM.addDoctor();
                        break;
                    case 2:
                        System.out.println("----------------------------");
                        System.out.print("Enter a id : ");
                        id = sc.nextLine();
                        objDM.search(id);
                        break;
                    case 3:
                        objDM.save();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("----------------------------");
                        System.out.println("Pls choose 1-4 ");
                        
                }
        }
    }
    
}
