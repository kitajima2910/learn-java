/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l001;

/**
 *
 * @author Lan-T
 */
public class Student {
    
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private float toan, ly, hoa, sinh, van;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getSinh() {
        return sinh;
    }

    public void setSinh(float sinh) {
        this.sinh = sinh;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }
    
    public String tinhDiemTrungBinh() {
        float kq = (toan + ly + hoa + sinh + van) / 5;
        String content = kq < 5 ? "Kem" : kq >= 5 && kq < 7 ? "Trung Binh" : kq >= 7 && kq < 8 ? "Kha" : "Gioi";
        return content + " (" + kq + ")";
    }
    
}
