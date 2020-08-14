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
public class NgayGio {

    private int gio;
    private int phut;

    public NgayGio() {
    }

    public NgayGio(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
    }

    // 2403
    public NgayGio(String gio) {
        this.phut = Integer.parseInt(gio.substring(0, 2));
        this.gio = Integer.parseInt(gio.substring(2));
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    @Override
    public String toString() {
        return "NgayGio{" + "gio=" + gio + ", phut=" + phut + '}';
    }

}
