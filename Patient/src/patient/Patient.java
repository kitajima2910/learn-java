/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

public class Patient {

    String ID;
    String name, sex, examDate;

    public Patient() {
        ID = null;
        name = null;
        sex = null;
        examDate = null;
    }

    public Patient(String ID, String name, String sex, String examDate) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + ", name=" + name + ", sex=" + sex + ", examDate=" + examDate + '}';
    }

}
