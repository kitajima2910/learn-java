/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dulieucoso;

/**
 *
 * @author Lan-T
 */
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    public NgayThang() {
    }

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    // 24062020
    public NgayThang(String ngaythang) {
        this.ngay = Integer.parseInt(ngaythang.substring(0, 2));
        this.thang = Integer.parseInt(ngaythang.substring(2, 4));
        this.nam = Integer.parseInt(ngaythang.substring(4));
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "NgayThang{" + "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    
    
}
