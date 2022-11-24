/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityproject;
import java.awt.HeadlessException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

import java.util.Properties;


import javax.swing.JOptionPane;

import java.sql.*;
import java.util.Random;
import javax.mail.Message.RecipientType;
/**
 *
 * @author Ruthvik Garlapati
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Connection connection;
    public MainJFrame() {
        initComponents();
        connectDatabase();
    }
    
    public void connectDatabase(){
     try{
         connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "rajkumar");
        }
        catch(Exception e){
            System.out.println("Unable to connect to Database");
        }
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
        jLabel1 = new javax.swing.JLabel();
        MainJPanel = new javax.swing.JPanel();
        UsernameFld = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        PasswordImage = new javax.swing.JLabel();
        UserNameImage = new javax.swing.JLabel();
        TitleImage = new javax.swing.JLabel();
        PasswordFld = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screenshot_20221123_005729.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -2, 320, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 660));

        MainJPanel.setBackground(new java.awt.Color(0, 102, 102));
        MainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameFld.setBackground(new java.awt.Color(0, 102, 102));
        UsernameFld.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        UsernameFld.setText("Username");
        UsernameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        MainJPanel.add(UsernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 260, 40));

        RegisterButton.setBackground(new java.awt.Color(0, 102, 102));
        RegisterButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        MainJPanel.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 260, 40));

        LoginButton.setBackground(new java.awt.Color(0, 102, 102));
        LoginButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(51, 51, 51));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        MainJPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 260, 40));

        PasswordImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-unlock-private-20.png"))); // NOI18N
        MainJPanel.add(PasswordImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 20, 30));

        UserNameImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-user-20.png"))); // NOI18N
        MainJPanel.add(UserNameImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 20, 30));

        TitleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-smart-city-64.png"))); // NOI18N
        MainJPanel.add(TitleImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 70, 90));

        PasswordFld.setBackground(new java.awt.Color(0, 102, 102));
        PasswordFld.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        PasswordFld.setText("password");
        PasswordFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFldActionPerformed(evt);
            }
        });
        MainJPanel.add(PasswordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, 50));

        getContentPane().add(MainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 710, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
String username = UsernameFld.getText();
String pwd = String.valueOf(PasswordFld.getPassword());
            try {
                    PreparedStatement st = (PreparedStatement)connection.prepareStatement("Select username,password from users");
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        if(rs.getString(1).equals(username)){
                            if(rs.getString(2).equals(pwd)){
                                UserLandingJFrame frame = new UserLandingJFrame(connection);
frame.show();
dispose();
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "Incorrect Password.");
                            }
                        }
                        else{
                             JOptionPane.showMessageDialog(this, "Username Not Found.");
                        } 
                    }
                } catch (HeadlessException | SQLException sqlException) {
                    sqlException.printStackTrace();
                } 
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFldActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel MainJPanel;
    private javax.swing.JPasswordField PasswordFld;
    private javax.swing.JLabel PasswordImage;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel TitleImage;
    private javax.swing.JLabel UserNameImage;
    private javax.swing.JTextField UsernameFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
