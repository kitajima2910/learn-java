/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class StudentManager {
    int stuID,age;
    String firstName,lastName,strID,strAge;
    ArrayList<Student> sArr;
    Scanner sc;
    Student objS;
    
    FileReader fr;//Đọc file
    BufferedReader br;//Bộ đệm đọc
    FileWriter fw;//Ghi file
    BufferedWriter bw;//Bộ đệm ghi
    PrintWriter pw;//In file ghi
    public final String fileName="D:\\Student.txt";
    
    public StudentManager(){//Khởi tạo Generic ở đây
        sArr = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    
    public void addStudent(){
        while(true){//ID
            try {
                System.out.println("----------------------------");
                System.out.print("Enter a ID: ");
                sc = new Scanner(System.in);
                strID = sc.nextLine();
                if(strID.isEmpty()){
                    System.out.println("----------------------------");
                    throw new Exception("ID cannot be blank.Pls re-enter ");
                }
                stuID = Integer.parseInt(strID);
                if(stuID<=0){
                    System.out.println("----------------------------");
                    throw new Exception("Number must be greater than 0. ");
                }
                break;
            } 
            catch (NumberFormatException e) {
                System.out.println("----------------------------");
                System.out.println("ID must be Integer. ");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//First Name
            try {
                System.out.println("----------------------------");
                System.out.print("Enter a First Name: ");
                sc = new Scanner(System.in);
                firstName = sc.nextLine();
                if(firstName.isEmpty()){
                    System.out.println("----------------------------");
                    throw new Exception("First Name cannot be blank.Pls re-enter ");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//Last Name
            try {
                System.out.println("----------------------------");
                System.out.print("Enter a Last Name: ");
                sc = new Scanner(System.in);
                lastName = sc.nextLine();
                if(lastName.isEmpty()){
                    System.out.println("----------------------------");
                    throw new Exception("Last Name cannot be blank.Pls re-enter ");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        while(true){//Age
            try {
                System.out.println("----------------------------");
                System.out.print("Enter a Age: ");
                sc = new Scanner(System.in);
                strAge = sc.nextLine();
                if(strAge.isEmpty()){
                    System.out.println("----------------------------");
                    throw new Exception("Age cannot be blank.Pls re-enter ");
                }
                age = Integer.parseInt(strAge);
                if(age<=0){
                    System.out.println("----------------------------");
                    throw new Exception("Number must be greater than 0. ");
                }
                break;
            } 
            catch (NumberFormatException e) {
                System.out.println("----------------------------");
                System.out.println("Age must be Integer. ");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        objS = new Student(stuID, age, firstName, lastName);//Truyền vô object trước
        sArr.add(objS);//Truyền vào ArrayList
      
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for(Student sArr1 : sArr){
                pw.print(sArr1.toString()+"\r\n");
            }
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void displayList(){
        System.out.println("----------- Print ----------");
        for(Student sArr1 : sArr){
            System.out.println(sArr1.toString());
        }
    }
    
    public void readFile(){
        try {//Open
                Runtime objR = Runtime.getRuntime();
                objR.exec("notepad.exe "+fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        try {//Print out
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String line;
            System.out.println("----------------------------");
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
