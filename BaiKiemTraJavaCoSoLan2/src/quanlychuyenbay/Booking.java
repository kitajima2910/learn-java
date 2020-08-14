/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychuyenbay;

import dulieucoso.NgayGio;
import dulieucoso.NgayThang;
import dulieucoso.ThongTinChuyenBay;
import java.util.Scanner;

/**
 *
 * @author Lan-T
 */
public class Booking {
    
    private Scanner sc = new Scanner(System.in);
    private ThongTinChuyenBay[] danhsach = new ThongTinChuyenBay[100];
    private int vitri = 0;
    
    public void addNew() {
        ThongTinChuyenBay thongTinChuyenBay = new ThongTinChuyenBay();
        NgayThang ngayThang = new NgayThang();
        NgayGio ngayGio = new NgayGio();
        
        do {
            System.out.print("Nhap ngay: ");
            String ngay = sc.nextLine();
            if(!checkNumber(ngay)) {
                System.out.println("Kiem tra lai ngay...");
                continue;
            }
            ngayThang.setNgay(Integer.parseInt(ngay));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap thang: ");
            String thang = sc.nextLine();
            if(!checkNumber(thang)) {
                System.out.println("Kiem tra lai thang...");
                continue;
            }
            ngayThang.setThang(Integer.parseInt(thang));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap nam: ");
            String nam = sc.nextLine();
            if(!checkNumber(nam)) {
                System.out.println("Kiem tra lai nam...");
                continue;
            }
            ngayThang.setNam(Integer.parseInt(nam));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap gio: ");
            String gio = sc.nextLine();
            if(!checkNumber(gio)) {
                System.out.println("Kiem tra lai gio...");
                continue;
            }
            ngayGio.setGio(Integer.parseInt(gio));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap phut: ");
            String phut = sc.nextLine();
            if(!checkNumber(phut)) {
                System.out.println("Kiem tra lai phut...");
                continue;
            }
            ngayGio.setPhut(Integer.parseInt(phut));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap so ve: ");
            String soVe = sc.nextLine();
            if(!checkNumber(soVe)) {
                System.out.println("Kiem tra lai so ve...");
                continue;
            }
            thongTinChuyenBay.setSoVe(Integer.parseInt(soVe));
            break;
        }while(true);
        
        do {
            System.out.print("Nhap loai ve: ");
            String loaiVe = sc.nextLine();
            if(!checkLoaiVe(loaiVe)) {
                System.out.println("Kiem tra lai loai ve...");
                continue;
            }
            thongTinChuyenBay.setLoaiVe(loaiVe);
            break;
        }while(true);
        
        do {
            System.out.print("Nhap dich den: ");
            String dichDen = sc.nextLine();
            if(!checkDichDen(dichDen)) {
                System.out.println("Kiem tra lai dich den...");
                continue;
            }
            thongTinChuyenBay.setDichDen(dichDen);
            break;
        }while(true);
        
        thongTinChuyenBay.setNgayBay(ngayThang);
        thongTinChuyenBay.setGioBay(ngayGio);
        
        danhsach[vitri] = thongTinChuyenBay;
        vitri++;
        
    }
    
    public void display() {
        for(int i = 0; i < vitri; i++) {
            System.out.println(danhsach[i]);
        }
    }
    
    public void searchDichDen() {
        System.out.print("Nhap dich den can tim: ");
        String dichDen = sc.nextLine();
        boolean flag = false;
        for(int i = 0; i < vitri; i++) {
            if(dichDen.equalsIgnoreCase(danhsach[i].getDichDen())) {
                System.out.println(danhsach[i]);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Khong tim thay du lieu dich den...");
        }
    }
    
    public void searchLoaiVe() {
        System.out.print("Nhap loai ve can tim: ");
        String loaiVe = sc.nextLine();
        boolean flag = false;
        for(int i = 0; i < vitri; i++) {
            if(loaiVe.equalsIgnoreCase(danhsach[i].getLoaiVe())) {
                System.out.println(danhsach[i]);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Khong tim thay du lieu loai ve...");
        }
    }
    
    private boolean checkNumber(String number) {
        /**
         * Kiểm tra một chuỗi là chữ hay là số sử dụng NumberFormatException
         * @param number là chữ, trả về false
         * @param number là số, trả về true
         */
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    
    private boolean checkDichDen(String dichDen) {
        return dichDen.equalsIgnoreCase("Ho Chi Minh") || dichDen.equalsIgnoreCase("Dai Loan") || dichDen.equalsIgnoreCase("Singapore");
    }
    
    private boolean checkLoaiVe(String loaiVe) {
        return loaiVe.equalsIgnoreCase("Khu hoi") || loaiVe.equalsIgnoreCase("Mot chieu");
    }
    
}
