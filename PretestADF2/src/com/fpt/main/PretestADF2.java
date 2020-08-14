/**
 * Viết chương trình bán điện thoại du động.
 * 1. Thông tin CellPhone(cellCode: String, cellName: String, price: double), có hàm toString()
 * 2. Tạo class CellPhoneManager để quản lý danh sách điện thoại.
 *      - Sử dụng TreeMap để lưu
 *      - Hiển thị toàn bộ danh sách ra màn hình
 *      - Viết hàm save() để lưu file "cellphone.txt"
 * 3. Tạo class PretestADF2:
 *      - Tạo menu:
 *          1. Add new, 2. Show All, 3. Save, 4. Delete CellCode, 5.Exit
 *  Khi user chọn Exit: ứng dụng thoát và tự mở file cellphone.txt bằng notepad
 *  
 *  Validate:
 *      cellCode not empty và có dạng Cxxxx-xxx với x là number[0-9]
 *      cellName chỉ chứa ký tự and khoảng trắng
 *      price > 0
 */     
package com.fpt.main;

import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class PretestADF2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        CellPhoneManager cellPhoneManager = new CellPhoneManager();
        Menu.show();
        while(true) {
            System.out.print("Options[1-5]: ");
            switch(s.nextLine()) {
                case "1":
                    cellPhoneManager.addCellPhone(s);
                    break;
                case "2":
                    cellPhoneManager.showAll();
                    break;
                case "3":
                    cellPhoneManager.save();
                    System.out.println("Successfully...");
                    break;
                case "4":
                    cellPhoneManager.deleteId(s);
                    break;
                case "5":
                    cellPhoneManager.open();
                    return;
            }
        }
        
    }
    
}
