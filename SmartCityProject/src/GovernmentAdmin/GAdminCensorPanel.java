/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GovernmentAdmin;

import Directories.CensorDirectory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruthvik Garlapati
 */
public class GAdminCensorPanel extends javax.swing.JPanel {

    /**
     * Creates new form GAdminEmpPanel
     */
    CensorDirectory cenDir;
    String user;
    public GAdminCensorPanel(CensorDirectory cenDir,String user) {
        initComponents();
         this.user = user;
        this.cenDir = cenDir;
        populateCensorAdmins();
        populateApplications();
    }
     private void populateCensorAdmins(){
         AsigneeDropDown.removeAllItems();
       ArrayList<String> list = cenDir.getAllCensorAdmins();
       for(String s : list){
           AsigneeDropDown.addItem(s);
       }
    }
    private void populateApplications(){
         DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
          try{
              ResultSet rs = cenDir.getAllApplications();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[10];
             row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
            row[5] = rs.getString(8);
              row[6] = rs.getString(10);
            row[7] = rs.getString(6);
            row[8] = rs.getString(7);
            row[9] = rs.getString(9);
            model.addRow(row);
        }
          }
          catch(Exception e){
              System.out.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ApplicationsTable = new javax.swing.JTable();
        AsigneeDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        AssignButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Censor Applications");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        ApplicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application Id", "Theatre", "Name", "Director", "Producer/Studio", "Application Status", "Asignee", "Movie Status", "Applied Date", "Url"
            }
        ));
        jScrollPane1.setViewportView(ApplicationsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1011, 198));

        AsigneeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(AsigneeDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 349, 257, 53));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Asignee :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 354, -1, -1));

        AssignButton.setText("Assign");
        AssignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignButtonActionPerformed(evt);
            }
        });
        add(AssignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 456, 127, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cinema-come-è-cambiato.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -7, 1140, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void AssignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignButtonActionPerformed
 int selectedRowIndex = ApplicationsTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Application to Update Asignee.....!");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
         String id  = String.valueOf(model.getValueAt(selectedRowIndex, 0));
         String asignee = String.valueOf(AsigneeDropDown.getSelectedItem());
         cenDir.updateAssignee(id,asignee);
         populateApplications();
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApplicationsTable;
    private javax.swing.JComboBox<String> AsigneeDropDown;
    private javax.swing.JButton AssignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}