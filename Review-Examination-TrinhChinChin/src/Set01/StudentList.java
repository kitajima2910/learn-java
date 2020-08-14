/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author TrinhChinChin
 */
public class StudentList {
    Vector <Student> studentList;//Khai báo Vector generic tên studentList
    Student objS;//Khai báo object Student
    int id;//Khai báo lại
    String name,batch;
    double mark;
    Scanner sc;
    public final String fileName="D:\\Student.dat";
    
    FileReader fr;//Đọc file
    FileWriter fw;//Ghi file
    BufferedReader br;//Bộ đệm
    BufferedWriter bw;//Bộ đệm
    PrintWriter pw;//In file
    
    public StudentList(){
        studentList = new Vector<>();//Gọi ra ở hàm dựng
        sc = new Scanner(System.in);
    }
    public void add(){
        System.out.println("----------------------------");
        System.out.print("Enter a id : ");
        id = sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        name = sc.nextLine();
        
        sc = new Scanner(System.in);
        System.out.print("Enter a class : ");
        batch = sc.nextLine();
        
        System.out.print("Enter a mark: ");
        mark = sc.nextDouble();
        
        objS = new Student(id, name, batch, mark);//Truyền vào object trước
        studentList.add(objS);//rồi truyền vào vector studentList--Cách này siêu nhanh
    }
    public void printVector(){
        for(Student vStud1 : studentList ){
            System.out.println(vStud1.toString());
        }
    }
    public Student search(int id){//Phải search từ Student mới được nha...
        for(Student vStud1 : studentList){//Coi chừng nhằm vs bên arraylist nha search theo Vector
            if(vStud1.id==id ){
                System.out.println(vStud1.toString());//Sài này cho tiện in ra theo vector
                return vStud1;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Not found...");
        return null;
    }
    public void saveToFile(){
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for(Student vStud1 : studentList){
                pw.print(vStud1.toString()+"\r\n");//Ghi vô
            }
            pw.flush();//Quét lại
            pw.close();//Phải đóng mới chạy được
            bw.close();
            fw.close();
            try {//Runtime chạy thử file đó
                Runtime objR = Runtime.getRuntime();
                objR.exec("notepad.exe "+fileName);//Phải có dấu " "
            } catch (Exception e) {
                e.printStackTrace();
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
}
