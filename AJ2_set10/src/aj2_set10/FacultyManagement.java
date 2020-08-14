/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aj2_set10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongTanPhu
 */
public class FacultyManagement extends javax.swing.JFrame {
    String url, sql;
    Connection cn;
    Statement stm;
    ResultSet rs;
    DefaultComboBoxModel cbbModel;
    DefaultTableModel tblModel;
    Vector head, data, row;
    //String id, name, subName;
    int hour;
    //int checkHour;
    boolean flag = false;
    public FacultyManagement() {
        initComponents();
        this.setTitle("Faculty Information");
        sqlConnect();
        setCbbModel();
        setFacultyModel();
    }
    private void sqlConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //thiet lap driver manager
            url = "jdbc:sqlserver://localhost:1433;database=Faculty;"; //sub protocol
            cn = DriverManager.getConnection(url, "sa", "123456");
            stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (ClassNotFoundException | SQLException|NullPointerException e) {
            e.getStackTrace();
        }
    }
    private void setCbbModel(){
        cbbModel = new DefaultComboBoxModel();
        try {
            sql = "Select * from Subject";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                //JOptionPane.showMessageDialog(this, rs.getString("subjectName"));
                cbbModel.addElement(rs.getString("subjectName"));
            }
            cbbSub.setModel(cbbModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void setFacultyModel(){
        tblModel = new DefaultTableModel();
        head = new Vector();
        //head.add("ID");
        head.add("Name");
        head.add("Subject Name");
        head.add("Hours");
        data = new Vector();
        try {
            tblFaculty.setModel(new DefaultTableModel());
            sql = "Select * from FacultyManager";
            rs = stm.executeQuery(sql);
            while (rs.next()){
                //id = rs.getString(1);
                //name = rs.getString(2);
                //subName = rs.getString(3);
                //hour = rs.getInt(4);
                row = new Vector();
                //row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getInt(4));
                data.add(row);
            }
            tblModel.setDataVector(data, head);
            tblFaculty.setModel(tblModel);
        } catch (SQLException |NumberFormatException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void clearTxt(){
        txtName.setText("");
        txtID.setText("");
        txtHours.setText("");
    }
    private void checkEmpty(){
        try {
            if (txtID.getText().isEmpty()){
                throw new Exception("Cannot blank");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), jLabel1.getText(), JOptionPane.OK_OPTION);
            txtID.grabFocus();
            return;
        }
        try {
            if (txtName.getText().isEmpty()){
                throw new Exception("Cannot blank");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), jLabel2.getText(), JOptionPane.OK_OPTION);
            txtName.grabFocus();
            return;
        }
        try {
            if (txtHours.getText().isEmpty()){
                throw new Exception("Cannot blank");
            }
            hour = Integer.parseInt(txtHours.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Hours must be number", jLabel4.getText(), JOptionPane.OK_OPTION );
            return;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), jLabel4.getText(), JOptionPane.OK_OPTION);
            txtHours.grabFocus();
            return;
        }
        flag = true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbbSub = new javax.swing.JComboBox<>();
        txtHours = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFaculty = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Faculty Details"));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Subject");

        jLabel4.setText("Hours");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cbbSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbbSub, 0, 286, Short.MAX_VALUE)
                        .addComponent(txtName)
                        .addComponent(txtHours)
                        .addComponent(txtID)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbSub))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHours))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addGap(56, 56, 56))
        );

        tblFaculty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFaculty);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        checkEmpty();
        if(flag == true){
            //tblFaculty.removeAll();
            String sql = "insert into FacultyManager values (?,?,?,?)";
            try {
                PreparedStatement ps = cn.prepareStatement(sql);
                //khac Statement
                //Truyen theo thu tu dau ? trong cau lenh SQL bat dau dem tu 1
                ps.setString(1, txtID.getText());
                ps.setString(2, txtName.getText());
                ps.setString(3, cbbSub.getSelectedItem().toString());
                ps.setInt(4, hour);
                ps.executeUpdate(); 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            setFacultyModel();
            clearTxt();
            JOptionPane.showMessageDialog(this, "Insert Success...");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearTxt();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbbSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFaculty;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
