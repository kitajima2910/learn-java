/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l008;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lan-T
 */
public class DemoForm extends JFrame {

    private JPanel mainPanel;
    
    public DemoForm() throws HeadlessException {
    }
    
    public DemoForm(String title) throws HeadlessException {
        initLayout(title);
        initMainScreen();
    }
    
    private void initMainScreen() {
        mainPanel = new JPanel(new GridLayout(2, 3));
        add(mainPanel, BorderLayout.CENTER);
        
        mainPanel.add(new Button("Button 01"));
        mainPanel.add(new Button("Button 02"));
        mainPanel.add(new Button("Button 03"));
        mainPanel.add(new Button("Button 04"));
        mainPanel.add(new Button("Button 05"));
        mainPanel.add(new Button("Button 06"));
    }
    
    private void initLayout(String title) {
        setTitle(title);
        setMaximumSize(new Dimension(800, 600));
        setSize(320, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        DemoForm demoForm = new DemoForm(new Date().toString());
    }
}
