/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.s.l008;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lan-T
 */
public class LoginForm extends JFrame implements ActionListener {

    private JPanel panel;
    private final JTextField txtUserName = new JTextField();
    private final JPasswordField txtPassWord = new JPasswordField();
    private final JLabel lblMessage = new JLabel();
    private final JButton btnLogin = new JButton("SUBMIT");
    
    private void initComponent() {
        
        panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("User name: "));
        panel.add(txtUserName);
        panel.add(new JLabel("Password: "));
        panel.add(txtPassWord);
        panel.add(lblMessage);
        panel.add(btnLogin);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnLogin.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = txtUserName.getText().trim();
        String pass = txtPassWord.getText().trim();
        
        if("admin".equals(user) && "admin".equals(pass) ) {
            lblMessage.setForeground(Color.GREEN);
            lblMessage.setText("Hello " + user);
        } else {
            lblMessage.setForeground(Color.RED);
            lblMessage.setText("Invalid user...");
        }
        
    }

    private void initLayout() {
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here!");
        setSize(300, 100);
        setVisible(true);
    }

    public LoginForm() throws HeadlessException {
        initComponent();
        initLayout();
    }
   
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
    }

}
