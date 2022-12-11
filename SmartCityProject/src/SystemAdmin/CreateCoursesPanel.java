/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Directories.CityDirectory;
import Directories.EducationDirectory;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
public class CreateCoursesPanel extends javax.swing.JPanel {

   Connection connection;
   EducationDirectory edudir;
   CityDirectory citydir;
    public CreateCoursesPanel(Connection connection,EducationDirectory edudir,CityDirectory citydir) {
        initComponents();
        this.connection = connection;
        this.edudir = edudir;
        this.citydir = citydir;
        populateApplications();
        populateUni();
    }

    
    private void populateUni(){
        unidropdown.removeAllItems();
        try{
            ResultSet rs = citydir.getApprovedBuildings();
            while(rs.next()){
                if(rs.getString("type").equals("University")){
                    unidropdown.addItem(rs.getString("name"));
                }
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    private void populateApplications(){
         DefaultTableModel model = (DefaultTableModel) CourseData.getModel();
          try{
              ResultSet rs = edudir.getCourses();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[8];
             row[0] = rs.getString("application_id");
            row[1] = rs.getString("coursename");
            row[2] = rs.getString("professor");
            row[3] = rs.getString("university");
            row[4] = rs.getString("dayofweek");
            row[5] = rs.getString("coursedesc");
              row[6] = rs.getString("app_status");
               row[7] = rs.getString("applied_date");
            model.addRow(row);
        }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseData = new javax.swing.JTable();
        unidropdown = new javax.swing.JComboBox<>();
        namefld = new javax.swing.JTextField();
        proffld = new javax.swing.JTextField();
        dowfld = new javax.swing.JComboBox<>();
        UploadButton = new javax.swing.JButton();
        filelbl = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Add Courses");

        CourseData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Id", "Name", "Professor", "University", "Day of Week", "Descriprtion Pdf", "Status"
            }
        ));
        jScrollPane1.setViewportView(CourseData);

        unidropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dowfld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("University :");

        jLabel4.setText("Name :");

        jLabel5.setText("Professor :");

        jLabel6.setText("Day of Week :");

        jLabel7.setText("Course Description :");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-repeat-25.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(477, 477, 477))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(unidropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namefld)
                                    .addComponent(proffld)
                                    .addComponent(dowfld, 0, 192, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(383, 383, 383))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SaveButton)
                        .addGap(487, 487, 487))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proffld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dowfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadButton)
                    .addComponent(filelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(SaveButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
uni = String.valueOf(unidropdown.getSelectedItem());
name  = namefld.getText();
prof = proffld.getText();
dow = String.valueOf(dowfld.getSelectedItem());
fileurl = filelbl.getText();
java.util.Date dNow = new java.util.Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" yyyy-MM-dd");
      String applied_date  = ft.format(dNow);
edudir.AddCourseByAdmin(uni,name,prof,dow,fileurl,applied_date);
JOptionPane.showMessageDialog(this, "Course Added");
populateApplications();
namefld.setText("");
proffld.setText("");
filelbl.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    
    
    String uni,name,prof,dow,fileurl;
    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int r = file.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION)
            {
                filelbl.setText(file.getSelectedFile().getAbsolutePath());
            }
            else
                filelbl.setText("N/A");
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

populateUni();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseData;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JComboBox<String> dowfld;
    private javax.swing.JLabel filelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefld;
    private javax.swing.JTextField proffld;
    private javax.swing.JComboBox<String> unidropdown;
    // End of variables declaration//GEN-END:variables
}
