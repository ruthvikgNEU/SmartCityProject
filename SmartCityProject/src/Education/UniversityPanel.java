/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Education;

import Directories.EducationDirectory;

/**
 *
 * @author Ruthvik Garlapati
 */

public class UniversityPanel extends javax.swing.JPanel {
EducationDirectory edudir;
String user;
 public  UniversityPanel(EducationDirectory edudir,String user) {
        initComponents();
        this.edudir = edudir;
        this.user = user;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UniversityDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CourseDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        DescriptionArea = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ApplyButton = new javax.swing.JButton();
        WithdrawButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("University Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Application Id", "University", "Courses", "Date Applied", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 999, 232));

        add(UniversityDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 252, 42));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        add(CourseDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 252, 41));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 311, 80));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 311, 81));

        DescriptionArea.setBackground(new java.awt.Color(255, 255, 255));
        DescriptionArea.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionArea.setText("Descripiton :");
        add(DescriptionArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Comments :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        ApplyButton.setText("Apply");
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });
        add(ApplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 134, 34));

        WithdrawButton.setText("Withdraw");
        add(WithdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 130, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/zoomRRLsummer.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed
String uni  = String.valueOf(UniversityDropDown.getSelectedItem());
String course = String.valueOf(CourseDropDown.getSelectedItem());
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyButton;
    private javax.swing.JComboBox<String> CourseDropDown;
    private javax.swing.JLabel DescriptionArea;
    private javax.swing.JComboBox<String> UniversityDropDown;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
