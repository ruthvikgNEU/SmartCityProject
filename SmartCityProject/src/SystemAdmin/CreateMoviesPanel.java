/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Directories.CensorDirectory;
import Directories.CityDirectory;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CreateMoviesPanel extends javax.swing.JPanel {

  Connection connection;
  CityDirectory cityDir;
  CensorDirectory cenDir;
    public CreateMoviesPanel(Connection connection,CensorDirectory cenDir,CityDirectory cityDir) {
        initComponents();
        this.connection = connection;
        this.cityDir = cityDir;
        this.cenDir = cenDir;
        populateTheatres();
        populateApplications();
    }
    
    
     private void populateApplications(){
         DefaultTableModel model = (DefaultTableModel) CinemaData.getModel();
          try{
              ResultSet rs = cenDir.getAllApplications();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[7];
             row[0] = rs.getString("application_id");
            row[1] = rs.getString("theatre");
            row[2] = rs.getString("movie_name");
            row[3] = rs.getString("director");
            row[4] = rs.getString("studio");
            row[5] = rs.getString("url");
              row[6] = rs.getString("movie_status");
            model.addRow(row);
        }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }

 private void populateTheatres(){
     thdropdown.removeAllItems();
  try{   
      ResultSet rs = cityDir.getApprovedBuildings();
      while(rs.next()){
          if(rs.getString("type").equals("Theatre")){
              thdropdown.addItem(rs.getString("name"));
          }
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
        CinemaData = new javax.swing.JTable();
        thdropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        namefld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        dirfld = new javax.swing.JTextField();
        prodfld = new javax.swing.JTextField();
        urlfld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Add Cinema");

        CinemaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Movie Id", "Theatre", "Name", "Director", "Producer/Studio", "Url", "Movie Status"
            }
        ));
        jScrollPane1.setViewportView(CinemaData);

        thdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Theatre :");

        jLabel3.setText("Name :");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Director :");

        jLabel5.setText("Producer/Studio :");

        jLabel6.setText("Url :");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-repeat-25.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thdropdown, 0, 252, Short.MAX_VALUE)
                            .addComponent(namefld)
                            .addComponent(dirfld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prodfld)
                            .addComponent(urlfld)
                            .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
String name,theatre,dir,studio,url;
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

 theatre = String.valueOf(thdropdown.getSelectedItem());
 name = namefld.getText();
 dir = dirfld.getText();
 studio = prodfld.getText();
 url = urlfld.getText();
   java.util.Date dNow = new java.util.Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" yyyy-MM-dd");
      String applied_date  = ft.format(dNow);
            cenDir.insertRecordbyAdmin(name, dir, studio, url, theatre, applied_date);
            JOptionPane.showMessageDialog(this, "Movie Added");
            populateApplications();
            namefld.setText("");
            dirfld.setText("");
            prodfld.setText("");
            urlfld.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
populateTheatres();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CinemaData;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField dirfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefld;
    private javax.swing.JTextField prodfld;
    private javax.swing.JComboBox<String> thdropdown;
    private javax.swing.JTextField urlfld;
    // End of variables declaration//GEN-END:variables
}
