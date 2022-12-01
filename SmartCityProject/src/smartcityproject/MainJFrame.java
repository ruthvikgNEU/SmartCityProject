/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityproject;
import UI.SignUPJPanel;
import UI.UserLandingJPanel;
import UI.UserLandingJFrame;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

import java.util.Properties;
//main branch code
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.Random;
import javax.mail.Message.RecipientType;
import javax.swing.JPanel;
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
         connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
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

        container = new javax.swing.JPanel();
        MainJPanel = new javax.swing.JPanel();
        UsernameFld = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        PasswordImage = new javax.swing.JLabel();
        UserNameImage = new javax.swing.JLabel();
        TitleImage = new javax.swing.JLabel();
        PasswordFld = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setLayout(new java.awt.CardLayout());

        MainJPanel.setBackground(new java.awt.Color(0, 153, 153));
        MainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameFld.setBackground(new java.awt.Color(0, 153, 153));
        UsernameFld.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        UsernameFld.setText("Username");
        UsernameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        MainJPanel.add(UsernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 260, 40));

        RegisterButton.setBackground(new java.awt.Color(0, 153, 153));
        RegisterButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        MainJPanel.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 270, 40));

        LoginButton.setBackground(new java.awt.Color(0, 153, 153));
        LoginButton.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(51, 51, 51));
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        MainJPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 280, 40));

        PasswordImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-unlock-private-20.png"))); // NOI18N
        MainJPanel.add(PasswordImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 20, 30));

        UserNameImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-user-20.png"))); // NOI18N
        MainJPanel.add(UserNameImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 20, 30));

        TitleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-smart-city-64.png"))); // NOI18N
        MainJPanel.add(TitleImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 70, 90));

        PasswordFld.setBackground(new java.awt.Color(0, 153, 153));
        PasswordFld.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        PasswordFld.setText("password");
        PasswordFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFldActionPerformed(evt);
            }
        });
        MainJPanel.add(PasswordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screenshot_20221123_190801.png"))); // NOI18N
        MainJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 700));

        container.add(MainJPanel, "card2");

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String username = UsernameFld.getText();
        String pwd = String.valueOf(PasswordFld.getPassword());
        try {
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("Select username,passwordFld,can_login from users");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                if(rs.getString(1).equals(username)){
                    if(rs.getString(2).equals(pwd)){
                        if(rs.getString(3).equals("1")){
                            flag = false;
                            UserLandingJPanel panel2 = new UserLandingJPanel(connection);
                            container.add("UserLandingJPanel",panel2);
                            CardLayout layout = (CardLayout) container.getLayout();
                            layout.next(container);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Email not Verified.");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Incorrect Password.");
                    }
                }
            }
            if(flag)
            JOptionPane.showMessageDialog(this, "Username Not Found.");
        } catch (HeadlessException | SQLException sqlException) {
            sqlException.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        //SignUPJPanel panel = new SignUPJPanel(MainJPanel,connection);

        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed
boolean flag = true;
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
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
