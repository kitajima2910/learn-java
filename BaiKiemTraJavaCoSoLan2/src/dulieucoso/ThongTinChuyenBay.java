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
public class ThongTinChuyenBay {
    private NgayThang ngayBay;
    private NgayGio gioBay;
    private int soVe;
    private String loaiVe;
    private String dichDen;

    public ThongTinChuyenBay() {
    }

    public ThongTinChuyenBay(NgayThang ngayBay, NgayGio gioBay, int soVe, String loaiVe, String dichDen) {
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.soVe = soVe;
        this.loaiVe = loaiVe;
        this.dichDen = dichDen;
    }

    public NgayThang getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(NgayThang ngayBay) {
        this.ngayBay = ngayBay;
    }

    public NgayGio getGioBay() {
        return gioBay;
    }

    public void setGioBay(NgayGio gioBay) {
        this.gioBay = gioBay;
    }

    public int getSoVe() {
        return soVe;
    }

    public void setSoVe(int soVe) {
        this.soVe = soVe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getDichDen() {
        return dichDen;
    }

    public void setDichDen(String dichDen) {
        this.dichDen = dichDen;
    }

    @Override
    public String toString() {
        return "ThongTinChuyenBay{" + "ngayBay=" + ngayBay + ", gioBay=" + gioBay + ", soVe=" + soVe + ", loaiVe=" + loaiVe + ", dichDen=" + dichDen + '}';
    }
    
    
}
