/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychuyenbay;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Booking booking = new Booking();
        
        System.out.println("---------- MENU ----------");
        System.out.println("1. Dat ve");
        System.out.println("2. Tim kiem theo Dich den");
        System.out.println("3. Tim kiem theo Loai ve");
        System.out.println("4. Hien thi thong tin");
        System.out.println("5. Thoat chuong trinh");
        
        while(true) {
            System.out.print("Chon[1-5]: ");
            String key = sc.nextLine();
            switch(key) {
                case "1":
                    booking.addNew();
                    break;
                case "2":
                    booking.searchDichDen();
                    break;
                case "3":
                    booking.searchLoaiVe();
                    break;
                case "4":
                    booking.display();
                    break;
                case "5":
                    System.out.println("Tam biet ban...");
                    return;
                default:
                    System.out.println("Kiem tra lai tuy chon cua ban...");
                    break;
            }
        }
        
    }
    
}
