/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

/**
 *
 * @author Lan-T
 */
public class Doctor {

    private String code;
    private String name;
    private String specilization;
    private int hour;

    public Doctor() {
    }

    public Doctor(String code, String name, String specilization, int hour) {
        this.code = code;
        this.name = name;
        this.specilization = specilization;
        this.hour = hour;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Doctor{" + "code=" + code + ", name=" + name + ", specilization=" + specilization + ", hour=" + hour + '}';
    }

}
