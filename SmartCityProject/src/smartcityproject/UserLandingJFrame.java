/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityproject;

import java.sql.*;
import javax.swing.JSplitPane;

/**
 *
 * @author Ruthvik Garlapati
 */
public class UserLandingJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserLandingJFrame
     */
    Connection connection;
    String user;
   
    public UserLandingJFrame(Connection connection,String user) {
        initComponents();
        this.connection = connection;
        this.user = user;
       UsernameLabel.setText(user+"!!");
    }

    private UserLandingJFrame() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserLandingJPanel = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        EduButton = new javax.swing.JButton();
        HealthButton = new javax.swing.JButton();
        EmployementButton = new javax.swing.JButton();
        EntertainmentButton = new javax.swing.JButton();
        UserSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserLandingJPanel.setBackground(new java.awt.Color(51, 51, 51));
        UserLandingJPanel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        LogoutButton.setBackground(new java.awt.Color(51, 51, 51));
        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-25.png"))); // NOI18N
        LogoutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Hi..");

        UsernameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(242, 242, 242));

        EduButton.setBackground(new java.awt.Color(0, 204, 204));
        EduButton.setText("Education");
        EduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EduButtonActionPerformed(evt);
            }
        });

        HealthButton.setBackground(new java.awt.Color(255, 102, 102));
        HealthButton.setText("Healthcare");
        HealthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthButtonActionPerformed(evt);
            }
        });

        EmployementButton.setBackground(new java.awt.Color(255, 255, 102));
        EmployementButton.setText("Employment");
        EmployementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployementButtonActionPerformed(evt);
            }
        });

        EntertainmentButton.setBackground(new java.awt.Color(255, 153, 255));
        EntertainmentButton.setText("Entertainment");
        EntertainmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntertainmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserLandingJPanelLayout = new javax.swing.GroupLayout(UserLandingJPanel);
        UserLandingJPanel.setLayout(UserLandingJPanelLayout);
        UserLandingJPanelLayout.setHorizontalGroup(
            UserLandingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserLandingJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EduButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HealthButton)
                .addGap(21, 21, 21)
                .addComponent(EntertainmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmployementButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(23, 23, 23))
        );
        UserLandingJPanelLayout.setVerticalGroup(
            UserLandingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLandingJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(UserLandingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UserLandingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EduButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HealthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EntertainmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserSplitPane.setDividerLocation(150);
        UserSplitPane.setMinimumSize(new java.awt.Dimension(150, 1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        UserSplitPane.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        UserSplitPane.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserLandingJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UserSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UserLandingJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        MainJFrame  frame = new MainJFrame();
        frame.show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void EduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EduButtonActionPerformed
      
        EducationPanel panel = new EducationPanel(UserSplitPane);
       UserSplitPane.setLeftComponent(panel);
       UserSplitPane.setDividerLocation(150);
    }//GEN-LAST:event_EduButtonActionPerformed

    private void HealthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthButtonActionPerformed
           HealthcarePanel panel = new HealthcarePanel();
       UserSplitPane.setLeftComponent(panel);
       UserSplitPane.setDividerLocation(150);
    }//GEN-LAST:event_HealthButtonActionPerformed

    private void EntertainmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntertainmentButtonActionPerformed
       EntertainmentPanel panel = new EntertainmentPanel(UserSplitPane,connection);
       UserSplitPane.setLeftComponent(panel);
       UserSplitPane.setDividerLocation(150);
    }//GEN-LAST:event_EntertainmentButtonActionPerformed

    private void EmployementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployementButtonActionPerformed
         EmployementPanel panel = new  EmployementPanel();
         UserSplitPane.setLeftComponent(panel);
         UserSplitPane.setDividerLocation(150);
    }//GEN-LAST:event_EmployementButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLandingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EduButton;
    private javax.swing.JButton EmployementButton;
    private javax.swing.JButton EntertainmentButton;
    private javax.swing.JButton HealthButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel UserLandingJPanel;
    private javax.swing.JSplitPane UserSplitPane;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
