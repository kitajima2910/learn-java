/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aj2_set10;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DuongTanPhu
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    String url, sql;
    Connection cn;
    Statement stm;
    ResultSet rs;
    public Login() {
        initComponents();
        this.setTitle("Login Form");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //thiet lap driver manager
            url = "jdbc:sqlserver://localhost:1433;database=Faculty;"; //sub protocol
            cn = DriverManager.getConnection(url, "sa", "123456");
            stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUs = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUs = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Download\\if_159_Key_183280.png")); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblUs.setText("User Name");

        lblPass.setText("Password");

        txtUs.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtUsInputMethodTextChanged(evt);
            }
        });
        txtUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUs, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addComponent(txtPass)
                    .addComponent(txtUs, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUs))
                    .addComponent(txtUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtUsInputMethodTextChanged
      
    }//GEN-LAST:event_txtUsInputMethodTextChanged

    private void txtUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsActionPerformed
        
    }//GEN-LAST:event_txtUsActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            if (txtUs.getText().isEmpty()){
                throw new Exception("Cannot blank");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), lblUs.getText(), JOptionPane.OK_OPTION);
            txtUs.grabFocus();
            return;
        }
        try {
            if (txtPass.getText().isEmpty()){
                throw new Exception("Cannot blank");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), lblPass.getText(), JOptionPane.OK_OPTION);
            txtPass.grabFocus();
            return;
        }
        
        String user = txtUs.getText();
        char[] arrPass = txtPass.getPassword();
        String pass = new String(arrPass);
        boolean check = false;
        try {
            sql = "Select * from Account";
            rs = stm.executeQuery(sql);
            while (rs.next()){
                if (user.equalsIgnoreCase(rs.getString("userName"))){
                    if(pass.equalsIgnoreCase(rs.getString("pass"))){    
                        check = true;
                        new FacultyManagement().setVisible(true);
                        this.setVisible(false);
                    }
                } 
            }
            if (check == false){
                JOptionPane.showMessageDialog(this, "Empty data or login fails");
                txtUs.setText("");
                txtPass.setText("");
                txtUs.grabFocus();
                return;
            }else{
                JOptionPane.showMessageDialog(this, "Login success");
                cn.close();
                stm.close();
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUs;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUs;
    // End of variables declaration//GEN-END:variables

}
