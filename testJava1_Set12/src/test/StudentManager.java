package test;

import java.util.Scanner;
import stud.Student;

public class StudentManager {
    Student objS;
    Student[] arr;
    Scanner sc;
    int maxStud, nextStud=0;
    int key = 0;
    Student[] arrSC;
    public StudentManager() {
        sc = new Scanner(System.in);
        System.out.print("Enter a max Student: ");
        maxStud = sc.nextInt();
        arr = new Student[maxStud];
    }
    
    public void add(){
        if (nextStud == maxStud){
            System.out.println("Array is full !!!");
            return;
        }
        objS = new Student();
        arr[nextStud] = objS;
        nextStud++;
    }
    
    public void display(){
        if (nextStud == 0){
            System.out.println("Array is Empty");
            return;
        }
        /*if(key!=0){
            for (int i = 0; i < nextStud-1; i++) {
                arrSC[i].print();
            }
        }else{*/
            for (int i = 0; i < nextStud; i++) {
                arr[i].print();
            //}
        }
    }
    
    public void removeStud(int id){
        boolean check = false;
        //arrSC = new Student[maxStud-1];
        for (int i = 0; i < nextStud; i++) {
            if (arr[i].getId() == id){
                check = true;
                key = i;
                break;
            }
        }
        if (check == false){
            System.out.println("Not Found!!!");
        }else{
            for(int i=0; i < nextStud-1; i++){
                if(i == key && i<=nextStud-2){
                    //arrSC[i] = arr[i+1];
                    //xoa de co the them moi tiep tuc duoc
                    arr[i]=arr[i+1];
                    arr[i+1] = null;
                }
                nextStud--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager objSM = new StudentManager();
        int opt, id;
        while(true){
            System.out.println("-----Student Manager-----");
            System.out.println("1. Create New student");
            System.out.println("2. Remove Student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter an optiion: ");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    objSM.add();
                    break;
                case 2:
                    System.out.print("Enter an ID for search: ");
                    id = sc.nextInt();
                    objSM.removeStud(id);
                    break;
                case 3:
                    objSM.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choose from 1-4.");
            }
        }
    }
    
}
    
    
    


