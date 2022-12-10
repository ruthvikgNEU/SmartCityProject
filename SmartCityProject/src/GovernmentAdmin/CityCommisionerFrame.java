
package GovernmentAdmin;
import Directories.CityDirectory;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import smartcityproject.MainJFrame;

public class CityCommisionerFrame extends javax.swing.JFrame {

  Connection connection;
  String user;
  CityDirectory cityDir;
    public CityCommisionerFrame(Connection connection,String user,CityDirectory cityDir) {
        initComponents();
        this.connection = connection;
        this.user  = user;
        this.cityDir = cityDir;
        populateApplications();
        USernameLbl.setText(user);
    }

    private CityCommisionerFrame() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

  private void populateApplications(){
      
       DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
          try{
              ResultSet rs = cityDir.getAllApplications();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[7];
             row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
            row[5] = rs.getString(9);
              row[6] = (rs.getString(6)+","+rs.getString(7));
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
        LogoutButton = new javax.swing.JLabel();
        USernameLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ApplicationsTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        UpdateStatus = new javax.swing.JButton();
        ViewonMap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Hi!");

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-rounded-70.png"))); // NOI18N
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });

        USernameLbl.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        ApplicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Application Id", "Name", "Type", "Owner", "Location", "Application Status", "Co-Ordinates"
            }
        ));
        jScrollPane1.setViewportView(ApplicationsTable);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "In-review", "Approved", "Rejected" }));

        jLabel3.setText("Status :");

        UpdateStatus.setText("Update");
        UpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStatusActionPerformed(evt);
            }
        });

        ViewonMap.setText("View Location on Map");
        ViewonMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewonMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(USernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454)
                        .addComponent(LogoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(ViewonMap, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(UpdateStatus)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ViewonMap, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(UpdateStatus)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateStatusActionPerformed

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked

MainJFrame frame = new MainJFrame();
frame.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void ViewonMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewonMapActionPerformed
int index1 = ApplicationsTable.getSelectedRow();
        if (index1 < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Application....!");
            return;
        }
         DefaultTableModel model2 = (DefaultTableModel) ApplicationsTable.getModel();
        String cord  = String.valueOf(model2.getValueAt(index1, 6));
        System.out.println(cord);
        CityMapsFrame frame = new CityMapsFrame(cord);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }//GEN-LAST:event_ViewonMapActionPerformed

  
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
            java.util.logging.Logger.getLogger(CityCommisionerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityCommisionerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityCommisionerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityCommisionerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CityCommisionerFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApplicationsTable;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JLabel USernameLbl;
    private javax.swing.JButton UpdateStatus;
    private javax.swing.JButton ViewonMap;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
