package Set01;


import Set01.Student;
import Set01.StudentList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrinhChinChin
 */
public class StudentManager {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student objS;
        StudentList objSL = new StudentList();//Chuyển vector thành object để lấy method
        int opt,id;
        String name,batch;
        double mark;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------- Set 01 ----------");
            System.out.println("| 1. Add new Student ");
            System.out.println("| 2. Display student list ");
            System.out.println("| 3. Search a student by ID ");
            System.out.println("| 4. Save to file ");
            System.out.println("| 5. Quit ");
            System.out.println("----------------------------");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();//Nhớ khai báo Scanner sc trước nhá
                switch(opt){
                    case 1:
                        objSL.add();
                        System.out.println("----------------------------");
                        System.out.println("Successful...");
                        break;
                    case 2:
                        objSL.printVector();
                        break;
                    case 3:
                        System.out.println("----------------------------");
                        System.out.print("Enter a id : ");
                        id = sc.nextInt();
                        objSL.search(id);//Nhớ cho nhập id nha quên hoài
                        break;
                    case 4:
                        objSL.saveToFile();
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("----------------------------");
                        System.out.println("Pls choose 1-5 ");
                        
                }
        }
    }
    
}
