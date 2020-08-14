package test;

public class PhanSo {
    
    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public PhanSo tong(PhanSo ps2) {
        this.setTu((this.getTu() * ps2.getMau()) + (this.getMau() * ps2.getTu()));
        this.setMau(this.getMau() * ps2.getMau());
        return this;
    }

    @Override
    public String toString() {
        return this.getTu() + "/" + this.getMau();
    }
    
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(1, 4);
        
        System.out.println("Phan so 1: " + ps1);
        System.out.println("Phan so 2: " + ps2);
        System.out.println("Tong 2 phan so: " + ps1.tong(ps2));
    }
    
}
