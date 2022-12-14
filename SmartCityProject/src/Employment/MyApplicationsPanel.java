/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Employment;
import java.sql.ResultSet;
import Directories.CompanyDirectory;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyApplicationsPanel extends javax.swing.JPanel {

    CompanyDirectory compDir;
  Connection connection;
  String user;
    public MyApplicationsPanel(CompanyDirectory compDir,Connection connection,String user) {
        initComponents();
        this.compDir = compDir;
       this.user = user;
        this.connection = connection;
        populateCompanies();
        populateJobs();
    }
    private void populateJobs(){
          DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
          try{
              ResultSet rs = compDir.getApplicationByUser(user);
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[5];
            row[0] = rs.getString(1);
            row[1] = rs.getString(3);
            row[2] = rs.getString(4);
            row[3] = rs.getString(5);
            row[4] = rs.getString(6);
            model.addRow(row);
        }
          }
          catch(Exception e){
              
          }
        
    }
    private void populateCompanies(){
        CompaniesDropDown.removeAllItems();
        try { 
              ResultSet  compData;
            compData = compDir.getCompanyDirectory();
               while(compData.next()){
                CompaniesDropDown.addItem(compData.getString(2));
            }} catch (SQLException ex) {
           System.out.println(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ApplicationsTable = new javax.swing.JTable();
        CompaniesDropDown = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        JobsDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JobDescription = new javax.swing.JTextField();
        ApplyButton = new javax.swing.JButton();
        WithdrawButton = new javax.swing.JButton();
        CommentsArea = new javax.swing.JTextField();
        CommentsLbl = new javax.swing.JLabel();
        BackgroundIMage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("User Employement Panel");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 760, -1));

        ApplicationsTable.setBackground(new java.awt.Color(255, 204, 204));
        ApplicationsTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ApplicationsTable.setForeground(new java.awt.Color(255, 51, 51));
        ApplicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Application Id", "Company", "Role", "Date Applied", "Status"
            }
        ));
        ApplicationsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(ApplicationsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 916, 193));

        CompaniesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Please select an option-" }));
        CompaniesDropDown.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CompaniesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompaniesDropDownActionPerformed(evt);
            }
        });
        add(CompaniesDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 264, 38));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Company :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, 70));

        JobsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Please select an option-" }));
        JobsDropDown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JobsDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsDropDownActionPerformed(evt);
            }
        });
        add(JobsDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 264, 38));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Jobs :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Description :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 120, 40));

        JobDescription.setText("-Enter decription here-");
        JobDescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(JobDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 264, 80));

        ApplyButton.setBackground(new java.awt.Color(255, 204, 204));
        ApplyButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ApplyButton.setText("Apply");
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });
        add(ApplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 144, 39));

        WithdrawButton.setBackground(new java.awt.Color(255, 204, 204));
        WithdrawButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        WithdrawButton.setText("Withdraw");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });
        add(WithdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 144, 39));

        CommentsArea.setText("-Enter commnets here-");
        CommentsArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(CommentsArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 270, 80));

        CommentsLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        CommentsLbl.setForeground(new java.awt.Color(255, 51, 51));
        CommentsLbl.setText("Comments :");
        add(CommentsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 120, 40));

        BackgroundIMage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employs2.jpeg"))); // NOI18N
        add(BackgroundIMage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1090, 610));
    }// </editor-fold>//GEN-END:initComponents
String company,role;
    private void JobsDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobsDropDownActionPerformed

        company = String.valueOf( CompaniesDropDown.getSelectedItem());
        role = String.valueOf( JobsDropDown.getSelectedItem());
        try{
        ResultSet rs = compDir.getJobDescription(company,role);
        if(rs.next()){
        JobDescription.setText(rs.getString(1));
        JobDescription.setEditable(false);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JobsDropDownActionPerformed

    private void CompaniesDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompaniesDropDownActionPerformed
JobsDropDown.removeAllItems();
String company = String.valueOf( CompaniesDropDown.getSelectedItem());
 try { 
  ResultSet   compData = compDir.getJobsByCompany(company);
               while(compData.next()){
                JobsDropDown.addItem(compData.getString(1));
            }} catch (SQLException ex) {
           System.out.println(ex);
        }
    }//GEN-LAST:event_CompaniesDropDownActionPerformed
String comp,job,description,comments;
    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed
comp = String.valueOf(CompaniesDropDown.getSelectedItem());
job = String.valueOf(JobsDropDown.getSelectedItem());
comments = CommentsArea.getText();
String date = LocalDate.now().toString();
        try {
            PreparedStatement  st = (PreparedStatement) connection.prepareStatement("insert into applications(username,company_name,job_name,applied_date,status,comments) values(?,?,?,?,?,?)");
            st.setString(1,user);
            st.setString(2, company);
            st.setString(3, job);
            st.setString(4, date);
            st.setString(5, "Active");
            st.setString(6, comments);
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Application Successfully Submitted.");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        populateJobs();
    }//GEN-LAST:event_ApplyButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
 int selectedRowIndex = ApplicationsTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Application to Withdraw.....!");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
         String status  = String.valueOf(model.getValueAt(selectedRowIndex, 4));
         if(status.equals("Withdrawn")){
             JOptionPane.showMessageDialog(this, "Application Already Withdrawn.");
         }
         else{
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure to withdraw?","Yes",JOptionPane.YES_NO_OPTION);
        if(showConfirmDialog == 0){
         compDir.withdrawApplication(String.valueOf(model.getValueAt(selectedRowIndex, 0)));
        JOptionPane.showMessageDialog(this, "Application Withdrawn.");
        }
         }
        populateJobs();
    }//GEN-LAST:event_WithdrawButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApplicationsTable;
    private javax.swing.JButton ApplyButton;
    private javax.swing.JLabel BackgroundIMage;
    private javax.swing.JTextField CommentsArea;
    private javax.swing.JLabel CommentsLbl;
    private javax.swing.JComboBox<String> CompaniesDropDown;
    private javax.swing.JTextField JobDescription;
    private javax.swing.JComboBox<String> JobsDropDown;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
