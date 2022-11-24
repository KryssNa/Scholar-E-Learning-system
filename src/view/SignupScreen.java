/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.SignuppController;
import database.DbConnection;
import javax.swing.*;
import java.sql.*;
import models.User;


/**
 *
 * @author HP
 */
public class SignupScreen extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    Statement smt;
    DbConnection db=new DbConnection();

    /**
     * Creates new form Login
     */
    public SignupScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCpass = new javax.swing.JTextField();
        tfusername = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 195, 199));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 2, 30)); // NOI18N
        jLabel4.setText("Hello,");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 10, 110, 42);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 2, 25)); // NOI18N
        jLabel3.setText("Sign Up!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 50, 140, 40);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(34, 147, 0, 22);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(36, 197, 18, 0);

        btnsignup.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup);
        btnsignup.setBounds(150, 360, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-user-30.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 110, 30, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-gmail-50.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 170, 50, 40);

        tfCpass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tfCpass.setText("Re-Enter Password");
        tfCpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCpassMouseClicked(evt);
            }
        });
        jPanel1.add(tfCpass);
        tfCpass.setBounds(30, 290, 350, 40);

        tfusername.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tfusername.setText("Enter Username");
        tfusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfusernameMouseClicked(evt);
            }
        });
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfusername);
        tfusername.setBounds(30, 110, 350, 40);

        tfemail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tfemail.setText("Enter Your Email Address");
        tfemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfemailMouseClicked(evt);
            }
        });
        jPanel1.add(tfemail);
        tfemail.setBounds(30, 170, 350, 40);

        tfpass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tfpass.setText("Enter Password");
        tfpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfpassMouseClicked(evt);
            }
        });
        tfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpassActionPerformed(evt);
            }
        });
        jPanel1.add(tfpass);
        tfpass.setBounds(30, 230, 350, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-password-52.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 230, 50, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-lock-50.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 290, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 170, 440, 460);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 190, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo1.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 0, 154, 138);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/signupp.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 320, 1200, 340);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1180, 640);

        setSize(new java.awt.Dimension(1150, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String uname = tfusername.getText();
        String email = tfemail.getText();
        String pass = tfpass.getText();
        String cpass = tfCpass.getText();

        
        
        
        // JOptionPane.showMessageDialog(null, appoint);
        
        if(uname.equals("")||email.equals("")||pass.equals("")||cpass.equals("")){
          JOptionPane.showMessageDialog(null, "Please Fill all the details");
          
        
    }    else if(!pass.equals(cpass)){
              JOptionPane.showMessageDialog(rootPane, "Password must be same");
          }
    else if(!email.endsWith("@gmail.com")){
        JOptionPane.showMessageDialog(rootPane, "Invalid E-mail!!");
    
    }
        
        else{
        // try {
        
          
            User s1 = new User(uname,email,pass,cpass);
            SignuppController sc= new SignuppController();
            int isInserted = sc.insertuser(s1);
            if(isInserted>0){
                System.out.println("Inserted");
                            JOptionPane.showMessageDialog(null,"Inserted Successfully");

            }else{
                System.out.println(" NOt Inserted");
                           // JOptionPane.showMessageDialog(null,"Not Inserted ");
            }           
    }
                                            
    }                                         

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameActionPerformed

    private void tfusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusernameMouseClicked
        // TODO a
        
        tfusername.setText("");
    }//GEN-LAST:event_tfusernameMouseClicked

    private void tfemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfemailMouseClicked
tfemail.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailMouseClicked

    private void tfpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfpassMouseClicked
tfpass.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_tfpassMouseClicked

    private void tfCpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCpassMouseClicked
tfCpass.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpassMouseClicked

    private void tfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpassActionPerformed

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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tfCpass;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfpass;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}