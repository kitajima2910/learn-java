/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.final2020;

import java.io.Serializable;

/**
 *
 * @author Lan-T
 */
public class Grade implements Serializable {
    private String name;
    private int score;

    public Grade() {
    }

    public Grade(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[Name: " + getName() + " - Score: " + getScore() + "]";
    }
    
    
}
