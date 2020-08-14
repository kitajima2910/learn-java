/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManager objSM = new StudentManager();//Chuyển vector thành object để lấy method
        int opt;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------- Set 09 ----------");
            System.out.println("| 1. New Student ");
            System.out.println("| 2. Display All Student ");
            System.out.println("| 3. Read File ");
            System.out.println("| 4. Exit ");
            System.out.println("----------------------------");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();//Nhớ khai báo Scanner sc trước nhá
                switch(opt){
                    case 1:
                        objSM.addStudent();
                        System.out.println("----------------------------");
                        System.out.println("Successful...");
                        break;
                    case 2:
                        objSM.displayList();
                        break;
                    case 3:
                        objSM.readFile();
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
