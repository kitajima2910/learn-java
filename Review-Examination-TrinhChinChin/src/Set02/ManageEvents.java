/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TrinhChinChin
 */
public class ManageEvents {

    /**
     * @param args the command line arguments
     */
    String time,place,content;
    ArrayList<Event> eArr;
    Scanner sc;
    Event objE;
    
    FileReader fr;//Đọc file
    BufferedReader br;//Bộ đệm đọc
    FileWriter fw;//Ghi file
    BufferedWriter bw;//Bộ đệm ghi
    PrintWriter pw;//In file ghi
    public final String fileName="D:\\Event.txt";
    public ManageEvents(){//Khởi tạo Generic ở đây
        eArr = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void add(){
        objE = new Event();//Truyền vô object trước
        eArr.add(objE);//Truyền vào ArrayList
        System.out.println("----------------------------");
        System.out.println("Add Successful...");
        System.out.println("----------- Print ----------");
        for(Event eArr1 : eArr){
            System.out.println(eArr1.toString()); ;//Chơi display mới in được hơi hài ^^
        }
    }
    public void open(){
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String line;
            System.out.println("----------------------------");
            while((line = br.readLine())!=null){//Ghi theo txt mới có dòng
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void save(){
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for(Event eArr1 : eArr){
                pw.print(eArr1.toString()+"\r\n");//Ghi vô
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
    public void ignore(){
        System.out.println("----------------------------");
        System.out.println("Your choice Ignore option");
    }
    public void delete(){
        eArr = new ArrayList<>();
        sc = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Delete Successful...");
    } 
    
    public static void main(String[] args) {
        ManageEvents objME = new ManageEvents();
        //Event objE = new Event();Cái này gọi event cho chạy ra đó 
        int opt;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------- Set 02 ----------");
            System.out.println("| 1. Add ");
            System.out.println("| 2. Open ");
            System.out.println("| 3. Save ");
            System.out.println("| 4. Ignore ");
            System.out.println("| 5. Delete ");
            System.out.println("| 6. Exit ");
            System.out.println("----------------------------");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();//Nhớ khai báo Scanner sc trước nhá
                switch(opt){
                    case 1:
                        objME.add();
                        break;
                    case 2:
                        objME.open();
                        break;
                    case 3:
                        objME.save();
                        break;
                    case 4:
                        objME.ignore();
                        break;
                    case 5:
                        objME.delete();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("----------------------------");
                        System.out.println("Pls choose 1-6 ");
                        
                }
        }
        
    }
    
}
