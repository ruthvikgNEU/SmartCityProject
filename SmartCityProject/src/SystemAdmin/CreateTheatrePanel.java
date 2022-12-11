/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Directories.CityDirectory;
import Directories.TheatreDirectory;
import Directories.UserCoordinatesDirectory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.UserCoordinates;

/**
 *
 * @author Ruthvik Garlapati
 */
public class CreateTheatrePanel extends javax.swing.JPanel {

  
    TheatreDirectory thDir;
    Connection connection;
    CityDirectory cityDir;
UserCoordinatesDirectory usercordDir;
UserCoordinates newOne;
    public CreateTheatrePanel(Connection connection, TheatreDirectory thDir,CityDirectory cityDir,UserCoordinatesDirectory usercordDir) {
        initComponents();
        this.connection = connection;
        this.thDir = thDir;
         this.cityDir = cityDir;
        this.usercordDir = usercordDir;
         newOne = usercordDir.addNew();
         UsernameGreenTick.setVisible(false);
            UsernameRedTick.setVisible(false);
        populateTheatres();
        UsernameListener();
        cordfld.setEditable(false);
    }
    private void populateTheatres(){
         DefaultTableModel model = (DefaultTableModel) TheatreData.getModel();
          try{
              ResultSet rs = cityDir.getApprovedBuildings();
              model.setRowCount(0);
               Object row[] = new Object[6];
      while(rs.next()) {
          if(rs.getString("type").equals("Theatre")){
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
    
    private void UsernameListener(){
    DocumentListener documentListener = new DocumentListener() {
      @Override
      public void changedUpdate(DocumentEvent documentEvent) {
         if(TheatreNameExists()){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
      @Override
      public void insertUpdate(DocumentEvent documentEvent) {
          
          if(TheatreNameExists()){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
      @Override
      public void removeUpdate(DocumentEvent documentEvent) {
           if(TheatreNameExists()){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
    };
    namefld.getDocument().addDocumentListener(documentListener);
}
    
    private boolean TheatreNameExists(){
        try{
            ResultSet rs = cityDir.getApprovedBuildings();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TheatreData = new javax.swing.JTable();
        namefld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cordfld = new javax.swing.JTextField();
        LocationLabel = new javax.swing.JLabel();
        locfld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SetLocationLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        ownerfld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UsernameRedTick = new javax.swing.JLabel();
        UsernameGreenTick = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        TheatreData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Owner", "Location", "Latitude ", "Longitude"
            }
        ));
        jScrollPane1.setViewportView(TheatreData);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Add Theatres");

        jLabel2.setText("Name :");

        LocationLabel.setText("Location :");

        jLabel3.setText("Co-Ordinates :");

        SetLocationLabel.setText("Set Location");
        SetLocationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetLocationLabelMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SetLocationLabelMouseReleased(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Owner :");

        UsernameRedTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cross-mark-25.png"))); // NOI18N

        UsernameGreenTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-approval-25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LocationLabel)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namefld, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(locfld)
                            .addComponent(ownerfld)
                            .addComponent(cordfld, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SetLocationLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(UsernameRedTick)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UsernameGreenTick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UsernameRedTick)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(UsernameGreenTick))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cordfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetLocationLabel)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SetLocationLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetLocationLabelMouseReleased
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
    }//GEN-LAST:event_SetLocationLabelMouseReleased

    String name,dean,location,cord;
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed


name = namefld.getText();
dean = ownerfld.getText();
location = locfld.getText();
newOne.setUsername(name);
        cityDir.addTheatreBySystemAdmin(name, dean, location, newOne.getLat(), newOne.getLon());
        JOptionPane.showMessageDialog(this, "Added Successfully");
        populateTheatres();
        
        namefld.setText("");
        ownerfld.setText("");
        locfld.setText("");
        cordfld.setText("");
         UsernameGreenTick.setVisible(false);
            UsernameRedTick.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void SetLocationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetLocationLabelMouseClicked


        // TODO add your handling code here:
    }//GEN-LAST:event_SetLocationLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel SetLocationLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTable TheatreData;
    private javax.swing.JLabel UsernameGreenTick;
    private javax.swing.JLabel UsernameRedTick;
    private javax.swing.JTextField cordfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locfld;
    private javax.swing.JTextField namefld;
    private javax.swing.JTextField ownerfld;
    // End of variables declaration//GEN-END:variables
}
