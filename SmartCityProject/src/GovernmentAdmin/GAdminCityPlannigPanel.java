
package GovernmentAdmin;

import Directories.CityDirectory;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class GAdminCityPlannigPanel extends javax.swing.JPanel {

  

    String user;
    CityDirectory cityDir;
    public GAdminCityPlannigPanel(String user,CityDirectory cityDir) {
        initComponents();
       this.user = user;
       this.cityDir = cityDir;
       populateApplications();
    }

     private void populateApplications(){
      
       DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
          try{
              ResultSet rs = cityDir.getAllApplications();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[8];
             row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(8);
            row[5] = rs.getString(5);
            row[6] = rs.getString(9);
              row[7] = (rs.getString(6)+","+rs.getString(7));
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
        ApplicationsTable = new javax.swing.JTable();
        CityCommDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("City  Planning Applications");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 500, -1));

        ApplicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application Id", "Name", "Type", "Owner", "Asignee", "Location", "Application Status", "Co-Ordinates"
            }
        ));
        jScrollPane1.setViewportView(ApplicationsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 990, 180));

        CityCommDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Please Select-" }));
        CityCommDropDown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(CityCommDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 234, 57));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Asignee :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 140, -1));

        UpdateButton.setBackground(new java.awt.Color(204, 204, 255));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        UpdateButton.setText("Update");
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/city planning2.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 770));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApplicationsTable;
    private javax.swing.JComboBox<String> CityCommDropDown;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
