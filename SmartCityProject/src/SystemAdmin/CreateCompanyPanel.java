/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Directories.CityDirectory;
import Directories.CompanyDirectory;
import Directories.UserCoordinatesDirectory;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.UserCoordinates;
public class CreateCompanyPanel extends javax.swing.JPanel {

  
    Connection connection;
    CompanyDirectory compdir;
    CityDirectory citydir;
  UserCoordinatesDirectory usercordDir;
UserCoordinates newOne;
    public CreateCompanyPanel(Connection connection,CompanyDirectory Dir,CityDirectory citydir,UserCoordinatesDirectory usercordDir) {
        initComponents();
        this.connection = connection;
        this.compdir = compdir;
        this.citydir = citydir;
          this.usercordDir = usercordDir;
         newOne = usercordDir.addNew();
         cordfld.setEditable(false);
         GreenTick.setVisible(false);
            RedTick.setVisible(false);
        NameListener();
        populateCompanies();
    }

    
    private void populateCompanies(){
         DefaultTableModel model = (DefaultTableModel) CompanyData.getModel();
          try{
              ResultSet rs = citydir.getApprovedBuildings();
              model.setRowCount(0);
               Object row[] = new Object[6];
      while(rs.next()) {
          if(rs.getString("type").equals("Company")){
            row[0] = rs.getString("application_id");
            row[1] = rs.getString("name");
            row[2] = rs.getString("owner");
            row[3] = rs.getString("location");
            row[4] = rs.getString("lat");
              row[5] = rs.getString("lon");
            model.addRow(row);
          }
            }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }
     private boolean CompanyExists(){
        try{
            ResultSet rs = citydir.getApprovedBuildings();
            while(rs.next()) {
          if(rs.getString("name").equals(namefld.getText()))
              return false;
        }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return true;
    }
  private void NameListener(){
    DocumentListener documentListener = new DocumentListener() {
      @Override
      public void changedUpdate(DocumentEvent documentEvent) {
         if(CompanyExists()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
      @Override
      public void insertUpdate(DocumentEvent documentEvent) {
          
          if(CompanyExists()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
      @Override
      public void removeUpdate(DocumentEvent documentEvent) {
           if(CompanyExists()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
    };
    namefld.getDocument().addDocumentListener(documentListener);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompanyData = new javax.swing.JTable();
        namefld = new javax.swing.JTextField();
        locfld = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cordfld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        GreenTick = new javax.swing.JLabel();
        RedTick = new javax.swing.JLabel();
        ownerfld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Company");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 260, -1));

        CompanyData.setBackground(new java.awt.Color(255, 204, 153));
        CompanyData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company Id", "Name", "Owner", "Location", "Latitude", "Longitude"
            }
        ));
        jScrollPane1.setViewportView(CompanyData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 79, 1016, 185));

        namefld.setBackground(new java.awt.Color(255, 204, 153));
        add(namefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 224, -1));

        locfld.setBackground(new java.awt.Color(255, 204, 153));
        add(locfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 405, 224, -1));

        SaveButton.setBackground(new java.awt.Color(255, 204, 153));
        SaveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 301, 60, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Owner :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 356, 60, 20));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 406, 70, 20));

        cordfld.setBackground(new java.awt.Color(255, 204, 153));
        add(cordfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 461, 224, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Co-Ordinates :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 452, 100, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Set Location");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 130, 40));

        GreenTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-approval-25.png"))); // NOI18N
        add(GreenTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 300, -1, -1));

        RedTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cross-mark-25.png"))); // NOI18N
        add(RedTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 300, -1, -1));

        ownerfld.setBackground(new java.awt.Color(255, 204, 153));
        add(ownerfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 355, 224, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add company.jpeg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

MapsFrame frame  = new MapsFrame(newOne);
 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
               cordfld.setText(newOne.getLat()+","+newOne.getLon());
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked
    String name,dean,location,cord;
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
name = namefld.getText();
dean = ownerfld.getText();
location = locfld.getText();
newOne.setUsername(name);
        citydir.addCompanyBySystemAdmin(name, dean, location, newOne.getLat(), newOne.getLon());
        JOptionPane.showMessageDialog(this, "Added Successfully");
        populateCompanies();
        
        namefld.setText("");
        ownerfld.setText("");
        locfld.setText("");
        cordfld.setText("");
         GreenTick.setVisible(false);
            RedTick.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CompanyData;
    private javax.swing.JLabel GreenTick;
    private javax.swing.JLabel RedTick;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField cordfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locfld;
    private javax.swing.JTextField namefld;
    private javax.swing.JTextField ownerfld;
    // End of variables declaration//GEN-END:variables
}
